package ru.lemoncraft.thalrathis.item.tools;

import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import ru.lemoncraft.thalrathis.registry.ItemRegistry;

import java.util.function.Supplier;

public enum ThalrathisTier implements Tier {
    NATURE(4, 10000, 40.0F, 5.0F, 15, () -> {
        return Ingredient.of(ItemRegistry.VERDALIS_SHARD.get());
    }),
    BLOOD(4, 10000, 40.0F, 5.0F, 15, () -> {
        return Ingredient.of(ItemRegistry.SANGUIS_SHARD.get());
    }),
    ENDER(4, 10000, 40.0F, 5.0F, 15, () -> {
        return Ingredient.of(ItemRegistry.TENEBRIS_SHARD.get());
    }),
    FIRE(4, 10000, 40.0F, 5.0F, 15, () -> {
        return Ingredient.of(ItemRegistry.FLAMARA_SHARD.get());
    }),
    VOCARIS(4, 10000, 40.0F, 5.0F, 15, () -> {
        return Ingredient.of(ItemRegistry.VOCARIS_SHARD.get());
    }),
    ELDRITCH(4, 10000, 40.0F, 5.0F, 15, () -> {
        return Ingredient.of(ItemRegistry.OBSCURUM_SHARD.get());
    }),
    SPARK(4, 10000, 40.0F, 5.0F, 15, () -> {
        return Ingredient.of(ItemRegistry.FULGARIS_SHARD.get());
    }),
    FINAL(10, 30000, 50.0F, 10.0F, 30, () -> {
        return Ingredient.of(ItemRegistry.FINALITY_SHARD.get());
    }),
    ICE(4, 10000, 40.0F, 5.0F, 15, () -> {
        return Ingredient.of(ItemRegistry.GELIDUS_SHARD.get());
    }),
    HOLY(4, 10000, 40.0F, 5.0F, 15, () -> {
        return Ingredient.of(ItemRegistry.SANCTARIS_SHARD.get());
    }),
    UNKNOW(4, 5000, 10.0F, 1.0F, 15, () -> {
        return Ingredient.of(Items.NETHERITE_INGOT);
    }),
    TEST(1, 1, 1.0F, 1.0F, 1, () -> {
        return Ingredient.of(Items.STICK);
    });

    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    ThalrathisTier(int level, int durability, float miningSpeed, float damage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.level = level;
        this.uses = durability;
        this.speed = miningSpeed;
        this.damage = damage;
        this.enchantmentValue = enchantability;
        this.repairIngredient = new LazyLoadedValue<>(repairIngredient);
    }

    public int getUses() {
        return this.uses;
    }

    public float getSpeed() {
        return this.speed;
    }

    public float getAttackDamageBonus() {
        return this.damage;
    }

    public int getLevel() {
        return this.level;
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}