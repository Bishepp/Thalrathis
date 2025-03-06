package ru.lemoncraft.thalrathis.spells.air;

import io.redspace.ironsspellbooks.api.config.DefaultConfig;
import io.redspace.ironsspellbooks.api.magic.MagicData;
import io.redspace.ironsspellbooks.api.spells.AbstractSpell;
import io.redspace.ironsspellbooks.api.spells.CastSource;
import io.redspace.ironsspellbooks.api.spells.CastType;
import io.redspace.ironsspellbooks.api.spells.SpellRarity;
import io.redspace.ironsspellbooks.api.util.Utils;
import io.redspace.ironsspellbooks.capabilities.magic.MagicManager;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

import ru.lemoncraft.thalrathis.Thalrathis;
import ru.lemoncraft.thalrathis.data.TEntityTypeTags;
import ru.lemoncraft.thalrathis.registry.TSchoolRegistry;
import ru.lemoncraft.thalrathis.registry.TSoundRegistry;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class AirblastSpell extends AbstractSpell {
    @Override
    public List<MutableComponent> getUniqueInfo(int spellLevel, LivingEntity caster) {
        return List.of(
                Component.translatable("spell.thalrathis.airblast.max_range", getRadius(spellLevel)),
                Component.translatable("spell.thalrathis.airblast.degree_width", getArc(spellLevel)),
                Component.translatable("spell.thalrathis.airblast.deflection_power", Utils.stringTruncation(
                        100*getSpellPower(spellLevel, caster)/getSpellPower(1, null), 2)));
    }

    private static int getArc(int spellLevel) {
        return 20 + (5 * spellLevel);
    }

    private final DefaultConfig defaultConfig;
    @Override
    public ResourceLocation getSpellResource() {
        return Thalrathis.id("airblast");
    }

    @Override
    public DefaultConfig getDefaultConfig() {
        return defaultConfig;
    }
    public AirblastSpell() {
        this.defaultConfig = new DefaultConfig()
                .setCooldownSeconds(0.75)
                .setMaxLevel(5)
                .setSchoolResource(TSchoolRegistry.WIND_RESOURCE)
                .setMinRarity(SpellRarity.RARE)
                .build();
        this.manaCostPerLevel = 4;
        this.baseSpellPower = 5;
        this.spellPowerPerLevel = 1;
        this.castTime = 0;
        this.baseManaCost = 30;
    }
    @Override
    public CastType getCastType() {
        return CastType.INSTANT;
    }

    @Override
    public void onCast(Level level, int spellLevel, LivingEntity entity, CastSource castSource, MagicData playerMagicData) {
        level.getEntitiesOfClass(Projectile.class,
                        entity.getBoundingBox()
                                .inflate(getRadius(spellLevel)))
                .stream()
                .filter(proj -> proj.distanceTo(entity) < getRadius(spellLevel) &&
                        !Objects.equals(proj.getOwner(), entity) &&
                        canBeAirblasted(proj))
                .forEach(e -> {
                    Vec3 casterToProj = e.getPosition(0f).subtract(entity.getEyePosition()).normalize();
                    Vec3 casterLookAngle = entity.getLookAngle().normalize();
                    float projToLookAngleDeg = (float) Math.acos(casterToProj.dot(casterLookAngle)) * Mth.RAD_TO_DEG;
                    if (projToLookAngleDeg < getArc(spellLevel)) {
                        deflect(e, entity, spellLevel);
//				entity.playSound(AASounds.AIRBLAST_REDIRECT.get(), 0.5f, 1);
                    }
                });
        Vec3 particleLoc = entity.getEyePosition().add(entity.getLookAngle().scale(3));
        MagicManager.spawnParticles(level, ParticleTypes.POOF, particleLoc.x, particleLoc.y, particleLoc.z, 1, 0, 0, 0, 0.2, true);

        super.onCast(level, spellLevel, entity, castSource, playerMagicData);
    }

    static int getRadius(int spellLevel) {
        return 2 + spellLevel;
    }

    public void deflect(Projectile projectile, Entity deflector, int spellLevel) {
        if (deflector != null) {
            Vec3 vec3 = deflector.getLookAngle().normalize();
            if (deflector instanceof Player p) vec3 = vec3.scale(0.15*(this.getSpellPower(spellLevel, p)));
            projectile.setOwner(deflector);
            projectile.setDeltaMovement(vec3);
            projectile.hasImpulse = true;
        }
    }

    @Override
    public Optional<SoundEvent> getCastStartSound() {
        return Optional.of(TSoundRegistry.AIRBLAST_CAST.get());
    }
    @Override
    public Optional<SoundEvent> getCastFinishSound() {
        return Optional.empty();
    }
    public static boolean canBeAirblasted(Projectile p) {
        return !p.getType().is(TEntityTypeTags.REFLECTION_IMMUNE);
    }
}
