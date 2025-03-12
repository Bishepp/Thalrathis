package ru.lemoncraft.thalrathis.common.block.entity.client;

import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import ru.lemoncraft.thalrathis.common.block.entity.ChibiLemonBlockEntity;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class ChibiLemonBlockRenderer extends GeoBlockRenderer<ChibiLemonBlockEntity> {
    public ChibiLemonBlockRenderer(BlockEntityRendererProvider.Context context) {
        super(new ChibiLemonBlockModel());
    }
}
