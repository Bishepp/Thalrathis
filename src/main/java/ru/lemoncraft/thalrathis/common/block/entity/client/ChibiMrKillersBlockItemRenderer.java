package ru.lemoncraft.thalrathis.common.block.entity.client;

import ru.lemoncraft.thalrathis.common.item.custom.ChibiMrKillersBlockItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class ChibiMrKillersBlockItemRenderer extends GeoItemRenderer<ChibiMrKillersBlockItem> {
    public ChibiMrKillersBlockItemRenderer() {
        super(new ChibiMrKillersBlockItemModel());
    }
}
