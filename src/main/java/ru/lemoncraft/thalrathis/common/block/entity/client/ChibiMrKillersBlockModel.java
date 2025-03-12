package ru.lemoncraft.thalrathis.common.block.entity.client;

import net.minecraft.resources.ResourceLocation;
import ru.lemoncraft.thalrathis.Thalrathis;
import ru.lemoncraft.thalrathis.common.block.entity.ChibiMrKillersBlockEntity;
import software.bernie.geckolib.model.GeoModel;

public class ChibiMrKillersBlockModel extends GeoModel<ChibiMrKillersBlockEntity> {
    @Override
    public ResourceLocation getModelResource(ChibiMrKillersBlockEntity animatable) {
        return new ResourceLocation(Thalrathis.MODID, "geo/chibi_mrkillers.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ChibiMrKillersBlockEntity animatable) {
        return new ResourceLocation(Thalrathis.MODID, "textures/block/chibi_mrkillers.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ChibiMrKillersBlockEntity animatable) {
        return new ResourceLocation(Thalrathis.MODID, "animations/chibi_mrkillers.animation.json");
    }
}
