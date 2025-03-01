package ru.lemoncraft.thalrathis.entity.armor;

import ru.lemoncraft.thalrathis.Thalrathis;
import ru.lemoncraft.thalrathis.common.item.armor.IceDragonPriestArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;

public class IceDragonPriestArmorModel extends DefaultedItemGeoModel<IceDragonPriestArmorItem> {
    public IceDragonPriestArmorModel()
    {
        super(new ResourceLocation(Thalrathis.MODID, ""));
    }

    @Override
    public ResourceLocation getModelResource(IceDragonPriestArmorItem object) {
        return new ResourceLocation(Thalrathis.MODID, "geo/ice_dragon_priest.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(IceDragonPriestArmorItem object) {
        return new ResourceLocation(Thalrathis.MODID, "textures/models/armor/ice_dragon_priest.png");
    }

    @Override
    public ResourceLocation getAnimationResource(IceDragonPriestArmorItem animatable) {
        return new ResourceLocation(Thalrathis.MODID, "animations/ice_dragon_priest.animation.json");
    }
}
