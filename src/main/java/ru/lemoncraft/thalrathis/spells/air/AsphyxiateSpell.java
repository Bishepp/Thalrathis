package ru.lemoncraft.thalrathis.spells.air;

import io.redspace.ironsspellbooks.api.config.*;
import io.redspace.ironsspellbooks.api.magic.*;
import io.redspace.ironsspellbooks.api.spells.*;
import io.redspace.ironsspellbooks.api.util.*;
import io.redspace.ironsspellbooks.capabilities.magic.*;

import net.minecraft.resources.*;
import net.minecraft.server.level.*;
import net.minecraft.sounds.*;
import net.minecraft.world.effect.*;
import net.minecraft.world.entity.*;
import net.minecraft.world.level.*;

import org.jetbrains.annotations.*;
import ru.lemoncraft.thalrathis.Thalrathis;
import ru.lemoncraft.thalrathis.data.TEntityTypeTags;
import ru.lemoncraft.thalrathis.registry.TSchoolRegistry;

import java.util.*;

public class AsphyxiateSpell extends AbstractSpell {
    private final DefaultConfig defaultConfig;
    @Override
    public ResourceLocation getSpellResource() {
        return Thalrathis.id("asphyxiate");
    }

    @Override
    public DefaultConfig getDefaultConfig() {
        return defaultConfig;
    }

    @Override
    public CastType getCastType() {
        return CastType.CONTINUOUS;
    }

    @Override
    public void onServerCastTick(Level level, int spellLevel, LivingEntity entity, @Nullable MagicData playerMagicData) {
        if (playerMagicData != null && playerMagicData.getAdditionalCastData() instanceof TargetEntityCastData && ((playerMagicData.getCastDurationRemaining()) % 10 == 0)) {
            var target = ((TargetEntityCastData) playerMagicData.getAdditionalCastData()).getTarget((ServerLevel) level);
            if (target != null) target.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, spellLevel-1));
            if (target != null) target.addEffect(new MobEffectInstance(MobEffects.HARM, 2, spellLevel-1));
        }
        super.onServerCastTick(level, spellLevel, entity, playerMagicData);
    }

    @Override
    public Optional<SoundEvent> getCastStartSound() {
        return Optional.of(SoundEvents.FIRE_EXTINGUISH);
    }

    @Override
    public Optional<SoundEvent> getCastFinishSound() {
        return Optional.of(SoundEvents.FIRE_EXTINGUISH);
    }

    @Override
    public boolean checkPreCastConditions(Level level, int spellLevel, LivingEntity entity, MagicData playerMagicData) {
        if (Utils.preCastTargetHelper(level, entity, playerMagicData, this, 15, .15f)) {
            var target = ((TargetEntityCastData) playerMagicData.getAdditionalCastData()).getTarget((ServerLevel) level);
            if (target == null || target.getType().is(TEntityTypeTags.ASPHYXIATION_IMMUNE)) {
                return false;
            }
            playerMagicData.setAdditionalCastData(new TargetEntityCastData(target));
            return true;
        } else {
            return false;
        }
    }

    public AsphyxiateSpell() {
        this.defaultConfig = (new DefaultConfig())
                .setMinRarity(SpellRarity.EPIC)
                .setSchoolResource(TSchoolRegistry.WIND_RESOURCE)
                .setMaxLevel(3)
                .setCooldownSeconds(20)
                .build();
        this.manaCostPerLevel = 3;
        this.baseSpellPower = 3;
        this.spellPowerPerLevel = 2;
        this.castTime = 100;
        this.baseManaCost = 9;
    }

    @Override
    public int getCastTime(int spellLevel) {
        return castTime + 100 * spellLevel;
    }
}
