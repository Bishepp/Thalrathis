package ru.lemoncraft.thalrathis.entity.armor;

import ru.lemoncraft.thalrathis.Thalrathis;
import ru.lemoncraft.thalrathis.common.item.armor.FinalityArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;

public class FinalityArmorModel extends DefaultedItemGeoModel<FinalityArmorItem> {

    public FinalityArmorModel() {
        super(new ResourceLocation(Thalrathis.MODID, "armor/finality_armor"));
    }

    @Override
    public ResourceLocation getModelResource(FinalityArmorItem object) {
        return new ResourceLocation(Thalrathis.MODID, "geo/finality_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(FinalityArmorItem object) {
        return new ResourceLocation(Thalrathis.MODID, "textures/models/armor/finality_armor.png");
    }
    @Override
    public ResourceLocation getAnimationResource(FinalityArmorItem animatable) {
        return new ResourceLocation(Thalrathis.MODID, "animations/wizard_armor_animation.json");
    }
}