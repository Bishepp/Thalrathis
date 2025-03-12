package ru.lemoncraft.thalrathis.common.block.entity.client;

import net.minecraft.resources.ResourceLocation;
import ru.lemoncraft.thalrathis.Thalrathis;
import ru.lemoncraft.thalrathis.common.item.custom.ChibiLemonBlockItem;
import software.bernie.geckolib.model.GeoModel;

public class ChibiLemonBlockItemModel extends GeoModel<ChibiLemonBlockItem> {
    @Override
    public ResourceLocation getModelResource(ChibiLemonBlockItem animatable) {
        return new ResourceLocation(Thalrathis.MODID, "geo/chibi_lemon.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ChibiLemonBlockItem animatable) {
        return new ResourceLocation(Thalrathis.MODID, "textures/block/chibi_lemon.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ChibiLemonBlockItem animatable) {
        return new ResourceLocation(Thalrathis.MODID, "animations/chibi_lemon.animation.json");
    }
}
