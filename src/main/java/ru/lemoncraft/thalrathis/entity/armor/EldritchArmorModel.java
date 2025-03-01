package ru.lemoncraft.thalrathis.entity.armor;

import ru.lemoncraft.thalrathis.Thalrathis;
import ru.lemoncraft.thalrathis.common.item.armor.EldritchArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;

public class EldritchArmorModel extends DefaultedItemGeoModel<EldritchArmorItem> {

    public EldritchArmorModel() {
        super(new ResourceLocation(Thalrathis.MODID, "armor/eldritch_armor"));
    }

    @Override
    public ResourceLocation getModelResource(EldritchArmorItem object) {
        return new ResourceLocation(Thalrathis.MODID, "geo/eldritch_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(EldritchArmorItem object) {
        return new ResourceLocation(Thalrathis.MODID, "textures/models/armor/eldritch_armor.png");
    }
    @Override
    public ResourceLocation getAnimationResource(EldritchArmorItem animatable) {
        return new ResourceLocation(Thalrathis.MODID, "animations/wizard_armor_animation.json");
    }
}