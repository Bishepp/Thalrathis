package ru.lemoncraft.thalrathis.common.block.entity.client;

import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import ru.lemoncraft.thalrathis.common.block.entity.ChibiBisheppBlockEntity;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class ChibiBisheppBlockRenderer extends GeoBlockRenderer<ChibiBisheppBlockEntity> {
    public ChibiBisheppBlockRenderer(BlockEntityRendererProvider.Context context) {
        super(new ChibiBisheppBlockModel());
    }
}
