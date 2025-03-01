package ru.lemoncraft.thalrathis.common.item.armor;

import io.redspace.ironsspellbooks.api.registry.AttributeRegistry;
import net.minecraft.Util;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public enum ExtendedArmorMaterials implements ExtendedArmorMaterial {

    BLOOD("blood", 20000, makeArmorMap(200, 210, 205, 200), 25,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            200.0F, 0.1F, () ->
            Ingredient.of(Items.NETHERITE_INGOT), Map.of(
            AttributeRegistry.MAX_MANA.get(), new AttributeModifier("Max Mana", 300, AttributeModifier.Operation.ADDITION),
            AttributeRegistry.MANA_REGEN.get(), new AttributeModifier("Mana Regen", .25, AttributeModifier.Operation.MULTIPLY_BASE),
            AttributeRegistry.BLOOD_SPELL_POWER.get(), new AttributeModifier("Blood Spell Power", 1.0, AttributeModifier.Operation.MULTIPLY_BASE),
            AttributeRegistry.SPELL_RESIST.get(), new AttributeModifier("Spell Resist", 1.0, AttributeModifier.Operation.MULTIPLY_TOTAL),
            Attributes.MAX_HEALTH, new AttributeModifier("Max Health", 0.5, AttributeModifier.Operation.MULTIPLY_TOTAL),
            Attributes.MOVEMENT_SPEED, new AttributeModifier("Movement Speed", 0.1, AttributeModifier.Operation.ADDITION)
    )),
    ENDER("ender", 20000, makeArmorMap(200,210,205,200), 25,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            200.0F, 0.1F, () ->
            Ingredient.of(Items.NETHERITE_INGOT), Map.of(
            AttributeRegistry.MAX_MANA.get(), new AttributeModifier("Max Mana", 300, AttributeModifier.Operation.ADDITION),
            AttributeRegistry.MANA_REGEN.get(), new AttributeModifier("Mana Regen", .25, AttributeModifier.Operation.MULTIPLY_BASE),
            AttributeRegistry.ENDER_SPELL_POWER.get(), new AttributeModifier("Ender Spell Power", 1.0, AttributeModifier.Operation.MULTIPLY_BASE),
            AttributeRegistry.SPELL_RESIST.get(), new AttributeModifier("Spell Resist", 1.0, AttributeModifier.Operation.MULTIPLY_TOTAL),
            Attributes.MAX_HEALTH, new AttributeModifier("Max Health", 0.5, AttributeModifier.Operation.MULTIPLY_TOTAL),
            Attributes.MOVEMENT_SPEED, new AttributeModifier("Movement Speed", 0.1, AttributeModifier.Operation.ADDITION)
    )),
    FIRE("fire", 20000, makeArmorMap(200,210, 205, 200), 25,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            200.0F, 0.1F, () ->
            Ingredient.of(Items.NETHERITE_INGOT), Map.of(
            AttributeRegistry.MAX_MANA.get(), new AttributeModifier("Max Mana", 300, AttributeModifier.Operation.ADDITION),
            AttributeRegistry.MANA_REGEN.get(), new AttributeModifier("Mana Regen", .25, AttributeModifier.Operation.MULTIPLY_BASE),
            AttributeRegistry.FIRE_SPELL_POWER.get(), new AttributeModifier("Fire Spell Power", 1.0, AttributeModifier.Operation.MULTIPLY_BASE),
            AttributeRegistry.SPELL_RESIST.get(), new AttributeModifier("Spell Resist", 1.0, AttributeModifier.Operation.MULTIPLY_TOTAL),
            Attributes.MAX_HEALTH, new AttributeModifier("Max Health", 0.5, AttributeModifier.Operation.MULTIPLY_TOTAL),
            Attributes.MOVEMENT_SPEED, new AttributeModifier("Movement Speed", 0.1, AttributeModifier.Operation.ADDITION)
    )),
    ICE("ice", 20000, makeArmorMap(200,210, 205, 200), 25,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            200.0F, 0.1F, () ->
            Ingredient.of(Items.NETHERITE_INGOT), Map.of(
            AttributeRegistry.MAX_MANA.get(), new AttributeModifier("Max Mana", 300, AttributeModifier.Operation.ADDITION),
            AttributeRegistry.MANA_REGEN.get(), new AttributeModifier("Mana Regen", .25, AttributeModifier.Operation.MULTIPLY_BASE),
            AttributeRegistry.ICE_SPELL_POWER.get(), new AttributeModifier("Ice Spell Power", 1.0, AttributeModifier.Operation.MULTIPLY_BASE),
            AttributeRegistry.SPELL_RESIST.get(), new AttributeModifier("Spell Resist", 1.0, AttributeModifier.Operation.MULTIPLY_TOTAL),
            Attributes.MAX_HEALTH, new AttributeModifier("Max Health", 0.5, AttributeModifier.Operation.MULTIPLY_TOTAL),
            Attributes.MOVEMENT_SPEED, new AttributeModifier("Movement Speed", 0.1, AttributeModifier.Operation.ADDITION)
    )),
    LIGHTNING("lightning", 20000, makeArmorMap(200, 210, 205, 200), 25,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            200.0F, 0.1F, () ->
            Ingredient.of(Items.NETHERITE_INGOT), Map.of(
            AttributeRegistry.MAX_MANA.get(), new AttributeModifier("Max Mana", 300, AttributeModifier.Operation.ADDITION),
            AttributeRegistry.MANA_REGEN.get(), new AttributeModifier("Mana Regen", .25, AttributeModifier.Operation.MULTIPLY_BASE),
            AttributeRegistry.LIGHTNING_SPELL_POWER.get(), new AttributeModifier("Lightning Spell Power", 1.0, AttributeModifier.Operation.MULTIPLY_BASE),
            AttributeRegistry.SPELL_RESIST.get(), new AttributeModifier("Spell Resist", 1.0, AttributeModifier.Operation.MULTIPLY_TOTAL),
            Attributes.MAX_HEALTH, new AttributeModifier("Max Health", 0.5, AttributeModifier.Operation.MULTIPLY_TOTAL),
            Attributes.MOVEMENT_SPEED, new AttributeModifier("Movement Speed", 0.1, AttributeModifier.Operation.ADDITION)
    )),
    ELDRITCH("eldritch", 20000, makeArmorMap(200, 210, 205, 200), 25,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            200.0F, 0.1F, () ->
            Ingredient.of(Items.NETHERITE_INGOT), Map.of(
            AttributeRegistry.MAX_MANA.get(), new AttributeModifier("Max Mana", 300, AttributeModifier.Operation.ADDITION),
            AttributeRegistry.MANA_REGEN.get(), new AttributeModifier("Mana Regen", .25, AttributeModifier.Operation.MULTIPLY_BASE),
            AttributeRegistry.ELDRITCH_SPELL_POWER.get(), new AttributeModifier("Eldritch Spell Power", 1.0, AttributeModifier.Operation.MULTIPLY_BASE),
            AttributeRegistry.SPELL_RESIST.get(), new AttributeModifier("Spell Resist", 1.0, AttributeModifier.Operation.MULTIPLY_TOTAL),
            Attributes.MAX_HEALTH, new AttributeModifier("Max Health", 0.5, AttributeModifier.Operation.MULTIPLY_TOTAL),
            Attributes.MOVEMENT_SPEED, new AttributeModifier("Movement Speed", 0.1, AttributeModifier.Operation.ADDITION)
    )),
    NATURE("nature", 20000, makeArmorMap(200, 210, 205, 200), 25,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            200.0F, 0.1F, () ->
            Ingredient.of(Items.NETHERITE_INGOT), Map.of(
            AttributeRegistry.MAX_MANA.get(), new AttributeModifier("Max Mana", 300, AttributeModifier.Operation.ADDITION),
            AttributeRegistry.MANA_REGEN.get(), new AttributeModifier("Mana Regen", .25, AttributeModifier.Operation.MULTIPLY_BASE),
            AttributeRegistry.NATURE_SPELL_POWER.get(), new AttributeModifier("Nature Spell Power", 1.0, AttributeModifier.Operation.MULTIPLY_BASE),
            AttributeRegistry.SPELL_RESIST.get(), new AttributeModifier("Spell Resist", 1.0, AttributeModifier.Operation.MULTIPLY_TOTAL),
            Attributes.MAX_HEALTH, new AttributeModifier("Max Health", 0.5, AttributeModifier.Operation.MULTIPLY_TOTAL),
            Attributes.MOVEMENT_SPEED, new AttributeModifier("Movement Speed", 0.1, AttributeModifier.Operation.ADDITION)
    )),
    HOLY("holy", 20000, makeArmorMap(200, 210, 205, 200), 25,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            200.0F, 0.1F, () ->
            Ingredient.of(Items.NETHERITE_INGOT), Map.of(
            AttributeRegistry.MAX_MANA.get(), new AttributeModifier("Max Mana", 3.0, AttributeModifier.Operation.ADDITION),
            AttributeRegistry.MANA_REGEN.get(), new AttributeModifier("Mana Regen", .25, AttributeModifier.Operation.MULTIPLY_BASE),
            AttributeRegistry.HOLY_SPELL_POWER.get(), new AttributeModifier("Holy Spell Power", 1.0, AttributeModifier.Operation.MULTIPLY_BASE),
            AttributeRegistry.SPELL_RESIST.get(), new AttributeModifier("Spell Resist", 1.0, AttributeModifier.Operation.MULTIPLY_TOTAL),
            Attributes.MAX_HEALTH, new AttributeModifier("Max Health", 0.5, AttributeModifier.Operation.MULTIPLY_TOTAL),
            Attributes.MOVEMENT_SPEED, new AttributeModifier("Movement Speed", 0.1, AttributeModifier.Operation.ADDITION)
    )),
    EVOCATION("evocation", 20000, makeArmorMap(200, 210, 205, 200), 25,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            200.0F, 0.1F, () ->
            Ingredient.of(Items.NETHERITE_INGOT), Map.of(
            AttributeRegistry.MAX_MANA.get(), new AttributeModifier("Max Mana", 300, AttributeModifier.Operation.ADDITION),
            AttributeRegistry.MANA_REGEN.get(), new AttributeModifier("Mana Regen", .25, AttributeModifier.Operation.MULTIPLY_BASE),
            AttributeRegistry.EVOCATION_SPELL_POWER.get(), new AttributeModifier("Evocation Spell Power", 1.0, AttributeModifier.Operation.MULTIPLY_BASE),
            AttributeRegistry.SUMMON_DAMAGE.get(), new AttributeModifier("Summon Damage", 1.0, AttributeModifier.Operation.MULTIPLY_BASE),
            AttributeRegistry.SPELL_RESIST.get(), new AttributeModifier("Spell Resist", 1.0, AttributeModifier.Operation.MULTIPLY_TOTAL),
            Attributes.MAX_HEALTH, new AttributeModifier("Max Health", 0.5, AttributeModifier.Operation.MULTIPLY_TOTAL),
            Attributes.MOVEMENT_SPEED, new AttributeModifier("Movement Speed", 0.1, AttributeModifier.Operation.ADDITION)
    )),
    FINALITY("finality", 50000, makeArmorMap(500,520,510,500), 35,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            500.0F, 0.2F, () ->
            Ingredient.of(Items.NETHERITE_INGOT), Map.of(
            AttributeRegistry.MAX_MANA.get(), new AttributeModifier("Max Mana", 500, AttributeModifier.Operation.ADDITION),
            AttributeRegistry.MANA_REGEN.get(), new AttributeModifier("Mana Regen", .50, AttributeModifier.Operation.MULTIPLY_BASE),
            AttributeRegistry.SPELL_POWER.get(), new AttributeModifier("Spell Power", 2.0, AttributeModifier.Operation.MULTIPLY_BASE),
            AttributeRegistry.SPELL_RESIST.get(), new AttributeModifier("Spell Resist", 2.0, AttributeModifier.Operation.MULTIPLY_TOTAL),
            AttributeRegistry.SUMMON_DAMAGE.get(), new AttributeModifier("Summon Damage", 2.0, AttributeModifier.Operation.MULTIPLY_BASE),
            Attributes.MAX_HEALTH, new AttributeModifier("Max Health", 1.0, AttributeModifier.Operation.MULTIPLY_TOTAL),
            Attributes.MOVEMENT_SPEED, new AttributeModifier("Movement Speed", 0.2, AttributeModifier.Operation.ADDITION)
    )),
    // Ice and Fire: SpellBooks replacement:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    ICE_DRAGON_PRIEST("ice_dragon_priest", 10000, makeArmorMap(50, 60,55,50), 15,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            20.0F, 0.0F, () ->
            Ingredient.of(Items.NETHERITE_INGOT), Map.of(
            AttributeRegistry.ICE_SPELL_POWER.get(), new AttributeModifier("Ice Spell Power", 1.0, AttributeModifier.Operation.MULTIPLY_BASE),
            AttributeRegistry.SPELL_RESIST.get(), new AttributeModifier("Spell Resist", 0.3, AttributeModifier.Operation.MULTIPLY_BASE)
    )),
    LIGHTNING_DRAGON_PRIEST("lightning_dragon_priest", 10000, makeArmorMap(50, 60,55,50), 15,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            20.0F, 0.0F, () ->
            Ingredient.of(Items.NETHERITE_INGOT), Map.of(
            AttributeRegistry.LIGHTNING_SPELL_POWER.get(), new AttributeModifier("Lightning Spell Power", 1.0, AttributeModifier.Operation.MULTIPLY_BASE),
            AttributeRegistry.SPELL_RESIST.get(), new AttributeModifier("Spell Resist", 0.3, AttributeModifier.Operation.MULTIPLY_BASE)
    )),
    FIRE_DRAGON_PRIEST("fire_dragon_priest", 10000, makeArmorMap(50, 60,55,50), 15,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            20.0F, 0.0F, () ->
            Ingredient.of(Items.NETHERITE_INGOT), Map.of(
            AttributeRegistry.FIRE_SPELL_POWER.get(), new AttributeModifier("Fire Spell Power", 1.0, AttributeModifier.Operation.MULTIPLY_BASE),
            AttributeRegistry.SPELL_RESIST.get(), new AttributeModifier("Spell Resist", 1.0, AttributeModifier.Operation.MULTIPLY_BASE)
    ));

    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final EnumMap<ArmorItem.Type, Integer> protectionFunctionForType;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;
    private final Map<Attribute, AttributeModifier> additionalAttributes;

    private ExtendedArmorMaterials(String pName, int pDurabilityMultiplier, EnumMap<ArmorItem.Type, Integer> protectionMap,
                                   int pEnchantmentValue, SoundEvent pSound, float pToughness, float pKnockbackResistance,
                                   Supplier<Ingredient> pRepairIngredient, Map<Attribute, AttributeModifier> additionalAttributes) {
        this.name = pName;
        this.durabilityMultiplier = pDurabilityMultiplier;
        this.protectionFunctionForType = protectionMap;
        this.enchantmentValue = pEnchantmentValue;
        this.sound = pSound;
        this.toughness = pToughness;
        this.knockbackResistance = pKnockbackResistance;
        this.repairIngredient = new LazyLoadedValue<>(pRepairIngredient);
        this.additionalAttributes = additionalAttributes;
    }

    static public EnumMap<ArmorItem.Type, Integer> makeArmorMap(int helmet, int chestplate, int leggings, int boots) {
        return Util.make(new EnumMap<>(ArmorItem.Type.class), (p_266655_) -> {
            p_266655_.put(ArmorItem.Type.BOOTS, boots);
            p_266655_.put(ArmorItem.Type.LEGGINGS, leggings);
            p_266655_.put(ArmorItem.Type.CHESTPLATE, chestplate);
            p_266655_.put(ArmorItem.Type.HELMET, helmet);
        });
    }

    static public EnumMap<ArmorItem.Type, Integer> schoolArmorMap() {
        return makeArmorMap(3, 8, 6, 3);
    }

    public int getDurabilityForSlot(EquipmentSlot pSlot) {
        return HEALTH_PER_SLOT[pSlot.getIndex()] * this.durabilityMultiplier;
    }

    private static final EnumMap<ArmorItem.Type, Integer> HEALTH_FUNCTION_FOR_TYPE =
            Util.make(new EnumMap<>(ArmorItem.Type.class), (p_266653_) -> {
        p_266653_.put(ArmorItem.Type.BOOTS, 13);
        p_266653_.put(ArmorItem.Type.LEGGINGS, 15);
        p_266653_.put(ArmorItem.Type.CHESTPLATE, 16);
        p_266653_.put(ArmorItem.Type.HELMET, 11);
    });

    public int getDurabilityForType(ArmorItem.Type p_266745_) {
        return HEALTH_FUNCTION_FOR_TYPE.get(p_266745_) * this.durabilityMultiplier;
    }

    public int getDefenseForType(ArmorItem.Type p_266752_) {
        return this.protectionFunctionForType.get(p_266752_);
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public String getName() {
        return this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public Map<Attribute, AttributeModifier> getAdditionalAttributes() {
        return additionalAttributes;
    }

    /**
     * Gets the percentage of knockback resistance provided by armor of the material.
     */
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}