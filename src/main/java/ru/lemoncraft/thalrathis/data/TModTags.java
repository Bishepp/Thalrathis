package ru.lemoncraft.thalrathis.data;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.damagesource.DamageType;
import net.minecraft.world.item.Item;
import ru.lemoncraft.thalrathis.Thalrathis;

public class TModTags {
    public static final TagKey<Item> WIND_FOCUS = ItemTags.create(new ResourceLocation(Thalrathis.MODID, "wind_focus"));
    public static final TagKey<Item> WATER_FOCUS = ItemTags.create(new ResourceLocation(Thalrathis.MODID, "water_focus"));
    public static final TagKey<Item> LIGHT_FOCUS = ItemTags.create(new ResourceLocation(Thalrathis.MODID, "light_focus"));
    public static final TagKey<Item> DARK_FOCUS = ItemTags.create(new ResourceLocation(Thalrathis.MODID, "dark_focus"));
    public static final TagKey<Item> MIGHT_FOCUS = ItemTags.create(new ResourceLocation(Thalrathis.MODID, "might_focus"));
    public static final TagKey<Item> FINALITY_FOCUS = ItemTags.create(new ResourceLocation(Thalrathis.MODID, "finality_focus"));
    public static final TagKey<Item> NIHILITY_FOCUS = ItemTags.create(new ResourceLocation(Thalrathis.MODID, "nihility_focus"));

    private static TagKey<DamageType> create(String tag) {
        return TagKey.create(Registries.DAMAGE_TYPE, new ResourceLocation(Thalrathis.MODID, tag));
    }
}
