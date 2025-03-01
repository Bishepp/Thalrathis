package ru.lemoncraft.thalrathis.common.item.armor;

import net.minecraft.world.item.ArmorItem;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import ru.lemoncraft.thalrathis.entity.armor.GenericCustomArmorRenderer;
import ru.lemoncraft.thalrathis.entity.armor.NatureArmorModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class NatureArmorItem extends ImbuableChestplateArmorItem{
    public NatureArmorItem(ArmorItem.Type slot, Properties settings) {
        super(ExtendedArmorMaterials.NATURE, slot, settings);
    }
    @Override
    @OnlyIn(Dist.CLIENT)
    public GeoArmorRenderer<?> supplyRenderer() {
        return new GenericCustomArmorRenderer<>(new NatureArmorModel() );
    }
}
