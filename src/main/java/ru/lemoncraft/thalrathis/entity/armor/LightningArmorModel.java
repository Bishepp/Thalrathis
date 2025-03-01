package ru.lemoncraft.thalrathis.entity.armor;

import ru.lemoncraft.thalrathis.Thalrathis;
import ru.lemoncraft.thalrathis.common.item.armor.LightningArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;

public class LightningArmorModel extends DefaultedItemGeoModel<LightningArmorItem> {

    public LightningArmorModel() {
        super(new ResourceLocation(Thalrathis.MODID, "armor/lightning_armor"));
    }

    @Override
    public ResourceLocation getModelResource(LightningArmorItem object) {
        return new ResourceLocation(Thalrathis.MODID, "geo/lightning_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(LightningArmorItem object) {
        return new ResourceLocation(Thalrathis.MODID, "textures/models/armor/lightning_armor.png");
    }
    @Override
    public ResourceLocation getAnimationResource(LightningArmorItem animatable) {
        return new ResourceLocation(Thalrathis.MODID, "animations/wizard_armor_animation.json");
    }
}