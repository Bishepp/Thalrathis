package ru.lemoncraft.thalrathis.common.block.entity.client;

import net.minecraft.resources.ResourceLocation;
import ru.lemoncraft.thalrathis.Thalrathis;
import ru.lemoncraft.thalrathis.common.block.entity.ChibiBisheppBlockEntity;
import software.bernie.geckolib.model.GeoModel;

public class ChibiBisheppBlockModel extends GeoModel<ChibiBisheppBlockEntity> {
    @Override
    public ResourceLocation getModelResource(ChibiBisheppBlockEntity animatable) {
        return new ResourceLocation(Thalrathis.MODID, "geo/chibi_bishepp.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ChibiBisheppBlockEntity animatable) {
        return new ResourceLocation(Thalrathis.MODID, "textures/block/chibi_bishepp.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ChibiBisheppBlockEntity animatable) {
        return new ResourceLocation(Thalrathis.MODID, "animations/chibi_bishepp.animation.json");
    }
}
