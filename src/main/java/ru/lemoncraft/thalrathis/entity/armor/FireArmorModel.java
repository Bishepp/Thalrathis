package ru.lemoncraft.thalrathis.entity.armor;

import ru.lemoncraft.thalrathis.Thalrathis;
import ru.lemoncraft.thalrathis.common.item.armor.FireArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;

public class FireArmorModel extends DefaultedItemGeoModel<FireArmorItem> {

    public FireArmorModel() {
        super(new ResourceLocation(Thalrathis.MODID, "armor/fire_armor"));
    }

    @Override
    public ResourceLocation getModelResource(FireArmorItem object) {
        return new ResourceLocation(Thalrathis.MODID, "geo/fire_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(FireArmorItem object) {
        return new ResourceLocation(Thalrathis.MODID, "textures/models/armor/fire_armor.png");
    }
    @Override
    public ResourceLocation getAnimationResource(FireArmorItem animatable) {
        return new ResourceLocation(Thalrathis.MODID, "animations/wizard_armor_animation.json");
    }
}