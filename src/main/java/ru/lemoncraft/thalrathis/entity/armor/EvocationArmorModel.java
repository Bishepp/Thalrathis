package ru.lemoncraft.thalrathis.entity.armor;

import net.minecraft.resources.ResourceLocation;
import ru.lemoncraft.thalrathis.Thalrathis;
import ru.lemoncraft.thalrathis.common.item.armor.EvocationArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;

public class EvocationArmorModel extends DefaultedItemGeoModel<EvocationArmorItem> {

    public EvocationArmorModel() {
        super(new ResourceLocation(Thalrathis.MODID, "armor/evocation_armor"));
    }

    @Override
    public ResourceLocation getModelResource(EvocationArmorItem object) {
        return new ResourceLocation(Thalrathis.MODID, "geo/evocation_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(EvocationArmorItem object) {
        return new ResourceLocation(Thalrathis.MODID, "textures/models/armor/evocation_armor.png");
    }
    @Override
    public ResourceLocation getAnimationResource(EvocationArmorItem animatable) {
        return new ResourceLocation(Thalrathis.MODID, "animations/wizard_armor_animation.json");
    }
}
