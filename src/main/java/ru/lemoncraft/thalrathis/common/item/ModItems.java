package ru.lemoncraft.thalrathis.common.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import ru.lemoncraft.thalrathis.Thalrathis;
import ru.lemoncraft.thalrathis.common.block.ModBlocks;
import ru.lemoncraft.thalrathis.common.item.custom.*;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Thalrathis.MODID);

    public static final RegistryObject<Item> CHIBI_BISHEPP_ITEM = ITEMS.register("chibi_bishepp",
            () -> new ChibiBisheppBlockItem(ModBlocks.CHIBI_BISHEPP.get(), new Item.Properties()));

    public static final RegistryObject<Item> CHIBI_MRKILLERS_ITEM = ITEMS.register("chibi_mrkillers",
            () -> new ChibiMrKillersBlockItem(ModBlocks.CHIBI_MRKILLERS.get(), new Item.Properties()));

    public static final RegistryObject<Item> CHIBI_LEMON_ITEM = ITEMS.register("chibi_lemon",
            () -> new ChibiLemonBlockItem(ModBlocks.CHIBI_LEMON.get(), new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
