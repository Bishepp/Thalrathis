package ru.lemoncraft.thalrathis.common.item.armor;

import ru.lemoncraft.thalrathis.entity.armor.EldritchArmorModel;
import ru.lemoncraft.thalrathis.entity.armor.GenericCustomArmorRenderer;
import net.minecraft.world.item.ArmorItem;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class EldritchArmorItem extends ImbuableChestplateArmorItem{
    public EldritchArmorItem(ArmorItem.Type slot, Properties settings) {
        super(ExtendedArmorMaterials.ELDRITCH, slot, settings);
    }
    @Override
    @OnlyIn(Dist.CLIENT)
    public GeoArmorRenderer<?> supplyRenderer() {
        return new GenericCustomArmorRenderer<>(new EldritchArmorModel() );
    }
}