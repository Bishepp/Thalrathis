package ru.lemoncraft.thalrathis.entity.armor;

import ru.lemoncraft.thalrathis.Thalrathis;
import ru.lemoncraft.thalrathis.common.item.armor.IceArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;

public class IceArmorModel extends DefaultedItemGeoModel<IceArmorItem> {

    public IceArmorModel() {
        super(new ResourceLocation(Thalrathis.MODID, "armor/ice_armor"));
    }

    @Override
    public ResourceLocation getModelResource(IceArmorItem object) {
        return new ResourceLocation(Thalrathis.MODID, "geo/ice_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(IceArmorItem object) {
        return new ResourceLocation(Thalrathis.MODID, "textures/models/armor/ice_armor.png");
    }
    @Override
    public ResourceLocation getAnimationResource(IceArmorItem animatable) {
        return new ResourceLocation(Thalrathis.MODID, "animations/wizard_armor_animation.json");
    }
}