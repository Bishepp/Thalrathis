package ru.lemoncraft.thalrathis.common.item.armor;

import net.minecraft.world.item.ArmorItem;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import ru.lemoncraft.thalrathis.entity.armor.HolyArmorModel;
import ru.lemoncraft.thalrathis.entity.armor.GenericCustomArmorRenderer;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class HolyArmorItem extends ImbuableChestplateArmorItem{
    public HolyArmorItem(ArmorItem.Type slot, Properties settings) {
        super(ExtendedArmorMaterials.HOLY, slot, settings);
    }
    @Override
    @OnlyIn(Dist.CLIENT)
    public GeoArmorRenderer<?> supplyRenderer() {
        return new GenericCustomArmorRenderer<>(new HolyArmorModel() );
    }
}
