package ru.lemoncraft.thalrathis.data.damage;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.damagesource.DamageScaling;
import net.minecraft.world.damagesource.DamageType;
import ru.lemoncraft.thalrathis.Thalrathis;

public class TDamageTypes {
    public static ResourceKey<DamageType> register(String name) {
        return ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation(Thalrathis.MODID, name));
    }

    // Spell School Related
    public static final ResourceKey<DamageType> WIND_MAGIC = register("wind_magic");
    public static final ResourceKey<DamageType> WATER_MAGIC = register("water_magic");
    public static final ResourceKey<DamageType> DARK_MAGIC = register("dark_magic");
    public static final ResourceKey<DamageType> LIGHT_MAGIC = register("light_magic");
    public static final ResourceKey<DamageType> MIGHT_MAGIC = register("might_magic");
    public static final ResourceKey<DamageType> FINALITY_MAGIC = register("finality_magic");
    public static final ResourceKey<DamageType> NIHILITY_MAGIC = register("nihility_magic");

    public static void bootstrap(BootstapContext<DamageType> context) {
        context.register(WIND_MAGIC, new DamageType(WIND_MAGIC.location().getPath(), DamageScaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER, 0f));
        context.register(WATER_MAGIC, new DamageType(WATER_MAGIC.location().getPath(), DamageScaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER, 0f));
        context.register(DARK_MAGIC, new DamageType(DARK_MAGIC.location().getPath(), DamageScaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER, 0f));
        context.register(LIGHT_MAGIC, new DamageType(LIGHT_MAGIC.location().getPath(), DamageScaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER, 0f));
        context.register(MIGHT_MAGIC, new DamageType(MIGHT_MAGIC.location().getPath(), DamageScaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER, 0f));
        context.register(FINALITY_MAGIC, new DamageType(FINALITY_MAGIC.location().getPath(), DamageScaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER, 0f));
        context.register(NIHILITY_MAGIC, new DamageType(NIHILITY_MAGIC.location().getPath(), DamageScaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER, 0f));
    }
}