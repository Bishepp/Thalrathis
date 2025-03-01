package ru.lemoncraft.thalrathis.common.item.armor;

import io.redspace.ironsspellbooks.entity.armor.GenericCustomArmorRenderer;
import ru.lemoncraft.thalrathis.entity.armor.LightningDragonPriestArmorModel;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class LightningDragonPriestArmorItem extends ImbuableChestplateArmorItem{
    public LightningDragonPriestArmorItem(Type type, Properties settings) {
        super(ExtendedArmorMaterials.LIGHTNING_DRAGON_PRIEST, type, settings);
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public GeoArmorRenderer<?> supplyRenderer() {
        return new GenericCustomArmorRenderer<>(new LightningDragonPriestArmorModel());
    }
}
