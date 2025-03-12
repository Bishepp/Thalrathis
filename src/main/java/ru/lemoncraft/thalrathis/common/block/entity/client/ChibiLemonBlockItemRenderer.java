package ru.lemoncraft.thalrathis.common.block.entity.client;

import ru.lemoncraft.thalrathis.common.item.custom.ChibiLemonBlockItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class ChibiLemonBlockItemRenderer extends GeoItemRenderer<ChibiLemonBlockItem> {
    public ChibiLemonBlockItemRenderer() {
        super(new ChibiLemonBlockItemModel());
    }
}
