package ru.lemoncraft.thalrathis.spells.air;

import io.redspace.ironsspellbooks.api.config.*;
import io.redspace.ironsspellbooks.api.magic.*;
import io.redspace.ironsspellbooks.api.spells.*;
import io.redspace.ironsspellbooks.capabilities.magic.*;

import net.minecraft.core.particles.*;
import net.minecraft.network.chat.*;
import net.minecraft.resources.*;
import net.minecraft.util.*;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.*;
import net.minecraft.world.level.*;
import net.minecraft.world.phys.*;

import org.jetbrains.annotations.*;


import ru.lemoncraft.thalrathis.Thalrathis;
import ru.lemoncraft.thalrathis.registry.*;

import java.util.List;

public class AirstepSpell extends AbstractSpell {
    private final DefaultConfig defaultConfig;
    @Override
    public ResourceLocation getSpellResource() {
        return Thalrathis.id("airstep");
    }

    @Override
    public List<MutableComponent> getUniqueInfo(int spellLevel, LivingEntity caster) {
        return List.of(Component.translatable("spell.thalrathis.airstep.max_jumps", spellLevel));
    }

    public AirstepSpell() {
        this.defaultConfig = (new DefaultConfig())
                .setMinRarity(SpellRarity.RARE)
                .setSchoolResource(TSchoolRegistry.WIND_RESOURCE)
                .setMaxLevel(7)
                .setCooldownSeconds(6)
                .build();
        this.manaCostPerLevel = 7;
        this.baseSpellPower = 1;
        this.spellPowerPerLevel = 1;
        this.castTime = 0;
        this.baseManaCost = 40;
    }

    @Override
    public DefaultConfig getDefaultConfig() {
        return defaultConfig;
    }

    @Override
    public SchoolType getSchoolType() {
        return TSchoolRegistry.WIND.get();
    }

    @Override
    public CastType getCastType() {
        return CastType.INSTANT;
    }

    @Override
    public int getRecastCount(int spellLevel, @Nullable LivingEntity entity) {
        return 1+spellLevel;
    }

    @Override
    public boolean checkPreCastConditions(Level level, int spellLevel, LivingEntity entity, MagicData playerMagicData) {
        return !(entity.isFallFlying() || entity.isInWaterOrBubble());
    }

    @Override
    public void onClientCast(Level level, int spellLevel, LivingEntity entity, ICastData castData) {
        if (castData instanceof ImpulseCastData data) {
            entity.hasImpulse = data.hasImpulse;
            double y = Math.max(entity.getDeltaMovement().y, data.y);
            entity.setDeltaMovement(data.x, y, data.z);
        }
        super.onClientCast(level, spellLevel, entity, castData);
    }
    @Override
    public ICastDataSerializable getEmptyCastData() {
        return new ImpulseCastData();
    }

    @Override
    public void onCast(Level level, int spellLevel, LivingEntity entity, CastSource castSource, MagicData playerMagicData) {
        if (!playerMagicData.getPlayerRecasts().hasRecastForSpell(getSpellId())) {
            playerMagicData.getPlayerRecasts().addRecast(new RecastInstance(getSpellId(), spellLevel, getRecastCount(spellLevel, entity), 80, castSource, null), playerMagicData);
        }
        Vec3 motion = new Vec3(0, entity.getAttributeValue(Attributes.JUMP_STRENGTH) + entity.getJumpBoostPower() + 0.02*getSpellPower(spellLevel, entity), 0);
        Vec3 angle = entity.getLookAngle();
        motion = angle.scale(Mth.invSqrt(angle.x*angle.x + angle.z*angle.z + 0.01f)).multiply(0.45 + 0.02*getSpellPower(spellLevel, entity), 0, 0.45 + 0.02*getSpellPower(spellLevel, entity)).add(motion);
        playerMagicData.setAdditionalCastData(new ImpulseCastData((float) motion.x, (float) motion.y, (float) motion.z, true));
        entity.setDeltaMovement(motion);
        MagicManager.spawnParticles(level, ParticleTypes.SPIT, entity.getX(), entity.getY(), entity.getZ(), 10, 0.2, 0, 0.2, 0.3, true);
        entity.hasImpulse = true;
        super.onCast(level, spellLevel, entity, castSource, playerMagicData);
    }
}
