package ru.lemoncraft.thalrathis.common.block.entity.client;

import net.minecraft.resources.ResourceLocation;
import ru.lemoncraft.thalrathis.Thalrathis;
import ru.lemoncraft.thalrathis.common.item.custom.ChibiBisheppBlockItem;
import software.bernie.geckolib.model.GeoModel;

public class ChibiBisheppBlockItemModel extends GeoModel<ChibiBisheppBlockItem> {
    @Override
    public ResourceLocation getModelResource(ChibiBisheppBlockItem animatable) {
        return new ResourceLocation(Thalrathis.MODID, "geo/chibi_bishepp.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ChibiBisheppBlockItem animatable) {
        return new ResourceLocation(Thalrathis.MODID, "textures/block/chibi_bishepp.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ChibiBisheppBlockItem animatable) {
        return new ResourceLocation(Thalrathis.MODID, "animations/chibi_bishepp.animation.json");
    }
}
