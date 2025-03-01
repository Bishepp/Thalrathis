package ru.lemoncraft.thalrathis.entity.armor;

import ru.lemoncraft.thalrathis.Thalrathis;
import ru.lemoncraft.thalrathis.common.item.armor.FireDragonPriestArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;

public class FireDragonPriestArmorModel extends DefaultedItemGeoModel<FireDragonPriestArmorItem> {
    public FireDragonPriestArmorModel()
    {
        super(new ResourceLocation(Thalrathis.MODID, ""));
    }

    @Override
    public ResourceLocation getModelResource(FireDragonPriestArmorItem object) {
        return new ResourceLocation(Thalrathis.MODID, "geo/fire_dragon_priest.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(FireDragonPriestArmorItem object) {
        return new ResourceLocation(Thalrathis.MODID, "textures/models/armor/fire_dragon_priest.png");
    }

    @Override
    public ResourceLocation getAnimationResource(FireDragonPriestArmorItem animatable) {
        return new ResourceLocation(Thalrathis.MODID, "animations/fire_dragon_priest.animation.json");
    }
}
