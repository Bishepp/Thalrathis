package ru.lemoncraft.thalrathis.registry;

import net.minecraft.core.registries.*;
import net.minecraft.network.chat.*;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.*;
import net.minecraftforge.fml.common.*;
import net.minecraftforge.registries.*;
import ru.lemoncraft.thalrathis.Thalrathis;

@Mod.EventBusSubscriber(modid = Thalrathis.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CreativeTabRegistry {

    private static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Thalrathis.MODID);

    public static void register(IEventBus eventBus) {
        TABS.register(eventBus);
    }

    public static final RegistryObject<CreativeModeTab> ARMOR_TAB = TABS.register("armor_item", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup." + Thalrathis.MODID + ".thalrathis_armor_item"))
            .icon(() -> new ItemStack(ItemRegistry.FINALITY_CHESTPLATE.get()))
            .displayItems((enabledFeatures, entries) -> {
                entries.accept(ItemRegistry.FINALITY_HELMET.get());
                entries.accept(ItemRegistry.FINALITY_CHESTPLATE.get());
                entries.accept(ItemRegistry.FINALITY_LEGGINGS.get());
                entries.accept(ItemRegistry.FINALITY_BOOTS.get());

                entries.accept(ItemRegistry.BLOOD_HELMET.get());
                entries.accept(ItemRegistry.BLOOD_CHESTPLATE.get());
                entries.accept(ItemRegistry.BLOOD_LEGGINGS.get());
                entries.accept(ItemRegistry.BLOOD_BOOTS.get());

                entries.accept(ItemRegistry.ENDER_HELMET.get());
                entries.accept(ItemRegistry.ENDER_CHESTPLATE.get());
                entries.accept(ItemRegistry.ENDER_LEGGINGS.get());
                entries.accept(ItemRegistry.ENDER_BOOTS.get());

                entries.accept(ItemRegistry.FIRE_HELMET.get());
                entries.accept(ItemRegistry.FIRE_CHESTPLATE.get());
                entries.accept(ItemRegistry.FIRE_LEGGINGS.get());
                entries.accept(ItemRegistry.FIRE_BOOTS.get());

                entries.accept(ItemRegistry.ICE_HELMET.get());
                entries.accept(ItemRegistry.ICE_CHESTPLATE.get());
                entries.accept(ItemRegistry.ICE_LEGGINGS.get());
                entries.accept(ItemRegistry.ICE_BOOTS.get());

                entries.accept(ItemRegistry.LIGHTNING_HELMET.get());
                entries.accept(ItemRegistry.LIGHTNING_CHESTPLATE.get());
                entries.accept(ItemRegistry.LIGHTNING_LEGGINGS.get());
                entries.accept(ItemRegistry.LIGHTNING_BOOTS.get());

                entries.accept(ItemRegistry.NATURE_HELMET.get());
                entries.accept(ItemRegistry.NATURE_CHESTPLATE.get());
                entries.accept(ItemRegistry.NATURE_LEGGINGS.get());
                entries.accept(ItemRegistry.NATURE_BOOTS.get());

                entries.accept(ItemRegistry.HOLY_HELMET.get());
                entries.accept(ItemRegistry.HOLY_CHESTPLATE.get());
                entries.accept(ItemRegistry.HOLY_LEGGINGS.get());
                entries.accept(ItemRegistry.HOLY_BOOTS.get());

                entries.accept(ItemRegistry.EVOCATION_HELMET.get());
                entries.accept(ItemRegistry.EVOCATION_CHESTPLATE.get());
                entries.accept(ItemRegistry.EVOCATION_LEGGINGS.get());
                entries.accept(ItemRegistry.EVOCATION_BOOTS.get());

                entries.accept(ItemRegistry.ELDRITCH_HELMET.get());
                entries.accept(ItemRegistry.ELDRITCH_CHESTPLATE.get());
                entries.accept(ItemRegistry.ELDRITCH_LEGGINGS.get());
                entries.accept(ItemRegistry.ELDRITCH_BOOTS.get());

                entries.accept(ItemRegistry.FIRE_DRAGON_PRIEST_HELMET.get());
                entries.accept(ItemRegistry.FIRE_DRAGON_PRIEST_CHESTPLATE.get());
                entries.accept(ItemRegistry.FIRE_DRAGON_PRIEST_LEGGINGS.get());
                entries.accept(ItemRegistry.FIRE_DRAGON_PRIEST_BOOTS.get());

                entries.accept(ItemRegistry.ICE_DRAGON_PRIEST_HELMET.get());
                entries.accept(ItemRegistry.ICE_DRAGON_PRIEST_CHESTPLATE.get());
                entries.accept(ItemRegistry.ICE_DRAGON_PRIEST_LEGGINGS.get());
                entries.accept(ItemRegistry.ICE_DRAGON_PRIEST_BOOTS.get());

                entries.accept(ItemRegistry.LIGHTNING_DRAGON_PRIEST_HELMET.get());
                entries.accept(ItemRegistry.LIGHTNING_DRAGON_PRIEST_CHESTPLATE.get());
                entries.accept(ItemRegistry.LIGHTNING_DRAGON_PRIEST_LEGGINGS.get());
                entries.accept(ItemRegistry.LIGHTNING_DRAGON_PRIEST_BOOTS.get());
            })
            .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
            .build());

    public static final RegistryObject<CreativeModeTab> EQUIPMENT_TAB = TABS.register("equipment_item", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup." + Thalrathis.MODID + ".thalrathis_equipment_item"))
            .icon(() -> new ItemStack(ItemRegistry.YOMAYO.get()))
            .displayItems((enabledFeatures, entries) -> {
                entries.accept(ItemRegistry.YOMAYO.get());
                entries.accept(ItemRegistry.DRAGONMANCERS_OATHBOOK.get());
                entries.accept(ItemRegistry.SPELLBOOK_PLACEHOLDER1.get());
                entries.accept(ItemRegistry.SPELLBOOK_PLACEHOLDER2.get());
                entries.accept(ItemRegistry.SPELLBOOK_PLACEHOLDER3.get());
                entries.accept(ItemRegistry.SPELLBOOK_PLACEHOLDER4.get());
                entries.accept(ItemRegistry.SPELLBOOK_PLACEHOLDER5.get());
                entries.accept(ItemRegistry.SPELLBOOK_PLACEHOLDER6.get());
                entries.accept(ItemRegistry.SPELLBOOK_PLACEHOLDER7.get());
                entries.accept(ItemRegistry.SPELLBOOK_PLACEHOLDER8.get());
                entries.accept(ItemRegistry.SPELLBOOK_PLACEHOLDER9.get());

                entries.accept(ItemRegistry.DRAGON_PRIEST_STAFF.get());
                entries.accept(ItemRegistry.FIRE_DRAGON_PRIEST_STAFF.get());
                entries.accept(ItemRegistry.ICE_DRAGON_PRIEST_STAFF.get());
                entries.accept(ItemRegistry.LIGHTNING_DRAGON_PRIEST_STAFF.get());

                entries.accept(ItemRegistry.MANA_RING1.get());
                entries.accept(ItemRegistry.MANA_RING2.get());
                entries.accept(ItemRegistry.MANA_RING3.get());
                entries.accept(ItemRegistry.MANA_RING4.get());
                entries.accept(ItemRegistry.MANA_RING5.get());
                entries.accept(ItemRegistry.MANA_RING6.get());
                entries.accept(ItemRegistry.MANA_RING7.get());
                entries.accept(ItemRegistry.MANA_RING8.get());
                entries.accept(ItemRegistry.MANA_RING9.get());

                entries.accept(ItemRegistry.PREDATOR_PICKAXE.get());
            })
            .withTabsBefore(ARMOR_TAB.getKey())
            .build());

    public static final RegistryObject<CreativeModeTab> WEAPONS_TAB = TABS.register("weapon_items", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup." + Thalrathis.MODID + ".thalrathis_weapon_items"))
            .icon(() -> new ItemStack(ItemRegistry.EDGE_KATANA.get()))
            .displayItems((enabledFeatures, entries) -> {
                entries.accept(ItemRegistry.EDGE_KATANA.get());
                entries.accept(ItemRegistry.TRUE_EX.get());
                entries.accept(ItemRegistry.CREATION_SPLITTER.get());
                entries.accept(ItemRegistry.AWAKENED_LICH.get());
                entries.accept(ItemRegistry.STOP_SIGN.get());
                entries.accept(ItemRegistry.WHISPERWIND.get());
                entries.accept(ItemRegistry.HOLY_MOONLIGHT.get());

                entries.accept(ItemRegistry.SANGUREN_KATANA.get());
                entries.accept(ItemRegistry.EVISCERA_SCYTHE.get());
                entries.accept(ItemRegistry.CRAVEX_SWORD.get());
                entries.accept(ItemRegistry.HEMITHAR_LANCE.get());
                entries.accept(ItemRegistry.BLOOD_PLACEHOLDER1.get());
                entries.accept(ItemRegistry.BLOOD_PLACEHOLDER2.get());
                entries.accept(ItemRegistry.BLOOD_PLACEHOLDER3.get());
                entries.accept(ItemRegistry.BLOOD_PLACEHOLDER4.get());
                entries.accept(ItemRegistry.BLOOD_PLACEHOLDER5.get());
                entries.accept(ItemRegistry.BLOOD_PLACEHOLDER6.get());
                entries.accept(ItemRegistry.BLOOD_PLACEHOLDER7.get());
                entries.accept(ItemRegistry.BLOOD_PLACEHOLDER8.get());
                entries.accept(ItemRegistry.BLOOD_PLACEHOLDER9.get());
                entries.accept(ItemRegistry.BLOOD_PLACEHOLDER10.get());

                entries.accept(ItemRegistry.TENEBRIS_CLAYMORE.get());
                entries.accept(ItemRegistry.VELDRIS_SWORD.get());
                entries.accept(ItemRegistry.PANDORA_LANCE.get());
                entries.accept(ItemRegistry.TERMINUS_CLAYMORE.get());
                entries.accept(ItemRegistry.ENDER_PLACEHOLDER1.get());
                entries.accept(ItemRegistry.ENDER_PLACEHOLDER2.get());
                entries.accept(ItemRegistry.ENDER_PLACEHOLDER3.get());
                entries.accept(ItemRegistry.ENDER_PLACEHOLDER4.get());
                entries.accept(ItemRegistry.ENDER_PLACEHOLDER5.get());
                entries.accept(ItemRegistry.ENDER_PLACEHOLDER6.get());
                entries.accept(ItemRegistry.ENDER_PLACEHOLDER7.get());
                entries.accept(ItemRegistry.ENDER_PLACEHOLDER8.get());

                entries.accept(ItemRegistry.INFERIS_HEAVY_AXE.get());
                entries.accept(ItemRegistry.CINDERVEIL_SCYTHE.get());
                entries.accept(ItemRegistry.XERAX_KATANA.get());
                entries.accept(ItemRegistry.PYROCLAST_CLAYMORE.get());
                entries.accept(ItemRegistry.FIRE_PLACEHOLDER1.get());
                entries.accept(ItemRegistry.FIRE_PLACEHOLDER2.get());
                entries.accept(ItemRegistry.FIRE_PLACEHOLDER3.get());
                entries.accept(ItemRegistry.FIRE_PLACEHOLDER4.get());
                entries.accept(ItemRegistry.FIRE_PLACEHOLDER5.get());

                entries.accept(ItemRegistry.SYREES_SCYTHE.get());
                entries.accept(ItemRegistry.GLASIVANE_SCYTHE.get());
                entries.accept(ItemRegistry.CHRONOSCATUS_KATANA.get());
                entries.accept(ItemRegistry.EXCALIT_CORAL_BLADE.get());
                entries.accept(ItemRegistry.FROST_AXE.get());
                entries.accept(ItemRegistry.FROST_CLAYMORE.get());
                entries.accept(ItemRegistry.FROST_SCYTHE.get());
                entries.accept(ItemRegistry.ICEWHISPER.get());

                entries.accept(ItemRegistry.ISCARYNN_HEAVY_AXE.get());
                entries.accept(ItemRegistry.SOLPHEER_CLAYMORE.get());
                entries.accept(ItemRegistry.SELENIAR_SCYTHE.get());
                entries.accept(ItemRegistry.LUOCHA_RAPIER.get());
                entries.accept(ItemRegistry.NATURE_PLACEHOLDER1.get());
                entries.accept(ItemRegistry.NATURE_PLACEHOLDER2.get());
                entries.accept(ItemRegistry.NATURE_PLACEHOLDER3.get());
                entries.accept(ItemRegistry.NATURE_PLACEHOLDER4.get());
                entries.accept(ItemRegistry.NATURE_PLACEHOLDER5.get());
                entries.accept(ItemRegistry.NATURE_PLACEHOLDER6.get());
                entries.accept(ItemRegistry.NATURE_PLACEHOLDER7.get());
                entries.accept(ItemRegistry.NATURE_PLACEHOLDER8.get());

                entries.accept(ItemRegistry.TRINITY_LANCE.get());
                entries.accept(ItemRegistry.EXCALIBUR_CLAYMORE.get());
                entries.accept(ItemRegistry.SHARIACK_CLAYMORE.get());
                entries.accept(ItemRegistry.HYMN_CLAYMORE.get());
                entries.accept(ItemRegistry.HOLY_PLACEHOLDER1.get());
                entries.accept(ItemRegistry.HOLY_PLACEHOLDER2.get());
                entries.accept(ItemRegistry.HOLY_PLACEHOLDER3.get());
                entries.accept(ItemRegistry.HOLY_PLACEHOLDER4.get());

                entries.accept(ItemRegistry.ELDRITCH_PLACEHOLDER1.get());
                entries.accept(ItemRegistry.ELDRITCH_PLACEHOLDER2.get());
                entries.accept(ItemRegistry.ELDRITCH_PLACEHOLDER3.get());
                entries.accept(ItemRegistry.ELDRITCH_PLACEHOLDER4.get());
                entries.accept(ItemRegistry.ELDRITCH_PLACEHOLDER5.get());
                entries.accept(ItemRegistry.ELDRITCH_PLACEHOLDER6.get());
                entries.accept(ItemRegistry.ELDRITCH_PLACEHOLDER7.get());

                entries.accept(ItemRegistry.EVOCATION_PLACEHOLDER1.get());
                entries.accept(ItemRegistry.EVOCATION_PLACEHOLDER2.get());
                entries.accept(ItemRegistry.EVOCATION_PLACEHOLDER3.get());
                entries.accept(ItemRegistry.EVOCATION_PLACEHOLDER4.get());
                entries.accept(ItemRegistry.EVOCATION_PLACEHOLDER5.get());

                entries.accept(ItemRegistry.LIGHTNING_PLACEHOLDER1.get());
                entries.accept(ItemRegistry.LIGHTNING_PLACEHOLDER2.get());
                entries.accept(ItemRegistry.LIGHTNING_PLACEHOLDER3.get());
                entries.accept(ItemRegistry.LIGHTNING_PLACEHOLDER4.get());
                entries.accept(ItemRegistry.LIGHTNING_PLACEHOLDER5.get());
                entries.accept(ItemRegistry.LIGHTNING_PLACEHOLDER6.get());
                entries.accept(ItemRegistry.LIGHTNING_PLACEHOLDER7.get());
                entries.accept(ItemRegistry.LIGHTNING_PLACEHOLDER8.get());

                entries.accept(ItemRegistry.WAXWEAVER.get());
                entries.accept(ItemRegistry.WICKPIERCER.get());

                entries.accept(ItemRegistry.AQUATIC_PLACEHOLDER1.get());
                entries.accept(ItemRegistry.AQUATIC_PLACEHOLDER2.get());

                entries.accept(ItemRegistry.CYBERNETIC_PLACEHOLDER1.get());
                entries.accept(ItemRegistry.CYBERNETIC_PLACEHOLDER2.get());
                entries.accept(ItemRegistry.CYBERNETIC_PLACEHOLDER3.get());
                entries.accept(ItemRegistry.CYBERNETIC_PLACEHOLDER4.get());
                entries.accept(ItemRegistry.CYBERNETIC_PLACEHOLDER5.get());

                entries.accept(ItemRegistry.UNCATEGORIZED1.get());
                entries.accept(ItemRegistry.UNCATEGORIZED2.get());
                entries.accept(ItemRegistry.UNCATEGORIZED3.get());
                entries.accept(ItemRegistry.UNCATEGORIZED4.get());
                entries.accept(ItemRegistry.UNCATEGORIZED5.get());
                entries.accept(ItemRegistry.UNCATEGORIZED6.get());
                entries.accept(ItemRegistry.UNCATEGORIZED7.get());
            })
            .withTabsBefore(EQUIPMENT_TAB.getKey())
            .build());

    public static final RegistryObject<CreativeModeTab> MATERIALS_TAB = TABS.register("material_item", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup." + Thalrathis.MODID + ".thalrathis_material_item"))
            .icon(() -> new ItemStack(ItemRegistry.TENEBRIS_SHARD.get()))
            .displayItems((enabledFeatures, entries) -> {
                entries.accept(ItemRegistry.BASIC_SHARD.get());
                entries.accept(ItemRegistry.TENEBRIS_SHARD.get());
                entries.accept(ItemRegistry.SANGUIS_SHARD.get());
                entries.accept(ItemRegistry.FLAMARA_SHARD.get());
                entries.accept(ItemRegistry.OBSCURUM_SHARD.get());
                entries.accept(ItemRegistry.GELIDUS_SHARD.get());
                entries.accept(ItemRegistry.VERDALIS_SHARD.get());
                entries.accept(ItemRegistry.SANCTARIS_SHARD.get());
                entries.accept(ItemRegistry.VOCARIS_SHARD.get());
                entries.accept(ItemRegistry.FULGARIS_SHARD.get());
                entries.accept(ItemRegistry.AQUATA_SHARD.get());
                entries.accept(ItemRegistry.AERO_SHARD.get());
                entries.accept(ItemRegistry.LUMINUS_SHARD.get());
                entries.accept(ItemRegistry.UMBRA_SHARD.get());
                entries.accept(ItemRegistry.ULTIMARA_SHARD.get());
                entries.accept(ItemRegistry.FINALITY_SHARD.get());
                entries.accept(ItemRegistry.NIHILITY_SHARD.get());
            })
            .withTabsBefore(WEAPONS_TAB.getKey())
            .build());
}
