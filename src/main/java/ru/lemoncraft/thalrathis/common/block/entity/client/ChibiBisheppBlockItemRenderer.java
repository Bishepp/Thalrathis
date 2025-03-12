package ru.lemoncraft.thalrathis.common.block.entity.client;

import ru.lemoncraft.thalrathis.common.item.custom.ChibiBisheppBlockItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class ChibiBisheppBlockItemRenderer extends GeoItemRenderer<ChibiBisheppBlockItem> {
    public ChibiBisheppBlockItemRenderer() {
        super(new ChibiBisheppBlockItemModel());
    }
}
