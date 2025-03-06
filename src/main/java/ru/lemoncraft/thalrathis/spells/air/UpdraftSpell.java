package ru.lemoncraft.thalrathis.spells.air;

import io.redspace.ironsspellbooks.api.config.DefaultConfig;
import io.redspace.ironsspellbooks.api.magic.MagicData;
import io.redspace.ironsspellbooks.api.spells.*;
import io.redspace.ironsspellbooks.api.util.Utils;
import io.redspace.ironsspellbooks.capabilities.magic.*;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;
import ru.lemoncraft.thalrathis.Thalrathis;
import ru.lemoncraft.thalrathis.registry.TSchoolRegistry;
import ru.lemoncraft.thalrathis.registry.TSpellRegistry;

import java.util.List;

public class UpdraftSpell extends AbstractSpell {
    private final DefaultConfig defaultConfig;

    @Override
    public List<MutableComponent> getUniqueInfo(int spellLevel, LivingEntity caster) {
        return List.of(
                Component.translatable("ui.thalrathis.stun_duration", Utils.stringTruncation(getStunDuration(spellLevel) / 20f, 2)),
                Component.translatable("ui.irons_spellbooks.max_victims", this.getRecastCount(spellLevel, caster)));
    }

    public UpdraftSpell() {
        this.defaultConfig = (new DefaultConfig())
                .setMinRarity(SpellRarity.RARE)
                .setSchoolResource(TSchoolRegistry.WIND_RESOURCE)
                .setMaxLevel(7)
                .setCooldownSeconds(30)
                .build();
        this.manaCostPerLevel = 20;
        this.baseSpellPower = 3;
        this.spellPowerPerLevel = 2;
        this.castTime = 0;
        this.baseManaCost = 80;
    }
    @Override
    public ResourceLocation getSpellResource() {
        return Thalrathis.id("updraft");
    }

    @Override
    public DefaultConfig getDefaultConfig() {
        return defaultConfig;
    }

    @Override
    public CastType getCastType() {
        return CastType.INSTANT;
    }

    @Override
    public int getRecastCount(int spellLevel, @Nullable LivingEntity entity) {
        return 2 + spellLevel;
    }

    @Override
    public boolean checkPreCastConditions(Level level, int spellLevel, LivingEntity entity, MagicData playerMagicData) {
        boolean b = Utils.preCastTargetHelper(level, entity, playerMagicData, this, 64, 0.15F);
        if (b) {
            ICastData var7 = playerMagicData.getAdditionalCastData();
            if (var7 instanceof TargetEntityCastData targetEntityCastData) {
                PlayerRecasts recasts = playerMagicData.getPlayerRecasts();
                if (recasts.hasRecastForSpell(this.getSpellId())) {
                    RecastInstance instance = recasts.getRecastInstance(this.getSpellId());
                    if (instance != null) {
                        ICastDataSerializable var10 = instance.getCastData();
                        if (var10 instanceof MultiTargetEntityCastData targetingData) {
                            if (targetingData.getTargets().contains(targetEntityCastData.getTargetUUID())) return false;
                        }
                    }
                }
            }
        }
        return b;
    }

    @Override
    public void onCast(Level level, int spellLevel, LivingEntity entity, CastSource castSource, MagicData playerMagicData) {
        ICastData var7 = playerMagicData.getAdditionalCastData();
        if (var7 instanceof TargetEntityCastData targetEntityCastData) {
            PlayerRecasts recasts = playerMagicData.getPlayerRecasts();
            if (!recasts.hasRecastForSpell(this.getSpellId())) {
                recasts.addRecast(new RecastInstance(this.getSpellId(), spellLevel, this.getRecastCount(spellLevel, entity), 80, castSource, new MultiTargetEntityCastData(targetEntityCastData.getTarget((ServerLevel)level))), playerMagicData);
            } else {
                RecastInstance instance = recasts.getRecastInstance(this.getSpellId());
                if (instance != null) {
                    ICastDataSerializable var10 = instance.getCastData();
                    if (var10 instanceof MultiTargetEntityCastData targetingData) {
                        targetingData.addTarget(targetEntityCastData.getTargetUUID());
                    }
                }
            }
        }

        super.onCast(level, spellLevel, entity, castSource, playerMagicData);
    }

    @Override
    public void onRecastFinished(ServerPlayer serverPlayer, RecastInstance recastInstance, RecastResult recastResult, ICastDataSerializable castDataSerializable) {
        super.onRecastFinished(serverPlayer, recastInstance, recastResult, castDataSerializable);
        Level level = serverPlayer.level();
        Vec3 origin = serverPlayer.getEyePosition().add(serverPlayer.getForward().normalize().scale(0.20000000298023224));
        if (castDataSerializable instanceof MultiTargetEntityCastData targetingData) {
            targetingData.getTargets().forEach((uuid) -> {
                LivingEntity target = (LivingEntity)((ServerLevel)serverPlayer.level()).getEntity(uuid);
                if (target != null) {
                    target.addDeltaMovement(new Vec3(0, 0.9d, 0));
                    target.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 100, 3));
                    UpdraftEntity updraft = new UpdraftEntity(TSpellRegistry.UPDRAFT_VISUAL_ENTITY.get(), level);
                    updraft.setPos(target.getPosition(0.2f));
                    updraft.tick();
                    level.addFreshEntity(updraft);
                }
            });
        }

    }
    @Override
    public ICastDataSerializable getEmptyCastData() {
        return new MultiTargetEntityCastData();
    }
    public static int getStunDuration(int spellLevel) {
        return 100 + (20*spellLevel);
    }
}
