package ru.lemoncraft.thalrathis.entity.armor;

import net.minecraft.resources.ResourceLocation;
import ru.lemoncraft.thalrathis.Thalrathis;
import ru.lemoncraft.thalrathis.common.item.armor.HolyArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;

public class HolyArmorModel extends DefaultedItemGeoModel<HolyArmorItem> {

    public HolyArmorModel() {
        super(new ResourceLocation(Thalrathis.MODID, "armor/holy_armor"));
    }

    @Override
    public ResourceLocation getModelResource(HolyArmorItem object) {
        return new ResourceLocation(Thalrathis.MODID, "geo/holy_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(HolyArmorItem object) {
        return new ResourceLocation(Thalrathis.MODID, "textures/models/armor/holy_armor.png");
    }
    @Override
    public ResourceLocation getAnimationResource(HolyArmorItem animatable) {
        return new ResourceLocation(Thalrathis.MODID, "animations/wizard_armor_animation.json");
    }
}
