package ru.lemoncraft.thalrathis.entity.armor;

import ru.lemoncraft.thalrathis.Thalrathis;
import ru.lemoncraft.thalrathis.common.item.armor.BloodArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;

public class BloodArmorModel extends DefaultedItemGeoModel<BloodArmorItem> {

    public BloodArmorModel() {
        super(new ResourceLocation(Thalrathis.MODID, "armor/blood_armor"));
    }

    @Override
    public ResourceLocation getModelResource(BloodArmorItem object) {
        return new ResourceLocation(Thalrathis.MODID, "geo/blood_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BloodArmorItem object) {
        return new ResourceLocation(Thalrathis.MODID, "textures/models/armor/blood_armor.png");
    }
    @Override
    public ResourceLocation getAnimationResource(BloodArmorItem animatable) {
        return new ResourceLocation(Thalrathis.MODID, "animations/wizard_armor_animation.json");
    }
}