package ru.lemoncraft.thalrathis.common.block.entity;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import ru.lemoncraft.thalrathis.Thalrathis;
import ru.lemoncraft.thalrathis.common.block.ModBlocks;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Thalrathis.MODID);

    public static final RegistryObject<BlockEntityType<ChibiBisheppBlockEntity>> CHIBI_BISHEPP_ENTITY =
            BLOCK_ENTITIES.register("chibi_bishepp_entity", () ->
                    BlockEntityType.Builder.of(ChibiBisheppBlockEntity::new,
                            ModBlocks.CHIBI_BISHEPP.get()).build(null));

    public static final RegistryObject<BlockEntityType<ChibiMrKillersBlockEntity>> CHIBI_MRKILLERS_ENTITY =
            BLOCK_ENTITIES.register("chibi_mrkillers_entity", () ->
                    BlockEntityType.Builder.of(ChibiMrKillersBlockEntity::new,
                            ModBlocks.CHIBI_MRKILLERS.get()).build(null));

    public static final RegistryObject<BlockEntityType<ChibiLemonBlockEntity>> CHIBI_LEMON_ENTITY =
            BLOCK_ENTITIES.register("chibi_lemon_entity", () ->
                    BlockEntityType.Builder.of(ChibiLemonBlockEntity::new,
                            ModBlocks.CHIBI_LEMON.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
