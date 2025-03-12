package ru.lemoncraft.thalrathis.common.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import ru.lemoncraft.thalrathis.Thalrathis;
import ru.lemoncraft.thalrathis.common.block.custom.ChibiBisheppBlock;
import ru.lemoncraft.thalrathis.common.block.custom.ChibiLemonBlock;
import ru.lemoncraft.thalrathis.common.block.custom.ChibiMrKillersBlock;
import ru.lemoncraft.thalrathis.common.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Thalrathis.MODID);

    public static final RegistryObject<Block> CHIBI_BISHEPP = BLOCKS.register ("chibi_bishepp",
            () -> new ChibiBisheppBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL).noOcclusion()));

    public static final RegistryObject<Block> CHIBI_MRKILLERS = BLOCKS.register ("chibi_mrkillers",
            () -> new ChibiMrKillersBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL).noOcclusion()));

    public static final RegistryObject<Block> CHIBI_LEMON = BLOCKS.register ("chibi_lemon",
            () -> new ChibiLemonBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL).noOcclusion()));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
