package ru.lemoncraft.thalrathis.common.item.armor;

import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.ArmorMaterial;

import java.util.Map;

public interface ExtendedArmorMaterial extends ArmorMaterial {
    public Map<Attribute, AttributeModifier> getAdditionalAttributes();

}
