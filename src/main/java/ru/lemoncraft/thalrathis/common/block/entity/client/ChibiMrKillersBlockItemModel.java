package ru.lemoncraft.thalrathis.common.block.entity.client;

import net.minecraft.resources.ResourceLocation;
import ru.lemoncraft.thalrathis.Thalrathis;
import ru.lemoncraft.thalrathis.common.item.custom.ChibiMrKillersBlockItem;
import software.bernie.geckolib.model.GeoModel;

public class ChibiMrKillersBlockItemModel extends GeoModel<ChibiMrKillersBlockItem> {
    @Override
    public ResourceLocation getModelResource(ChibiMrKillersBlockItem animatable) {
        return new ResourceLocation(Thalrathis.MODID, "geo/chibi_mrkillers.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ChibiMrKillersBlockItem animatable) {
        return new ResourceLocation(Thalrathis.MODID, "textures/block/chibi_mrkillers.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ChibiMrKillersBlockItem animatable) {
        return new ResourceLocation(Thalrathis.MODID, "animations/chibi_mrkillers.animation.json");
    }
}
