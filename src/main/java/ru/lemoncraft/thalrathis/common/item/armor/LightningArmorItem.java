package ru.lemoncraft.thalrathis.common.item.armor;

import ru.lemoncraft.thalrathis.entity.armor.LightningArmorModel;
import ru.lemoncraft.thalrathis.entity.armor.GenericCustomArmorRenderer;
import net.minecraft.world.item.ArmorItem;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class LightningArmorItem extends ImbuableChestplateArmorItem{
    public LightningArmorItem(ArmorItem.Type slot, Properties settings) {
        super(ExtendedArmorMaterials.LIGHTNING, slot, settings);
    }
    @Override
    @OnlyIn(Dist.CLIENT)
    public GeoArmorRenderer<?> supplyRenderer() {
        return new GenericCustomArmorRenderer<>(new LightningArmorModel() );
    }
}