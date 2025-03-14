package ru.lemoncraft.thalrathis.registry;

import com.google.common.collect.*;

import io.redspace.ironsspellbooks.api.item.weapons.*;
import io.redspace.ironsspellbooks.api.registry.*;
import io.redspace.ironsspellbooks.api.spells.*;
import io.redspace.ironsspellbooks.item.UpgradeOrbItem;
import io.redspace.ironsspellbooks.item.curios.*;
import io.redspace.ironsspellbooks.item.spell_books.*;
import io.redspace.ironsspellbooks.item.weapons.*;

import net.minecraft.world.entity.ai.attributes.*;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import ru.lemoncraft.thalrathis.Thalrathis;
import net.minecraftforge.registries.*;

import ru.lemoncraft.thalrathis.common.item.armor.*;
import ru.lemoncraft.thalrathis.common.item.shard.*;
import ru.lemoncraft.thalrathis.common.item.tools.*;
import ru.lemoncraft.thalrathis.util.*;

import java.util.*;
import java.util.function.*;


public class ItemRegistry {
    private static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Thalrathis.MODID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    // Materials::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    private static Supplier<? extends net.minecraft.world.item.Item> Item;
    public static final RegistryObject<Item> BASIC_SHARD = ITEMS.register("basic_shard", () ->
            new Basic_Shard(ItemPropertiesHelper.material()));
    public static final RegistryObject<Item> TENEBRIS_SHARD = ITEMS.register("tenebris_shard", () ->
            new Tenebris_Shard(ItemPropertiesHelper.material())); // Ender
    public static final RegistryObject<Item> SANGUIS_SHARD = ITEMS.register("sanguis_shard", () ->
            new Sanguis_Shard(ItemPropertiesHelper.material())); // Blood
    public static final RegistryObject<Item> FLAMARA_SHARD = ITEMS.register("flamara_shard", () ->
            new Flamara_Shard(ItemPropertiesHelper.material())); // Fire
    public static final RegistryObject<Item> OBSCURUM_SHARD = ITEMS.register("obscurum_shard", () ->
            new Obscurum_Shard(ItemPropertiesHelper.material())); // Eldritch
    public static final RegistryObject<Item> GELIDUS_SHARD = ITEMS.register("gelidus_shard", () ->
            new Gelidus_Shard(ItemPropertiesHelper.material())); // Ice
    public static final RegistryObject<Item> VERDALIS_SHARD = ITEMS.register("verdalis_shard", () ->
            new Verdalis_Shard(ItemPropertiesHelper.material())); // Nature
    public static final RegistryObject<Item> SANCTARIS_SHARD = ITEMS.register("sanctaris_shard", () ->
            new Sanctaris_Shard(ItemPropertiesHelper.material())); // Holy
    public static final RegistryObject<Item> VOCARIS_SHARD = ITEMS.register("vocaris_shard", () ->
            new Vocaris_Shard(ItemPropertiesHelper.material())); // Evocation
    public static final RegistryObject<Item> FULGARIS_SHARD = ITEMS.register("fulgaris_shard", () ->
            new Fulgaris_Shard(ItemPropertiesHelper.material())); // Lightning
    public static final RegistryObject<Item> AQUATA_SHARD = ITEMS.register("aquata_shard", () ->
            new Aquata_Shard(ItemPropertiesHelper.material())); // Water
    public static final RegistryObject<Item> AERO_SHARD = ITEMS.register("aero_shard", () ->
            new Aero_Shard(ItemPropertiesHelper.material())); // Wind
    public static final RegistryObject<Item> UMBRA_SHARD = ITEMS.register("umbra_shard", () ->
            new Umbra_Shard(ItemPropertiesHelper.material())); // Dark
    public static final RegistryObject<Item> LUMINUS_SHARD = ITEMS.register("luminus_shard", () ->
            new Luminus_Shard(ItemPropertiesHelper.material())); // Light
    public static final RegistryObject<Item> ULTIMARA_SHARD = ITEMS.register("ultimara_shard", () ->
            new Ultimara_Shard(ItemPropertiesHelper.material())); // Might
    public static final RegistryObject<Item> FINALITY_SHARD = ITEMS.register("finality_shard", () ->
            new Finality_Shard(ItemPropertiesHelper.material())); // Finality
    public static final RegistryObject<Item> NIHILITY_SHARD = ITEMS.register("nihility_shard", () ->
            new Nihility_Shard(ItemPropertiesHelper.material())); // Nihility

    // Runes (ISS)::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    public static final RegistryObject<Item> WIND_RUNE = ITEMS.register("wind_rune", () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> WATER_RUNE = ITEMS.register("water_rune", () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> LIGHT_RUNE = ITEMS.register("light_rune", () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> DARK_RUNE = ITEMS.register("dark_rune", () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> MIGHT_RUNE = ITEMS.register("might_rune", () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> FINALITY_RUNE = ITEMS.register("finality_rune", () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> NIHILITY_RUNE = ITEMS.register("nihility_rune", () -> new Item(new Item.Properties().stacksTo(64)));

    // Upgrade runes (ISS)::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    public static final RegistryObject<Item> WIND_UPGRADE_ORB = ITEMS.register("wind_upgrade_orb",
            () -> new UpgradeOrbItem(TSpellRegistry.UpgradeTypes.WIND_SPELL_POWER, new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> WATER_UPGRADE_ORB = ITEMS.register("water_upgrade_orb",
            () -> new UpgradeOrbItem(TSpellRegistry.UpgradeTypes.WIND_SPELL_POWER, new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> LIGHT_UPGRADE_ORB = ITEMS.register("light_upgrade_orb",
            () -> new UpgradeOrbItem(TSpellRegistry.UpgradeTypes.WIND_SPELL_POWER, new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> DARK_UPGRADE_ORB = ITEMS.register("dark_upgrade_orb",
            () -> new UpgradeOrbItem(TSpellRegistry.UpgradeTypes.WIND_SPELL_POWER, new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> MIGHT_UPGRADE_ORB = ITEMS.register("might_upgrade_orb",
            () -> new UpgradeOrbItem(TSpellRegistry.UpgradeTypes.WIND_SPELL_POWER, new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> FINALITY_UPGRADE_ORB = ITEMS.register("finality_upgrade_orb",
            () -> new UpgradeOrbItem(TSpellRegistry.UpgradeTypes.WIND_SPELL_POWER, new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> NIHILITY_UPGRADE_ORB = ITEMS.register("nihility_upgrade_orb",
            () -> new UpgradeOrbItem(TSpellRegistry.UpgradeTypes.WIND_SPELL_POWER, new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON)));

    // Tools (!!!TESTING!!!)::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    public static final RegistryObject<Item> PREDATOR_PICKAXE = ITEMS.register
            ("predator_pickaxe", () -> new PickaxeItem(ThalrathisTier.NATURE,4, -1.0F,
                    new Item.Properties().rarity(Rarity.EPIC)));

    // SpellBooks (!!!TESTING!!!):::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    public static final RegistryObject<Item> DRAGONMANCERS_OATHBOOK = ITEMS.register
            ("dragonmancers_oathbook", () -> new SimpleAttributeSpellBook // Ice and Fire: SpellBooks replacement for Community Edition fork
                    (12, SpellRarity.LEGENDARY, AttributeRegistry.SPELL_POWER.get(), 0.2D, 300));

    public static final RegistryObject<Item> YOMAYO = ITEMS.register
            ("yomayo_spell_book", () -> {
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.put(AttributeRegistry.SPELL_POWER.get(),
                new AttributeModifier(UUID.fromString("667ad88f-901d-4691-b2a2-3664e42026d3"), "Weapon modifier", 5.0,
                        AttributeModifier.Operation.MULTIPLY_BASE));
        builder.put(AttributeRegistry.CAST_TIME_REDUCTION.get(),
                new AttributeModifier(UUID.fromString("667ad88f-901d-4691-b2a2-3664e42026d3"), "Weapon modifier", 0.2,
                        AttributeModifier.Operation.MULTIPLY_BASE));
        builder.put(AttributeRegistry.COOLDOWN_REDUCTION.get(),
                new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon modifier", 0.2,
                        AttributeModifier.Operation.MULTIPLY_BASE));
        builder.put(AttributeRegistry.MAX_MANA.get(),
                new AttributeModifier(UUID.fromString("667ad88f-901d-4691-b2a2-3664e42026d3"), "Weapon modifier", 1000,
                        AttributeModifier.Operation.ADDITION));
        return new SimpleAttributeSpellBook(15, SpellRarity.LEGENDARY, builder.build());});

    public static final RegistryObject<Item> SPELLBOOK_PLACEHOLDER1 = ITEMS.register("fire_spell_book", () -> {
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.put(AttributeRegistry.FIRE_SPELL_POWER.get(),
                new AttributeModifier(UUID.fromString("667ad88f-901d-4691-b2a2-3664e42026d3"), "Weapon modifier", .08,
                        AttributeModifier.Operation.MULTIPLY_BASE));
        builder.put(AttributeRegistry.CAST_TIME_REDUCTION.get(),
                new AttributeModifier(UUID.fromString("667ad88f-901d-4691-b2a2-3664e42026d3"), "Weapon modifier", .08,
                        AttributeModifier.Operation.MULTIPLY_BASE));
        builder.put(AttributeRegistry.MAX_MANA.get(),
                new AttributeModifier(UUID.fromString("667ad88f-901d-4691-b2a2-3664e42026d3"), "Weapon modifier", 200,
                        AttributeModifier.Operation.ADDITION));
        return new SimpleAttributeSpellBook(15, SpellRarity.LEGENDARY, builder.build());});

    public static final RegistryObject<Item> SPELLBOOK_PLACEHOLDER2 = ITEMS.register("ice_spell_book", () -> {
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.put(AttributeRegistry.ICE_SPELL_POWER.get(),
                new AttributeModifier(UUID.fromString("667ad88f-901d-4691-b2a2-3664e42026d3"), "Weapon modifier", .08,
                        AttributeModifier.Operation.MULTIPLY_BASE));
        builder.put(AttributeRegistry.CAST_TIME_REDUCTION.get(),
                new AttributeModifier(UUID.fromString("667ad88f-901d-4691-b2a2-3664e42026d3"), "Weapon modifier", .08,
                        AttributeModifier.Operation.MULTIPLY_BASE));
        builder.put(AttributeRegistry.MAX_MANA.get(),
                new AttributeModifier(UUID.fromString("667ad88f-901d-4691-b2a2-3664e42026d3"), "Weapon modifier", 200,
                        AttributeModifier.Operation.ADDITION));
        return new SimpleAttributeSpellBook(15, SpellRarity.LEGENDARY, builder.build());});

    public static final RegistryObject<Item> SPELLBOOK_PLACEHOLDER3 = ITEMS.register("lightning_spell_book", () -> {
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.put(AttributeRegistry.LIGHTNING_SPELL_POWER.get(),
                new AttributeModifier(UUID.fromString("667ad88f-901d-4691-b2a2-3664e42026d3"), "Weapon modifier", .08,
                        AttributeModifier.Operation.MULTIPLY_BASE));
        builder.put(AttributeRegistry.CAST_TIME_REDUCTION.get(),
                new AttributeModifier(UUID.fromString("667ad88f-901d-4691-b2a2-3664e42026d3"), "Weapon modifier", .08,
                        AttributeModifier.Operation.MULTIPLY_BASE));
        builder.put(AttributeRegistry.MAX_MANA.get(),
                new AttributeModifier(UUID.fromString("667ad88f-901d-4691-b2a2-3664e42026d3"), "Weapon modifier", 200,
                        AttributeModifier.Operation.ADDITION));
        return new SimpleAttributeSpellBook(15, SpellRarity.LEGENDARY, builder.build());});

    public static final RegistryObject<Item> SPELLBOOK_PLACEHOLDER4 = ITEMS.register("holy_spell_book", () -> {
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.put(AttributeRegistry.HOLY_SPELL_POWER.get(),
                new AttributeModifier(UUID.fromString("667ad88f-901d-4691-b2a2-3664e42026d3"), "Weapon modifier", .08,
                        AttributeModifier.Operation.MULTIPLY_BASE));
        builder.put(AttributeRegistry.CAST_TIME_REDUCTION.get(),
                new AttributeModifier(UUID.fromString("667ad88f-901d-4691-b2a2-3664e42026d3"), "Weapon modifier", .08,
                        AttributeModifier.Operation.MULTIPLY_BASE));
        builder.put(AttributeRegistry.MAX_MANA.get(),
                new AttributeModifier(UUID.fromString("667ad88f-901d-4691-b2a2-3664e42026d3"), "Weapon modifier", 200,
                        AttributeModifier.Operation.ADDITION));
        return new SimpleAttributeSpellBook(15, SpellRarity.LEGENDARY, builder.build());});

    public static final RegistryObject<Item> SPELLBOOK_PLACEHOLDER5 = ITEMS.register("ender_spell_book", () -> {
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.put(AttributeRegistry.ENDER_SPELL_POWER.get(),
                new AttributeModifier(UUID.fromString("667ad88f-901d-4691-b2a2-3664e42026d3"), "Weapon modifier", .08,
                        AttributeModifier.Operation.MULTIPLY_BASE));
        builder.put(AttributeRegistry.CAST_TIME_REDUCTION.get(),
                new AttributeModifier(UUID.fromString("667ad88f-901d-4691-b2a2-3664e42026d3"), "Weapon modifier", .08,
                        AttributeModifier.Operation.MULTIPLY_BASE));
        builder.put(AttributeRegistry.MAX_MANA.get(),
                new AttributeModifier(UUID.fromString("667ad88f-901d-4691-b2a2-3664e42026d3"), "Weapon modifier", 200,
                        AttributeModifier.Operation.ADDITION));
        return new SimpleAttributeSpellBook(15, SpellRarity.LEGENDARY, builder.build());});

    public static final RegistryObject<Item> SPELLBOOK_PLACEHOLDER6 = ITEMS.register("nature_spell_book", () -> {
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.put(AttributeRegistry.NATURE_SPELL_POWER.get(),
                new AttributeModifier(UUID.fromString("667ad88f-901d-4691-b2a2-3664e42026d3"), "Weapon modifier", .08,
                        AttributeModifier.Operation.MULTIPLY_BASE));
        builder.put(AttributeRegistry.CAST_TIME_REDUCTION.get(),
                new AttributeModifier(UUID.fromString("667ad88f-901d-4691-b2a2-3664e42026d3"), "Weapon modifier", .08,
                        AttributeModifier.Operation.MULTIPLY_BASE));
        builder.put(AttributeRegistry.MAX_MANA.get(),
                new AttributeModifier(UUID.fromString("667ad88f-901d-4691-b2a2-3664e42026d3"), "Weapon modifier", 200,
                        AttributeModifier.Operation.ADDITION));
        return new SimpleAttributeSpellBook(15, SpellRarity.LEGENDARY, builder.build());});

    public static final RegistryObject<Item> SPELLBOOK_PLACEHOLDER7 = ITEMS.register("blood_spell_book", () -> {
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.put(AttributeRegistry.BLOOD_SPELL_POWER.get(),
                new AttributeModifier(UUID.fromString("667ad88f-901d-4691-b2a2-3664e42026d3"), "Weapon modifier", .08,
                        AttributeModifier.Operation.MULTIPLY_BASE));
        builder.put(AttributeRegistry.CAST_TIME_REDUCTION.get(),
                new AttributeModifier(UUID.fromString("667ad88f-901d-4691-b2a2-3664e42026d3"), "Weapon modifier", .08,
                        AttributeModifier.Operation.MULTIPLY_BASE));
        builder.put(AttributeRegistry.MAX_MANA.get(),
                new AttributeModifier(UUID.fromString("667ad88f-901d-4691-b2a2-3664e42026d3"), "Weapon modifier", 200,
                        AttributeModifier.Operation.ADDITION));
        return new SimpleAttributeSpellBook(15, SpellRarity.LEGENDARY, builder.build());});

    public static final RegistryObject<Item> SPELLBOOK_PLACEHOLDER8 = ITEMS.register("eldritch_spell_book", () -> {
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.put(AttributeRegistry.ELDRITCH_SPELL_POWER.get(),
                new AttributeModifier(UUID.fromString("667ad88f-901d-4691-b2a2-3664e42026d3"), "Weapon modifier", .08,
                        AttributeModifier.Operation.MULTIPLY_BASE));
        builder.put(AttributeRegistry.CAST_TIME_REDUCTION.get(),
                new AttributeModifier(UUID.fromString("667ad88f-901d-4691-b2a2-3664e42026d3"), "Weapon modifier", .08,
                        AttributeModifier.Operation.MULTIPLY_BASE));
        builder.put(AttributeRegistry.MAX_MANA.get(),
                new AttributeModifier(UUID.fromString("667ad88f-901d-4691-b2a2-3664e42026d3"), "Weapon modifier", 200,
                        AttributeModifier.Operation.ADDITION));
        return new SimpleAttributeSpellBook(15, SpellRarity.LEGENDARY, builder.build());});

    public static final RegistryObject<Item> SPELLBOOK_PLACEHOLDER9 = ITEMS.register("evocation_spell_book", () -> {
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.put(AttributeRegistry.EVOCATION_SPELL_POWER.get(),
                new AttributeModifier(UUID.fromString("667ad88f-901d-4691-b2a2-3664e42026d3"), "Weapon modifier", .08,
                        AttributeModifier.Operation.MULTIPLY_BASE));
        builder.put(AttributeRegistry.CAST_TIME_REDUCTION.get(),
                new AttributeModifier(UUID.fromString("667ad88f-901d-4691-b2a2-3664e42026d3"), "Weapon modifier", .08,
                        AttributeModifier.Operation.MULTIPLY_BASE));
        builder.put(AttributeRegistry.MAX_MANA.get(),
                new AttributeModifier(UUID.fromString("667ad88f-901d-4691-b2a2-3664e42026d3"), "Weapon modifier", 200,
                        AttributeModifier.Operation.ADDITION));
        return new SimpleAttributeSpellBook(15, SpellRarity.LEGENDARY, builder.build());});

    // Accessories (!!!TESTING!!!)::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    public static final RegistryObject<CurioBaseItem> MANA_RING1 = ITEMS.register("uncommon_mana_ring", () ->
            new SimpleAttributeCurio(ItemPropertiesHelper.equipment().stacksTo(1), AttributeRegistry.MAX_MANA.get(),
                    new AttributeModifier("mana", 200,
                            AttributeModifier.Operation.ADDITION)));

    public static final RegistryObject<CurioBaseItem> MANA_RING2 = ITEMS.register("rare_mana_ring", () ->
            new SimpleAttributeCurio(ItemPropertiesHelper.equipment().stacksTo(1), AttributeRegistry.MAX_MANA.get(),
                    new AttributeModifier("mana", 300,
                            AttributeModifier.Operation.ADDITION)));

    public static final RegistryObject<CurioBaseItem> MANA_RING3 = ITEMS.register("epic_mana_ring", () ->
            new SimpleAttributeCurio(ItemPropertiesHelper.equipment().stacksTo(1), AttributeRegistry.MAX_MANA.get(),
                    new AttributeModifier("mana", 400,
                            AttributeModifier.Operation.ADDITION)));

    public static final RegistryObject<CurioBaseItem> MANA_RING4 = ITEMS.register("legendary_mana_ring", () ->
            new SimpleAttributeCurio(ItemPropertiesHelper.equipment().stacksTo(1), AttributeRegistry.MAX_MANA.get(),
                    new AttributeModifier("mana", 500,
                            AttributeModifier.Operation.ADDITION)));

    public static final RegistryObject<CurioBaseItem> MANA_RING5 = ITEMS.register("godly_mana_ring", () ->
            new SimpleAttributeCurio(ItemPropertiesHelper.equipment().stacksTo(1), AttributeRegistry.MAX_MANA.get(),
                    new AttributeModifier("mana", 600,
                            AttributeModifier.Operation.ADDITION)));

    public static final RegistryObject<CurioBaseItem> MANA_RING6 = ITEMS.register("divine_mana_ring", () ->
            new SimpleAttributeCurio(ItemPropertiesHelper.equipment().stacksTo(1), AttributeRegistry.MAX_MANA.get(),
                    new AttributeModifier("mana", 700,
                            AttributeModifier.Operation.ADDITION)));

    public static final RegistryObject<CurioBaseItem> MANA_RING7 = ITEMS.register("demonic_mana_ring", () ->
            new SimpleAttributeCurio(ItemPropertiesHelper.equipment().stacksTo(1), AttributeRegistry.MAX_MANA.get(),
                    new AttributeModifier("mana", 800,
                            AttributeModifier.Operation.ADDITION)));

    public static final RegistryObject<CurioBaseItem> MANA_RING8 = ITEMS.register("chaotic_mana_ring", () ->
            new SimpleAttributeCurio(ItemPropertiesHelper.equipment().stacksTo(1), AttributeRegistry.MAX_MANA.get(),
                    new AttributeModifier("mana", 900,
                            AttributeModifier.Operation.ADDITION)));

    public static final RegistryObject<CurioBaseItem> MANA_RING9 = ITEMS.register("super_mana_ring", () ->
            new SimpleAttributeCurio(ItemPropertiesHelper.equipment().stacksTo(1), AttributeRegistry.MAX_MANA.get(),
                    new AttributeModifier("mana", 1000,
                            AttributeModifier.Operation.ADDITION)));


    // Magic staffs (!!!TESTING!!!):::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    public static final RegistryObject<Item> DRAGON_PRIEST_STAFF = ITEMS.register("dragon_priest_staff",
            () -> new StaffItem(ItemPropertiesHelper.equipment().stacksTo(1).rarity(Rarity.EPIC), 50, -3,
                    Map.of(AttributeRegistry.FIRE_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("4c3d32f7-a3ce-413d-b797-85416731ebc8"), "Weapon modifier", .10,
                                    AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.ICE_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("4c3d32f7-a3ce-413d-b797-85416731ebc8"), "Weapon modifier", 0.10,
                                    AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.LIGHTNING_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("4c3d32f7-a3ce-413d-b797-85416731ebc8"), "Weapon modifier", 0.10,
                                    AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("4c3d32f7-a3ce-413d-b797-85416731ebc8"), "Weapon modifier", 0.10,
                                    AttributeModifier.Operation.MULTIPLY_BASE))));

    public static final RegistryObject<Item> FIRE_DRAGON_PRIEST_STAFF = ITEMS.register("crimson_dragon_priest_staff",
            () -> new StaffItem(ItemPropertiesHelper.equipment().stacksTo(1).rarity(Rarity.EPIC), 60, -3,
                    Map.of(AttributeRegistry.FIRE_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("4c3d32f7-a3ce-413d-b797-85416731ebc8"), "Weapon modifier", 0.25,
                                    AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("4c3d32f7-a3ce-413d-b797-85416731ebc8"), "Weapon modifier", 0.20,
                                    AttributeModifier.Operation.MULTIPLY_BASE))));

    public static final RegistryObject<Item> ICE_DRAGON_PRIEST_STAFF = ITEMS.register("silver_dragon_priest_staff",
            () -> new StaffItem(ItemPropertiesHelper.equipment().stacksTo(1).rarity(Rarity.EPIC), 60, -3,
                    Map.of(AttributeRegistry.ICE_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("4c3d32f7-a3ce-413d-b797-85416731ebc8"), "Weapon modifier", 0.25,
                                    AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("4c3d32f7-a3ce-413d-b797-85416731ebc8"), "Weapon modifier", 0.20,
                                    AttributeModifier.Operation.MULTIPLY_BASE))));

    public static final RegistryObject<Item> LIGHTNING_DRAGON_PRIEST_STAFF = ITEMS.register("thunderous_dragon_priest_staff",
            () -> new StaffItem(ItemPropertiesHelper.equipment().stacksTo(1).rarity(Rarity.EPIC), 60, -3,
                    Map.of(AttributeRegistry.LIGHTNING_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("4c3d32f7-a3ce-413d-b797-85416731ebc8"), "Weapon modifier", 0.25,
                                    AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("4c3d32f7-a3ce-413d-b797-85416731ebc8"), "Weapon modifier", 0.20,
                                    AttributeModifier.Operation.MULTIPLY_BASE))));

    public static final RegistryObject<Item> AIR_STAFF = ITEMS.register("air_staff",
            () -> new StaffItem(ItemPropertiesHelper.equipment().stacksTo(1).rarity(Rarity.EPIC), 60, -3,
                    Map.of(TAttributeRegistry.WIND_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("4c3d32f7-a3ce-413d-b797-85416731ebc8"), "Weapon modifier", 0.25,
                                    AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("4c3d32f7-a3ce-413d-b797-85416731ebc8"), "Weapon modifier", 0.20,
                                    AttributeModifier.Operation.MULTIPLY_BASE))));

    // Weapons::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    private static SpellDataRegistryHolder holder;

    // Candle weapons (animated)::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    public static final RegistryObject<Item> WAXWEAVER = ITEMS.register("waxweaver_claymore", () -> // ANIMATED:::
            new MagicSwordItem(Tiers.NETHERITE, 99, -2.8f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.5, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d4"), "Weapon Modifier",
                                    0.5, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    0.5, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> WICKPIERCER = ITEMS.register("wickpiercer_lance", () -> // ANIMATED::
            new MagicSwordItem(Tiers.NETHERITE, 99, -2.8f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.5, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d4"), "Weapon Modifier",
                                    0.5, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    0.5, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.RARE)));

    // Aquatic weapon:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    public static final RegistryObject<Item> AQUATIC_PLACEHOLDER1 = ITEMS.register("aquantic_sacred_katana", () ->
            new MagicSwordItem(Tiers.NETHERITE, 99, -2.8f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.5, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d4"), "Weapon Modifier",
                                    0.5, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    0.5, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> AQUATIC_PLACEHOLDER2 = ITEMS.register("aquantic_trident", () ->
            new MagicSwordItem(Tiers.NETHERITE, 99, -2.8f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.5, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d4"), "Weapon Modifier",
                                    0.5, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    0.5, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.RARE)));

    // Cybernetic weapon::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    public static final RegistryObject<Item> CYBERNETIC_PLACEHOLDER1 = ITEMS.register("cybernetic_katana", () ->
            new MagicSwordItem(Tiers.NETHERITE, 90, -2.0f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.6, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d4"), "Weapon Modifier",
                                    0.6, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    0.6, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> CYBERNETIC_PLACEHOLDER2 = ITEMS.register("cybernetic_dagger", () ->
            new MagicSwordItem(Tiers.NETHERITE, 60, -0.9f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.4, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d4"), "Weapon Modifier",
                                    0.4, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    0.4, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> CYBERNETIC_PLACEHOLDER3 = ITEMS.register("cybernetic_glaive", () ->
            new MagicSwordItem(Tiers.NETHERITE, 100, -2.3f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.5, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d4"), "Weapon Modifier",
                                    0.5, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    0.5, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> CYBERNETIC_PLACEHOLDER4 = ITEMS.register("cyber_glaive", () ->
            new MagicSwordItem(Tiers.NETHERITE, 100, -2.1f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.4, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d4"), "Weapon Modifier",
                                    0.4, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    0.4, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> CYBERNETIC_PLACEHOLDER5 = ITEMS.register("cyber_katana", () ->
            new MagicSwordItem(Tiers.NETHERITE, 80, -2.3f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.3, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d4"), "Weapon Modifier",
                                    0.3, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    0.3, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.RARE)));

    // Blood Weapons::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    public static final RegistryObject<Item> SANGUREN_KATANA = ITEMS.register("sanguren_katana", () ->
            new MagicSwordItem(ThalrathisTier.BLOOD, 170, -2.0f, SpellDataRegistryHolder.of(
                    new SpellDataRegistryHolder(SpellRegistry.BLOOD_STEP_SPELL, 5),
                    new SpellDataRegistryHolder(SpellRegistry.BLOOD_SLASH_SPELL, 5)),
            Map.of(
            AttributeRegistry.COOLDOWN_REDUCTION.get(),
            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
            AttributeRegistry.BLOOD_SPELL_POWER.get(),
            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d4"), "Weapon Modifier",
                    2.0, AttributeModifier.Operation.MULTIPLY_BASE),
            AttributeRegistry.MAX_MANA.get(),
            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                    2.0, AttributeModifier.Operation.MULTIPLY_BASE)
            ),
            (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> EVISCERA_SCYTHE = ITEMS.register("eviscera_scythe", () ->
            new MagicSwordItem(ThalrathisTier.BLOOD, 200, -2f, SpellDataRegistryHolder.of(
                    new SpellDataRegistryHolder(SpellRegistry.RAISE_DEAD_SPELL, 6),
                    new SpellDataRegistryHolder(SpellRegistry.BLOOD_STEP_SPELL, 5)),
                    Map.of(
                            AttributeRegistry.CAST_TIME_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.BLOOD_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d4"), "Weapon Modifier",
                                    2.0, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    3.0, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> CRAVEX_SWORD = ITEMS.register("cravex_sword", () ->
            new MagicSwordItem(ThalrathisTier.BLOOD, 150, -1.9f, SpellDataRegistryHolder.of(
                    new SpellDataRegistryHolder(SpellRegistry.DEVOUR_SPELL, 10),
                    new SpellDataRegistryHolder(SpellRegistry.WITHER_SKULL_SPELL, 10)),
                    Map.of(
                            AttributeRegistry.CAST_TIME_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.BLOOD_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d4"), "Weapon Modifier",
                                    3.0, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    3.0, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> HEMITHAR_LANCE = ITEMS.register("hemithar_lance", () ->
            new MagicSwordItem(ThalrathisTier.BLOOD, 150, -2.2f, SpellDataRegistryHolder.of(
                    new SpellDataRegistryHolder(SpellRegistry.HEARTSTOP_SPELL, 10),
                    new SpellDataRegistryHolder(SpellRegistry.RAY_OF_SIPHONING_SPELL, 10)),
                    Map.of(
                            AttributeRegistry.CAST_TIME_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.BLOOD_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d4"), "Weapon Modifier",
                                    1.5, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    1.5, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> BLOOD_PLACEHOLDER1 = ITEMS.register("soul_collector_scythe", () ->
            new MagicSwordItem(ThalrathisTier.BLOOD, 150, -2.5f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.BLOOD_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d4"), "Weapon Modifier",
                                    1.8, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    1.8, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> BLOOD_PLACEHOLDER2 = ITEMS.register("soul_devourer_claymore", () ->
            new MagicSwordItem(ThalrathisTier.BLOOD, 130, -2.1f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.BLOOD_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d4"), "Weapon Modifier",
                                    2.0, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    2.0, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> BLOOD_PLACEHOLDER3 = ITEMS.register("demonic_claymore", () -> // ANIMATED::::::::::::::::::::::::::::
            new MagicSwordItem(ThalrathisTier.BLOOD, 110, -2.2f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.BLOOD_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d4"), "Weapon Modifier",
                                    1.5, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    1.5, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> BLOOD_PLACEHOLDER4 = ITEMS.register("demonic_glaive", () ->
            new MagicSwordItem(ThalrathisTier.BLOOD, 99, -2.5f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.BLOOD_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d4"), "Weapon Modifier",
                                    1.0, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    1.0, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> BLOOD_PLACEHOLDER5 = ITEMS.register("bloodydeath_scythe", () -> // ANIMATED::::::::::::::::::::::::::::
            new MagicSwordItem(ThalrathisTier.BLOOD, 120, -2.9f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.BLOOD_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d4"), "Weapon Modifier",
                                    1.0, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    1.0, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> BLOOD_PLACEHOLDER6 = ITEMS.register("fallengod_spear", () -> // ANIMATED::::::::::::::::::::::::::::
            new MagicSwordItem(ThalrathisTier.BLOOD, 120, -2.8f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.BLOOD_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d4"), "Weapon Modifier",
                                    1.0, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    1.0, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> BLOOD_PLACEHOLDER7 = ITEMS.register("fallengod_sword", () ->
            new MagicSwordItem(ThalrathisTier.BLOOD, 140, -2.7f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.BLOOD_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d4"), "Weapon Modifier",
                                    1.8, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    1.8, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> BLOOD_PLACEHOLDER8 = ITEMS.register("ashura_sword", () ->
            new MagicSwordItem(ThalrathisTier.BLOOD, 120, -2.4f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.BLOOD_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d4"), "Weapon Modifier",
                                    1.4, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    1.4, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> BLOOD_PLACEHOLDER9 = ITEMS.register("riversofblood_katana", () ->
            new MagicSwordItem(ThalrathisTier.BLOOD, 90, -2.0f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.BLOOD_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d4"), "Weapon Modifier",
                                    1.0, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    1.0, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> BLOOD_PLACEHOLDER10 = ITEMS.register("vampiricneedle_rapier", () ->
            new MagicSwordItem(ThalrathisTier.BLOOD, 70, -1.7f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.BLOOD_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d4"), "Weapon Modifier",
                                    0.5, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    0.5, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.RARE)));
    // Ender weapons::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    public static final RegistryObject<Item> TENEBRIS_CLAYMORE = ITEMS.register("tenebris_claymore", () ->
            new MagicSwordItem(ThalrathisTier.ENDER, 140, -3f, SpellDataRegistryHolder.of(
                    new SpellDataRegistryHolder(SpellRegistry.PORTAL_SPELL, 3),
                    new SpellDataRegistryHolder(SpellRegistry.DRAGON_BREATH_SPELL, 10)),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.ENDER_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d65d4"), "Weapon Modifier",
                                    2.0, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    3.0, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> VELDRIS_SWORD = ITEMS.register("veldris_sword", () ->
            new MagicSwordItem(ThalrathisTier.ENDER, 160, -2.0f, SpellDataRegistryHolder.of(
                    new SpellDataRegistryHolder(SpellRegistry.BLACK_HOLE_SPELL, 6),
                    new SpellDataRegistryHolder(SpellRegistry.STARFALL_SPELL, 10)),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.ENDER_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d65d4"), "Weapon Modifier",
                                    2.0, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    2.0, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> PANDORA_LANCE = ITEMS.register("pandora_lance", () ->
            new MagicSwordItem(ThalrathisTier.ENDER, 120, -2.8f, SpellDataRegistryHolder.of(
                    new SpellDataRegistryHolder(SpellRegistry.RECALL_SPELL, 1),
                    new SpellDataRegistryHolder(SpellRegistry.EVASION_SPELL, 5)),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.ENDER_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d65d4"), "Weapon Modifier",
                                    1.5, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    1.5, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> TERMINUS_CLAYMORE = ITEMS.register("terminus_claymore", () ->
            new MagicSwordItem(ThalrathisTier.ENDER, 150, -1.8f, SpellDataRegistryHolder.of(
                    new SpellDataRegistryHolder(SpellRegistry.PORTAL_SPELL, 3),
                    new SpellDataRegistryHolder(SpellRegistry.DRAGON_BREATH_SPELL, 10)),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.ENDER_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d65d4"), "Weapon Modifier",
                                    2.0, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    2.0, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> ENDER_PLACEHOLDER1 = ITEMS.register("demonlords_heavy_axe", () ->
            new MagicSwordItem(ThalrathisTier.ENDER, 160, -2.8f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.ENDER_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d65d4"), "Weapon Modifier",
                                    2.0, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    2.0, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> ENDER_PLACEHOLDER2 = ITEMS.register("demonlord_sword", () ->
            new MagicSwordItem(ThalrathisTier.ENDER, 120, -2.1f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.ENDER_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d65d4"), "Weapon Modifier",
                                    1.3, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    1.3, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> ENDER_PLACEHOLDER3 = ITEMS.register("arcanethyst_heavy_axe", () ->
            new MagicSwordItem(ThalrathisTier.ENDER, 120, -3.0f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.ENDER_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d65d4"), "Weapon Modifier",
                                    1.0, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    1.0, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> ENDER_PLACEHOLDER4 = ITEMS.register("abominable_sword", () ->
            new MagicSwordItem(ThalrathisTier.ENDER, 99, -2.5f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.ENDER_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d65d4"), "Weapon Modifier",
                                    0.8, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    0.8, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> ENDER_PLACEHOLDER5 = ITEMS.register("abominable_katana", () ->
            new MagicSwordItem(ThalrathisTier.ENDER, 110, -2.0f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.ENDER_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d65d4"), "Weapon Modifier",
                                    1.0, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    1.0, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> ENDER_PLACEHOLDER6 = ITEMS.register("abominable_scythe", () ->
            new MagicSwordItem(ThalrathisTier.ENDER, 120, -3f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.ENDER_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d65d4"), "Weapon Modifier",
                                    1.5, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    1.5, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> ENDER_PLACEHOLDER7 = ITEMS.register("muramasa_katana", () ->
            new MagicSwordItem(ThalrathisTier.ENDER, 120, -2.4f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.ENDER_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d65d4"), "Weapon Modifier",
                                    1.0, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    1.0, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> ENDER_PLACEHOLDER8 = ITEMS.register("thousanddemondaggers_katana", () ->
            new MagicSwordItem(ThalrathisTier.ENDER, 150, -2.1f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.ENDER_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d65d4"), "Weapon Modifier",
                                    2.0, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    2.0, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.RARE)));

    // Fire weapons::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    public static final RegistryObject<Item> INFERIS_HEAVY_AXE = ITEMS.register("inferis_heavy_axe", () ->
            new MagicSwordItem(ThalrathisTier.FIRE, 130, -2.1f, SpellDataRegistryHolder.of(
                    new SpellDataRegistryHolder(SpellRegistry.FLAMING_STRIKE_SPELL, 5),
                    new SpellDataRegistryHolder(SpellRegistry.HEAT_SURGE_SPELL, 8)),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.FIRE_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d66d4"), "Weapon Modifier",
                                    1.5, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    1.5, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> CINDERVEIL_SCYTHE = ITEMS.register("cinderveil_scythe", () ->
            new MagicSwordItem(ThalrathisTier.FIRE, 150, -2.5f, SpellDataRegistryHolder.of(
                    new SpellDataRegistryHolder(SpellRegistry.FLAMING_BARRAGE_SPELL, 10),
                    new SpellDataRegistryHolder(SpellRegistry.FIREBOLT_SPELL, 10)),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.FIRE_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d66d4"), "Weapon Modifier",
                                    1.5, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    1.5, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> XERAX_KATANA = ITEMS.register("xerax_katana", () ->
            new MagicSwordItem(ThalrathisTier.FIRE, 110, -2.0f, SpellDataRegistryHolder.of(
                    new SpellDataRegistryHolder(SpellRegistry.BURNING_DASH_SPELL, 10),
                    new SpellDataRegistryHolder(SpellRegistry.SCORCH_SPELL, 10)),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.FIRE_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d66d4"), "Weapon Modifier",
                                    1.0, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    1.0, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> PYROCLAST_CLAYMORE = ITEMS.register("pyroclast_claymore", () ->
            new MagicSwordItem(ThalrathisTier.FIRE, 140, -2.5f, SpellDataRegistryHolder.of(
                    new SpellDataRegistryHolder(SpellRegistry.BLAZE_STORM_SPELL, 10),
                    new SpellDataRegistryHolder(SpellRegistry.WALL_OF_FIRE_SPELL, 5)),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.FIRE_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d66d4"), "Weapon Modifier",
                                    1.5, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    1.5, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> FIRE_PLACEHOLDER1 = ITEMS.register("molten_katana", () ->
            new MagicSwordItem(ThalrathisTier.FIRE, 150, -2.3f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.FIRE_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d66d4"), "Weapon Modifier",
                                    1.5, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    1.5, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> FIRE_PLACEHOLDER2 = ITEMS.register("molten_sword", () ->
            new MagicSwordItem(ThalrathisTier.FIRE, 110, -2.5f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.FIRE_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d66d4"), "Weapon Modifier",
                                    1.0, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    1.0, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> FIRE_PLACEHOLDER3 = ITEMS.register("pheonixgrace_glaive", () ->
            new MagicSwordItem(ThalrathisTier.FIRE, 100, -2.4f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.FIRE_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d66d4"), "Weapon Modifier",
                                    1.5, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    1.5, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> FIRE_PLACEHOLDER4 = ITEMS.register("hearthflame_hammer", () ->
            new MagicSwordItem(ThalrathisTier.FIRE, 170, -3f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.FIRE_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d66d4"), "Weapon Modifier",
                                    2.0, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    2.0, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> FIRE_PLACEHOLDER5 = ITEMS.register("dragonslaying_claymore", () ->
            new MagicSwordItem(ThalrathisTier.FIRE, 130, -2.1f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.FIRE_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d66d4"), "Weapon Modifier",
                                    2.5, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    2.5, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    // Ice weapons::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    public static final RegistryObject<Item> SYREES_SCYTHE = ITEMS.register("syrees_scythe", () ->
            new MagicSwordItem(ThalrathisTier.ICE, 160, -2.1f, SpellDataRegistryHolder.of(
                    new SpellDataRegistryHolder(SpellRegistry.FROSTWAVE_SPELL, 8),
                    new SpellDataRegistryHolder(SpellRegistry.CONE_OF_COLD_SPELL, 10)),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.ICE_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d4"), "Weapon Modifier",
                                    2.2, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    2.2, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> GLASIVANE_SCYTHE = ITEMS.register("glacivane_scythe", () ->
            new MagicSwordItem(ThalrathisTier.ICE, 140, -2.3f, SpellDataRegistryHolder.of(
                    new SpellDataRegistryHolder(SpellRegistry.FROST_STEP_SPELL, 8),
                    new SpellDataRegistryHolder(SpellRegistry.RAY_OF_FROST_SPELL, 5)),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.ICE_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d4"), "Weapon Modifier",
                                    1.5, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    1.5, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> CHRONOSCATUS_KATANA = ITEMS.register("chronoscatus_katana", () ->
            new MagicSwordItem(ThalrathisTier.ICE, 120, -2.1f, SpellDataRegistryHolder.of(
                    new SpellDataRegistryHolder(SpellRegistry.SUMMON_POLAR_BEAR_SPELL, 10),
                    new SpellDataRegistryHolder(SpellRegistry.ICICLE_SPELL, 10)),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.ICE_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d4"), "Weapon Modifier",
                                    1.5, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    1.5, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> EXCALIT_CORAL_BLADE = ITEMS.register("excalit_coral_blade", () ->
            new MagicSwordItem(ThalrathisTier.ICE, 60, -0.9f, SpellDataRegistryHolder.of(
                    new SpellDataRegistryHolder(SpellRegistry.FROST_STEP_SPELL, 10),
                    new SpellDataRegistryHolder(SpellRegistry.ICICLE_SPELL, 10)),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.ICE_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d4"), "Weapon Modifier",
                                    0.5, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    0.5, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> FROST_CLAYMORE = ITEMS.register("frost_claymore", () ->
            new MagicSwordItem(ThalrathisTier.ICE, 110, -2.5f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.ICE_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d4"), "Weapon Modifier",
                                    1.5, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    1.5, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> FROST_AXE = ITEMS.register("frost_axe", () ->
            new MagicSwordItem(ThalrathisTier.ICE, 120, -2.1f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.ICE_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d4"), "Weapon Modifier",
                                    1.0, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    1.0, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> FROST_SCYTHE = ITEMS.register("frost_scythe", () ->
            new MagicSwordItem(ThalrathisTier.ICE, 120, -2.5f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.ICE_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d4"), "Weapon Modifier",
                                    1.0, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    1.0, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> ICEWHISPER = ITEMS.register("icewhisper_heavy_axe", () -> // ANIMATED::::::::::::::::::::::::::::
            new MagicSwordItem(ThalrathisTier.ICE, 140, -1.9f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.ICE_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d4"), "Weapon Modifier",
                                    1.8, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    1.8, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.RARE)));

    // Nature weapons::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    public static final RegistryObject<Item> ISCARYNN_HEAVY_AXE = ITEMS.register("iscarynn_heavy_axe", () ->
            new MagicSwordItem(ThalrathisTier.NATURE, 130, -2.8f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.NATURE_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d4"), "Weapon Modifier",
                                    2.5, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    2.5, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> SOLPHEER_CLAYMORE = ITEMS.register("solpheer_claymore", () ->
            new MagicSwordItem(ThalrathisTier.NATURE, 150, -2.6f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.NATURE_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d4"), "Weapon Modifier",
                                    2.0, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    2.0, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> SELENIAR_SCYTHE = ITEMS.register("seleniar_scythe", () ->
            new MagicSwordItem(ThalrathisTier.NATURE, 120, -2.5f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.NATURE_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d4"), "Weapon Modifier",
                                    1.5, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    1.5, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> LUOCHA_RAPIER = ITEMS.register("luocha_rapier", () ->
            new MagicSwordItem(ThalrathisTier.NATURE, 150, -1.9f, SpellDataRegistryHolder.of(
                    new SpellDataRegistryHolder(SpellRegistry.BLIGHT_SPELL, 8),
                    new SpellDataRegistryHolder(SpellRegistry.ROOT_SPELL, 10)),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.NATURE_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d4"), "Weapon Modifier",
                                    2.5, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    2.5, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> NATURE_PLACEHOLDER1 = ITEMS.register("aciddemon_glaive", () ->
            new MagicSwordItem(ThalrathisTier.NATURE, 99, -2.5f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.NATURE_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d4"), "Weapon Modifier",
                                    1.3, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    1.3, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> NATURE_PLACEHOLDER2 = ITEMS.register("bramblethorn_sword", () ->
            new MagicSwordItem(ThalrathisTier.NATURE, 120, -2.1f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.NATURE_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d4"), "Weapon Modifier",
                                    1.8, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    1.8, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> NATURE_PLACEHOLDER3 = ITEMS.register("terrablade_sword", () ->
            new MagicSwordItem(ThalrathisTier.NATURE, 99, -2.5f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.NATURE_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d4"), "Weapon Modifier",
                                    1.0, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    1.0, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> NATURE_PLACEHOLDER4 = ITEMS.register("green_scythe", () ->
            new MagicSwordItem(ThalrathisTier.NATURE, 140, -2.1f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.NATURE_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d4"), "Weapon Modifier",
                                    2.0, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    2.0, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> NATURE_PLACEHOLDER5 = ITEMS.register("floral_long_sword", () ->
            new MagicSwordItem(ThalrathisTier.NATURE, 120, -2.5f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.NATURE_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d4"), "Weapon Modifier",
                                    1.7, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    1.7, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> NATURE_PLACEHOLDER6 = ITEMS.register("floral_rapier", () ->
            new MagicSwordItem(ThalrathisTier.NATURE, 100, -2.5f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.NATURE_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d4"), "Weapon Modifier",
                                    1.0, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    1.0, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> NATURE_PLACEHOLDER7 = ITEMS.register("mysticalspellblade_rapier", () ->
            new MagicSwordItem(ThalrathisTier.NATURE, 140, -2.5f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.NATURE_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d4"), "Weapon Modifier",
                                    2.3, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    2.3, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> NATURE_PLACEHOLDER8 = ITEMS.register("forest_guardian_glaive", () ->
            new MagicSwordItem(ThalrathisTier.NATURE, 120, -2.1f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.NATURE_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d4"), "Weapon Modifier",
                                    1.3, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    1.3, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));
    // Holy weapons::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    public static final RegistryObject<Item> TRINITY_LANCE = ITEMS.register("trinity_lance", () ->
            new MagicSwordItem(ThalrathisTier.HOLY, 140, -2.3f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.HOLY_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d4"), "Weapon Modifier",
                                    2.5, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    2.5, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> EXCALIBUR_CLAYMORE = ITEMS.register("excalibur_claymore", () ->
            new MagicSwordItem(ThalrathisTier.HOLY, 120, -2.1f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.HOLY_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d4"), "Weapon Modifier",
                                    1.0, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    1.0, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> SHARIACK_CLAYMORE = ITEMS.register("shariack_claymore", () ->
            new MagicSwordItem(ThalrathisTier.HOLY, 140, -2.3f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.HOLY_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d4"), "Weapon Modifier",
                                    1.5, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    1.5, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> HYMN_CLAYMORE = ITEMS.register("durandal_claymore", () ->
            new MagicSwordItem(ThalrathisTier.HOLY, 160, -2.6f, SpellDataRegistryHolder.of(
                    new SpellDataRegistryHolder(SpellRegistry.BLIGHT_SPELL, 8),
                    new SpellDataRegistryHolder(SpellRegistry.ROOT_SPELL, 10)),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.HOLY_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d4"), "Weapon Modifier",
                                    2.0, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    2.0, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> HOLY_PLACEHOLDER1 = ITEMS.register("divine_scythe", () ->
            new MagicSwordItem(ThalrathisTier.HOLY, 130, -1.9f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.HOLY_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d4"), "Weapon Modifier",
                                    1.5, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    1.5, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> HOLY_PLACEHOLDER2 = ITEMS.register("divine_spear", () ->
            new MagicSwordItem(ThalrathisTier.HOLY, 120, -1.9f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.HOLY_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d4"), "Weapon Modifier",
                                    1.5, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    1.5, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> HOLY_PLACEHOLDER3 = ITEMS.register("divine_claymore", () ->
            new MagicSwordItem(ThalrathisTier.HOLY, 180, -2.1f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.HOLY_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d4"), "Weapon Modifier",
                                    2.5, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    2.5, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> HOLY_PLACEHOLDER4 = ITEMS.register("rhitta_axe", () ->
            new MagicSwordItem(ThalrathisTier.HOLY, 140, -2.3f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.HOLY_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d4"), "Weapon Modifier",
                                    2.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    2.1, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    // Evocation weapons::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    public static final RegistryObject<Item> EVOCATION_PLACEHOLDER1 = ITEMS.register("mythus_sword", () ->
            new MagicSwordItem(ThalrathisTier.VOCARIS, 110, -2.3f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.EVOCATION_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d4"), "Weapon Modifier",
                                    1.5, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.SUMMON_DAMAGE.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d1"), "Weapon Modifier",
                                    1.5, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    1.5, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> EVOCATION_PLACEHOLDER2 = ITEMS.register("vesper_claymore", () ->
            new MagicSwordItem(ThalrathisTier.VOCARIS, 120, -2.8f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.EVOCATION_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d4"), "Weapon Modifier",
                                    1.3, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.SUMMON_DAMAGE.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d1"), "Weapon Modifier",
                                    1.3, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    1.3, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> EVOCATION_PLACEHOLDER3 = ITEMS.register("vita_sword", () ->
            new MagicSwordItem(ThalrathisTier.VOCARIS, 130, -1.9f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.EVOCATION_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d4"), "Weapon Modifier",
                                    2.5, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.SUMMON_DAMAGE.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d1"), "Weapon Modifier",
                                    2.5, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    2.5, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> EVOCATION_PLACEHOLDER4 = ITEMS.register("gallagher_glaive", () ->
            new MagicSwordItem(ThalrathisTier.VOCARIS, 150, -2.5f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.EVOCATION_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d4"), "Weapon Modifier",
                                    3.5, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.SUMMON_DAMAGE.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d1"), "Weapon Modifier",
                                    4.5, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    4.5, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> EVOCATION_PLACEHOLDER5 = ITEMS.register("corruptedmythicblade_claymore", () ->
            new MagicSwordItem(ThalrathisTier.VOCARIS, 150, -2.4f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.EVOCATION_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d4"), "Weapon Modifier",
                                    2.3, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.SUMMON_DAMAGE.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d1"), "Weapon Modifier",
                                    2.6, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    2.3, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));
    // Eldritch weapons::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    public static final RegistryObject<Item> ELDRITCH_PLACEHOLDER1 = ITEMS.register("nytheris_dagger", () ->
            new MagicSwordItem(ThalrathisTier.ELDRITCH, 60, -1.6f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.ELDRITCH_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d4"), "Weapon Modifier",
                                    1.0, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    1.0, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> ELDRITCH_PLACEHOLDER2 = ITEMS.register("malakar_heavy_axe", () ->
            new MagicSwordItem(ThalrathisTier.ELDRITCH, 130, -2.4f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.ELDRITCH_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d4"), "Weapon Modifier",
                                    2.0, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    2.0, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> ELDRITCH_PLACEHOLDER3 = ITEMS.register("netherfang_sword", () ->
            new MagicSwordItem(ThalrathisTier.ELDRITCH, 120, -2.5f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.ELDRITCH_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d4"), "Weapon Modifier",
                                    1.5, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    1.5, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> ELDRITCH_PLACEHOLDER4 = ITEMS.register("voidshade_katana", () ->
            new MagicSwordItem(ThalrathisTier.ELDRITCH, 110, -2.5f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.ELDRITCH_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d4"), "Weapon Modifier",
                                    1.5, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    1.5, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> ELDRITCH_PLACEHOLDER5 = ITEMS.register("sculk_glaive", () ->
            new MagicSwordItem(ThalrathisTier.ELDRITCH, 160, -2.6f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.ELDRITCH_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d4"), "Weapon Modifier",
                                    2.0, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    2.0, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> ELDRITCH_PLACEHOLDER6 = ITEMS.register("sculk_scythe", () ->
            new MagicSwordItem(ThalrathisTier.ELDRITCH, 150, -2.1f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.ELDRITCH_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d4"), "Weapon Modifier",
                                    3.0, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    3.0, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> ELDRITCH_PLACEHOLDER7 = ITEMS.register("sculk_sword", () ->
            new MagicSwordItem(ThalrathisTier.ELDRITCH, 140, -2.1f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.ELDRITCH_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d4"), "Weapon Modifier",
                                    2.5, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    2.5, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));
    // Lightning weapons::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    public static final RegistryObject<Item> LIGHTNING_PLACEHOLDER1 = ITEMS.register("zephyron_twin_blade", () ->
            new MagicSwordItem(ThalrathisTier.SPARK, 140, -2.9f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.LIGHTNING_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d4"), "Weapon Modifier",
                                    1.5, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    1.5, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> LIGHTNING_PLACEHOLDER2 = ITEMS.register("stormlash_katana", () ->
            new MagicSwordItem(ThalrathisTier.SPARK, 110, -2.6f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.LIGHTNING_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d4"), "Weapon Modifier",
                                    1.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    1.1, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> LIGHTNING_PLACEHOLDER3 = ITEMS.register("voltaris_sword", () ->
            new MagicSwordItem(ThalrathisTier.SPARK, 110, -2.1f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.LIGHTNING_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d4"), "Weapon Modifier",
                                    1.7, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    1.7, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> LIGHTNING_PLACEHOLDER4 = ITEMS.register("fulminar_katana", () ->
            new MagicSwordItem(ThalrathisTier.SPARK, 130, -2.4f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.LIGHTNING_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d4"), "Weapon Modifier",
                                    1.7, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    1.5, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> LIGHTNING_PLACEHOLDER5 = ITEMS.register("thunderbrand_heavy_axe", () ->
            new MagicSwordItem(ThalrathisTier.SPARK, 140, -2.6f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.LIGHTNING_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d4"), "Weapon Modifier",
                                    2.5, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    2.5, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> LIGHTNING_PLACEHOLDER6 = ITEMS.register("stormbringer_claymore", () ->
            new MagicSwordItem(ThalrathisTier.SPARK, 60, -0.9f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.LIGHTNING_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d4"), "Weapon Modifier",
                                    1.0, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    1.0, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> LIGHTNING_PLACEHOLDER7 = ITEMS.register("storms_edge_twin_blade", () ->
            new MagicSwordItem(ThalrathisTier.SPARK, 120, -1.9f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.LIGHTNING_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d4"), "Weapon Modifier",
                                    2.0, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    2.0, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> LIGHTNING_PLACEHOLDER8 = ITEMS.register("thunderbringer_coral_blade", () ->
            new MagicSwordItem(ThalrathisTier.SPARK, 130, -1.9f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.LIGHTNING_SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d4"), "Weapon Modifier",
                                    2.0, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    2.0, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));
    // Finality weapon::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    public static final RegistryObject<Item> EDGE_KATANA = ITEMS.register("edgeoftheastralplane_katana", () -> // ANIMATED::::::::::::::::::::::::::::
            new MagicSwordItem(ThalrathisTier.FINAL, 999, -1.1f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d22d4"), "Weapon Modifier",
                                    8.0, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.SUMMON_DAMAGE.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d1"), "Weapon Modifier",
                                    8.0, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    8.0, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> TRUE_EX = ITEMS.register("true_excalibur_claymore", () -> // ANIMATED::::::::::::::::::::::::::::
            new MagicSwordItem(ThalrathisTier.FINAL, 599, -1.4f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d22d4"), "Weapon Modifier",
                                    6.5, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.SUMMON_DAMAGE.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d1"), "Weapon Modifier",
                                    6.5, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    6.5, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> AWAKENED_LICH = ITEMS.register("awakened_lichblade_claymore", () -> // ANIMATED::::::::::::::::::::::::::::
            new MagicSwordItem(ThalrathisTier.FINAL, 699, -1.3f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d22d4"), "Weapon Modifier",
                                    7.0, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.SUMMON_DAMAGE.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d1"), "Weapon Modifier",
                                    7.0, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    7.0, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> STOP_SIGN = ITEMS.register("stop_sign_mace", () ->
            new MagicSwordItem(Tiers.NETHERITE, 399, -1.6f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d22d4"), "Weapon Modifier",
                                    5.0, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.SUMMON_DAMAGE.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d1"), "Weapon Modifier",
                                    5.0, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    5.0, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> CREATION_SPLITTER = ITEMS.register("creationsplitter_katana", () -> // ANIMATED::::::::::::::::::::::::::::
            new MagicSwordItem(ThalrathisTier.FINAL, 799, -1.3f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d22d4"), "Weapon Modifier",
                                    7.5, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.SUMMON_DAMAGE.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d1"), "Weapon Modifier",
                                    7.5, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    7.5, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> WHISPERWIND = ITEMS.register("whisperwind_katana", () -> // ANIMATED::::::::::::::::::::::::::::
            new MagicSwordItem(ThalrathisTier.FINAL, 499, -1.6f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d22d4"), "Weapon Modifier",
                                    5.5, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.SUMMON_DAMAGE.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d1"), "Weapon Modifier",
                                    5.5, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    5.5, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> HOLY_MOONLIGHT = ITEMS.register("holy_moonlight_claymore", () -> // ANIMATED::::::::::::::::::::::::::::
            new MagicSwordItem(ThalrathisTier.FINAL, 599, -1.5f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d22d4"), "Weapon Modifier",
                                    6.0, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.SUMMON_DAMAGE.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d1"), "Weapon Modifier",
                                    6.0, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    6.0, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    // Uncategorized :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    public static final RegistryObject<Item> UNCATEGORIZED1 = ITEMS.register("mythicblade_claymore", () ->
            new MagicSwordItem(ThalrathisTier.UNKNOW, 120, -2.6f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d4"), "Weapon Modifier",
                                    1.0, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    1.3, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> UNCATEGORIZED2 = ITEMS.register("demigodsunholy_claymore", () ->
            new MagicSwordItem(ThalrathisTier.UNKNOW, 110, -1.6f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d4"), "Weapon Modifier",
                                    1.0, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    1.0, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> UNCATEGORIZED3 = ITEMS.register("demigodsunholy_halberd", () ->
            new MagicSwordItem(ThalrathisTier.UNKNOW, 130, -2.8f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d4"), "Weapon Modifier",
                                    1.0, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    1.0, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> UNCATEGORIZED4 = ITEMS.register("death_knight_claymore", () ->
            new MagicSwordItem(ThalrathisTier.UNKNOW, 120, -2.2f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d4"), "Weapon Modifier",
                                    1.2, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    1.2, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> UNCATEGORIZED5 = ITEMS.register("death_knight_dagger", () ->
            new MagicSwordItem(ThalrathisTier.UNKNOW, 20, -0.9f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d4"), "Weapon Modifier",
                                    1.0, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    1.0, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> UNCATEGORIZED6 = ITEMS.register("watcher_claymore", () ->
            new MagicSwordItem(ThalrathisTier.UNKNOW, 121, -1.9f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d4"), "Weapon Modifier",
                                    1.2, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    1.2, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> UNCATEGORIZED7 = ITEMS.register("watching_twin_blade", () ->
            new MagicSwordItem(ThalrathisTier.UNKNOW, 71, -1.6f, SpellDataRegistryHolder.of(),
                    Map.of(
                            AttributeRegistry.COOLDOWN_REDUCTION.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d3"), "Weapon Modifier",
                                    0.1, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.SPELL_POWER.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d67d4"), "Weapon Modifier",
                                    1.2, AttributeModifier.Operation.MULTIPLY_BASE),
                            AttributeRegistry.MAX_MANA.get(),
                            new AttributeModifier(UUID.fromString("212b5a66-2b43-4c18-ab05-6de0cc4d64d5"),"Weapon Modifier",
                                    1.2, AttributeModifier.Operation.MULTIPLY_BASE)
                    ),
                    (new Item.Properties()).rarity(Rarity.EPIC)));

    // ARMOR SETS::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    // Finality Armor set
    public static final RegistryObject<Item> FINALITY_HELMET = ITEMS.register("finality_armor_helmet", () ->
            new FinalityArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment()));
    public static final RegistryObject<Item> FINALITY_CHESTPLATE = ITEMS.register("finality_armor_chestplate", () ->
            new FinalityArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment()));
    public static final RegistryObject<Item> FINALITY_LEGGINGS = ITEMS.register("finality_armor_leggings", () ->
            new FinalityArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment()));
    public static final RegistryObject<Item> FINALITY_BOOTS = ITEMS.register("finality_armor_boots", () ->
            new FinalityArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment()));

    // Blood Armor set
    public static final RegistryObject<Item> BLOOD_HELMET = ITEMS.register("blood_armor_helmet", () ->
            new BloodArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment()));
    public static final RegistryObject<Item> BLOOD_CHESTPLATE = ITEMS.register("blood_armor_chestplate", () ->
            new BloodArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment()));
    public static final RegistryObject<Item> BLOOD_LEGGINGS = ITEMS.register("blood_armor_leggings", () ->
            new BloodArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment()));
    public static final RegistryObject<Item> BLOOD_BOOTS = ITEMS.register("blood_armor_boots", () ->
            new BloodArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment()));

    // Ender Armor Set
    public static final RegistryObject<Item> ENDER_HELMET = ITEMS.register("ender_armor_helmet", () ->
            new EnderArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment()));
    public static final RegistryObject<Item> ENDER_CHESTPLATE = ITEMS.register("ender_armor_chestplate", () ->
            new EnderArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment()));
    public static final RegistryObject<Item> ENDER_LEGGINGS = ITEMS.register("ender_armor_leggings", () ->
            new EnderArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment()));
    public static final RegistryObject<Item> ENDER_BOOTS = ITEMS.register("ender_armor_boots", () ->
            new EnderArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment()));

    // Fire Armor Set
    public static final RegistryObject<Item> FIRE_HELMET = ITEMS.register("fire_armor_helmet", () ->
            new FireArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment()));
    public static final RegistryObject<Item> FIRE_CHESTPLATE = ITEMS.register("fire_armor_chestplate", () ->
            new FireArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment()));
    public static final RegistryObject<Item> FIRE_LEGGINGS = ITEMS.register("fire_armor_leggings", () ->
            new FireArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment()));
    public static final RegistryObject<Item> FIRE_BOOTS = ITEMS.register("fire_armor_boots", () ->
            new FireArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment()));

    // Ice Armor Set
    public static final RegistryObject<Item> ICE_HELMET = ITEMS.register("ice_armor_helmet", () ->
            new IceArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment()));
    public static final RegistryObject<Item> ICE_CHESTPLATE = ITEMS.register("ice_armor_chestplate", () ->
            new IceArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment()));
    public static final RegistryObject<Item> ICE_LEGGINGS = ITEMS.register("ice_armor_leggings", () ->
            new IceArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment()));
    public static final RegistryObject<Item> ICE_BOOTS = ITEMS.register("ice_armor_boots", () ->
            new IceArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment()));

    // Lightning Armor Set
    public static final RegistryObject<Item> LIGHTNING_HELMET = ITEMS.register("lightning_armor_helmet", () ->
            new LightningArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment()));
    public static final RegistryObject<Item> LIGHTNING_CHESTPLATE = ITEMS.register("lightning_armor_chestplate", () ->
            new LightningArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment()));
    public static final RegistryObject<Item> LIGHTNING_LEGGINGS = ITEMS.register("lightning_armor_leggings", () ->
            new LightningArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment()));
    public static final RegistryObject<Item> LIGHTNING_BOOTS = ITEMS.register("lightning_armor_boots", () ->
            new LightningArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment()));

    // Evocation Armor Set
    public static final RegistryObject<Item> EVOCATION_HELMET = ITEMS.register("evocation_armor_helmet", () ->
            new EvocationArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment()));
    public static final RegistryObject<Item> EVOCATION_CHESTPLATE = ITEMS.register("evocation_armor_chestplate", () ->
            new EvocationArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment()));
    public static final RegistryObject<Item> EVOCATION_LEGGINGS = ITEMS.register("evocation_armor_leggings", () ->
            new EvocationArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment()));
    public static final RegistryObject<Item> EVOCATION_BOOTS = ITEMS.register("evocation_armor_boots", () ->
            new EvocationArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment()));

    // Holy Armor Set
    public static final RegistryObject<Item> HOLY_HELMET = ITEMS.register("holy_armor_helmet", () ->
            new HolyArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment()));
    public static final RegistryObject<Item> HOLY_CHESTPLATE = ITEMS.register("holy_armor_chestplate", () ->
            new HolyArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment()));
    public static final RegistryObject<Item> HOLY_LEGGINGS = ITEMS.register("holy_armor_leggings", () ->
            new HolyArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment()));
    public static final RegistryObject<Item> HOLY_BOOTS = ITEMS.register("holy_armor_boots", () ->
            new HolyArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment()));

    // Nature Armor Set
    public static final RegistryObject<Item> NATURE_HELMET = ITEMS.register("nature_armor_helmet", () ->
            new NatureArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment()));
    public static final RegistryObject<Item> NATURE_CHESTPLATE = ITEMS.register("nature_armor_chestplate", () ->
            new NatureArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment()));
    public static final RegistryObject<Item> NATURE_LEGGINGS = ITEMS.register("nature_armor_leggings", () ->
            new NatureArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment()));
    public static final RegistryObject<Item> NATURE_BOOTS = ITEMS.register("nature_armor_boots", () ->
            new NatureArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment()));

    // Eldritch Armor Set
    public static final RegistryObject<Item> ELDRITCH_HELMET = ITEMS.register("eldritch_armor_helmet", () ->
            new EldritchArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment()));
    public static final RegistryObject<Item> ELDRITCH_CHESTPLATE = ITEMS.register("eldritch_armor_chestplate", () ->
            new EldritchArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment()));
    public static final RegistryObject<Item> ELDRITCH_LEGGINGS = ITEMS.register("eldritch_armor_leggings", () ->
            new EldritchArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment()));
    public static final RegistryObject<Item> ELDRITCH_BOOTS = ITEMS.register("eldritch_armor_boots", () ->
            new EldritchArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment()));

    // Ice and Fire: SpellBooks replacement for Community Edition fork::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    // Fire Dragon Priest
    public static final RegistryObject<Item> FIRE_DRAGON_PRIEST_HELMET = ITEMS.register("fire_dragon_priest_helmet",
            () -> new FireDragonPriestArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment().fireResistant()));
    public static final RegistryObject<Item> FIRE_DRAGON_PRIEST_CHESTPLATE = ITEMS.register("fire_dragon_priest_chestplate",
            () -> new FireDragonPriestArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment().fireResistant()));
    public static final RegistryObject<Item> FIRE_DRAGON_PRIEST_LEGGINGS = ITEMS.register("fire_dragon_priest_leggings",
            () -> new FireDragonPriestArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment().fireResistant()));
    public static final RegistryObject<Item> FIRE_DRAGON_PRIEST_BOOTS = ITEMS.register("fire_dragon_priest_boots",
            () -> new FireDragonPriestArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment().fireResistant()));

    // Ice Dragon Priest
    public static final RegistryObject<Item> ICE_DRAGON_PRIEST_HELMET = ITEMS.register("ice_dragon_priest_helmet",
            () -> new IceDragonPriestArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment().fireResistant()));
    public static final RegistryObject<Item> ICE_DRAGON_PRIEST_CHESTPLATE = ITEMS.register("ice_dragon_priest_chestplate",
            () -> new IceDragonPriestArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment().fireResistant()));
    public static final RegistryObject<Item> ICE_DRAGON_PRIEST_LEGGINGS = ITEMS.register("ice_dragon_priest_leggings",
            () -> new IceDragonPriestArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment().fireResistant()));
    public static final RegistryObject<Item> ICE_DRAGON_PRIEST_BOOTS = ITEMS.register("ice_dragon_priest_boots",
            () -> new IceDragonPriestArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment().fireResistant()));

    // Lightning Dragon Priest
    public static final RegistryObject<Item> LIGHTNING_DRAGON_PRIEST_HELMET = ITEMS.register("lightning_dragon_priest_helmet",
            () -> new LightningDragonPriestArmorItem(ArmorItem.Type.HELMET, ItemPropertiesHelper.equipment().fireResistant()));
    public static final RegistryObject<Item> LIGHTNING_DRAGON_PRIEST_CHESTPLATE = ITEMS.register("lightning_dragon_priest_chestplate",
            () -> new LightningDragonPriestArmorItem(ArmorItem.Type.CHESTPLATE, ItemPropertiesHelper.equipment().fireResistant()));
    public static final RegistryObject<Item> LIGHTNING_DRAGON_PRIEST_LEGGINGS = ITEMS.register("lightning_dragon_priest_leggings",
            () -> new LightningDragonPriestArmorItem(ArmorItem.Type.LEGGINGS, ItemPropertiesHelper.equipment().fireResistant()));
    public static final RegistryObject<Item> LIGHTNING_DRAGON_PRIEST_BOOTS = ITEMS.register("lightning_dragon_priest_boots",
            () -> new LightningDragonPriestArmorItem(ArmorItem.Type.BOOTS, ItemPropertiesHelper.equipment().fireResistant()));

    public static Collection<RegistryObject<Item>> getThalrathisItems() {
        return ITEMS.getEntries();
    }
}