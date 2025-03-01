package ru.lemoncraft.thalrathis.entity.armor;

import ru.lemoncraft.thalrathis.Thalrathis;
import ru.lemoncraft.thalrathis.common.item.armor.EnderArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;

public class EnderArmorModel extends DefaultedItemGeoModel<EnderArmorItem> {

    public EnderArmorModel() {
        super(new ResourceLocation(Thalrathis.MODID, "armor/ender_armor"));
    }

    @Override
    public ResourceLocation getModelResource(EnderArmorItem object) {
        return new ResourceLocation(Thalrathis.MODID, "geo/ender_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(EnderArmorItem object) {
        return new ResourceLocation(Thalrathis.MODID, "textures/models/armor/ender_armor.png");
    }
    @Override
    public ResourceLocation getAnimationResource(EnderArmorItem animatable) {
        return new ResourceLocation(Thalrathis.MODID, "animations/wizard_armor_animation.json");
    }
}