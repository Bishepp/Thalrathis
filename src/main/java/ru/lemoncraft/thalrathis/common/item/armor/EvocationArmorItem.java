package ru.lemoncraft.thalrathis.common.item.armor;

import net.minecraft.world.item.ArmorItem;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import ru.lemoncraft.thalrathis.entity.armor.EvocationArmorModel;
import ru.lemoncraft.thalrathis.entity.armor.GenericCustomArmorRenderer;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class EvocationArmorItem extends ImbuableChestplateArmorItem{
    public EvocationArmorItem(ArmorItem.Type slot, Properties settings) {
        super(ExtendedArmorMaterials.EVOCATION, slot, settings);
    }
    @Override
    @OnlyIn(Dist.CLIENT)
    public GeoArmorRenderer<?> supplyRenderer() {
        return new GenericCustomArmorRenderer<>(new EvocationArmorModel() );
    }
}