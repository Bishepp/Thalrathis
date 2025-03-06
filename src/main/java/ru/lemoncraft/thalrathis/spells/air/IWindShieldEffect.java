package ru.lemoncraft.thalrathis.spells.air;

import net.minecraft.world.entity.LivingEntity;

public interface IWindShieldEffect {
    void onEffectRemoved(LivingEntity pLivingEntity, int pAmplifier);

    void onEffectAdded(LivingEntity pLivingEntity, int pAmplifier);
}
