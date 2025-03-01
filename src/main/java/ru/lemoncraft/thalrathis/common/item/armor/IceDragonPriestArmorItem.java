package ru.lemoncraft.thalrathis.common.item.armor;

import io.redspace.ironsspellbooks.entity.armor.GenericCustomArmorRenderer;
import ru.lemoncraft.thalrathis.entity.armor.IceDragonPriestArmorModel;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class IceDragonPriestArmorItem extends ImbuableChestplateArmorItem {
    public IceDragonPriestArmorItem(Type type, Properties settings) {
        super(ExtendedArmorMaterials.ICE_DRAGON_PRIEST, type, settings);
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public GeoArmorRenderer<?> supplyRenderer() {
        return new GenericCustomArmorRenderer<>(new IceDragonPriestArmorModel());
    }
}
