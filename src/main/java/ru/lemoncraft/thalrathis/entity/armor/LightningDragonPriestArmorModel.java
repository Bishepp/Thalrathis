package ru.lemoncraft.thalrathis.entity.armor;

import ru.lemoncraft.thalrathis.Thalrathis;
import ru.lemoncraft.thalrathis.common.item.armor.LightningDragonPriestArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;

public class LightningDragonPriestArmorModel extends DefaultedItemGeoModel<LightningDragonPriestArmorItem> {
    public LightningDragonPriestArmorModel()
    {
        super(new ResourceLocation(Thalrathis.MODID, ""));
    }

    @Override
    public ResourceLocation getModelResource(LightningDragonPriestArmorItem object) {
        return new ResourceLocation(Thalrathis.MODID, "geo/lightning_dragon_priest.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(LightningDragonPriestArmorItem object) {
        return new ResourceLocation(Thalrathis.MODID, "textures/models/armor/lightning_dragon_priest.png");
    }

    @Override
    public ResourceLocation getAnimationResource(LightningDragonPriestArmorItem animatable) {
        return new ResourceLocation(Thalrathis.MODID, "animations/lightning_dragon_priest.animation.json");
    }
}
