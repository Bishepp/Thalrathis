package ru.lemoncraft.thalrathis.entity.armor;

import net.minecraft.resources.ResourceLocation;
import ru.lemoncraft.thalrathis.Thalrathis;
import ru.lemoncraft.thalrathis.common.item.armor.NatureArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;

public class NatureArmorModel extends DefaultedItemGeoModel<NatureArmorItem> {

    public NatureArmorModel() {
        super(new ResourceLocation(Thalrathis.MODID, "armor/nature_armor"));
    }

    @Override
    public ResourceLocation getModelResource(NatureArmorItem object) {
        return new ResourceLocation(Thalrathis.MODID, "geo/nature_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(NatureArmorItem object) {
        return new ResourceLocation(Thalrathis.MODID, "textures/models/armor/nature_armor.png");
    }
    @Override
    public ResourceLocation getAnimationResource(NatureArmorItem animatable) {
        return new ResourceLocation(Thalrathis.MODID, "animations/wizard_armor_animation.json");
    }
}
