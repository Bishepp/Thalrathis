package ru.lemoncraft.thalrathis.common.block.entity.client;

import net.minecraft.resources.ResourceLocation;
import ru.lemoncraft.thalrathis.Thalrathis;
import ru.lemoncraft.thalrathis.common.block.entity.ChibiLemonBlockEntity;
import software.bernie.geckolib.model.GeoModel;

public class ChibiLemonBlockModel extends GeoModel<ChibiLemonBlockEntity> {
    @Override
    public ResourceLocation getModelResource(ChibiLemonBlockEntity animatable) {
        return new ResourceLocation(Thalrathis.MODID, "geo/chibi_lemon.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ChibiLemonBlockEntity animatable) {
        return new ResourceLocation(Thalrathis.MODID, "textures/block/chibi_lemon.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ChibiLemonBlockEntity animatable) {
        return new ResourceLocation(Thalrathis.MODID, "animations/chibi_lemon.animation.json");
    }
}
