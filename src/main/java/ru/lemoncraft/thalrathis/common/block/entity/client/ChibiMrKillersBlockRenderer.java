package ru.lemoncraft.thalrathis.common.block.entity.client;

import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import ru.lemoncraft.thalrathis.common.block.entity.ChibiMrKillersBlockEntity;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class ChibiMrKillersBlockRenderer extends GeoBlockRenderer<ChibiMrKillersBlockEntity> {
    public ChibiMrKillersBlockRenderer(BlockEntityRendererProvider.Context context) {
        super(new ChibiMrKillersBlockModel());
    }
}
