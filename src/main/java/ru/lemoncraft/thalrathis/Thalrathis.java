package ru.lemoncraft.thalrathis;

import com.mojang.logging.*;

import io.redspace.ironsspellbooks.item.*;
import io.redspace.ironsspellbooks.render.*;

import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.resources.*;
import net.minecraft.util.*;

import net.minecraftforge.api.distmarker.*;
import net.minecraftforge.common.*;
import net.minecraftforge.event.server.*;
import net.minecraftforge.eventbus.api.*;
import net.minecraftforge.fml.common.*;
import net.minecraftforge.fml.event.lifecycle.*;
import net.minecraftforge.fml.javafmlmod.*;

import org.jetbrains.annotations.NotNull;

import ru.lemoncraft.thalrathis.common.block.ModBlocks;
import ru.lemoncraft.thalrathis.common.block.entity.ModBlockEntities;
import ru.lemoncraft.thalrathis.common.block.entity.client.*;
import ru.lemoncraft.thalrathis.common.item.ModItems;
import ru.lemoncraft.thalrathis.registry.*;

import org.slf4j.*;

import software.bernie.geckolib.GeckoLib;
import top.theillusivec4.curios.api.client.*;


@Mod(Thalrathis.MODID)
public class Thalrathis {
    public static final String MODID = "thalrathis";
    public static final Logger LOGGER = LogUtils.getLogger();
    public static final RandomSource RANDOM = RandomSource.create();


    public Thalrathis() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);
        ItemRegistry.register(modEventBus);
        MinecraftForge.EVENT_BUS.register(this);
        CreativeTabRegistry.register(modEventBus);

        ModBlocks.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlockEntities.register(modEventBus);

        GeckoLib.initialize();

        TSchoolRegistry.register(modEventBus);
        TSpellRegistry.register(modEventBus);
        TAttributeRegistry.register(modEventBus);
        TSoundRegistry.register(modEventBus);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            // curios :3c
            event.enqueueWork(() -> ItemRegistry.getThalrathisItems().stream().filter(item ->
                    item.get() instanceof SpellBook).forEach((item) ->
                    CuriosRendererRegistry.register(item.get(), SpellBookCurioRenderer::new)));

            BlockEntityRenderers.register(ModBlockEntities.CHIBI_BISHEPP_ENTITY.get(), ChibiBisheppBlockRenderer::new);
            BlockEntityRenderers.register(ModBlockEntities.CHIBI_MRKILLERS_ENTITY.get(), ChibiMrKillersBlockRenderer::new);
            BlockEntityRenderers.register(ModBlockEntities.CHIBI_LEMON_ENTITY.get(), ChibiLemonBlockRenderer::new);
        }
    }
    public static ResourceLocation id(@NotNull String path) {
        return new ResourceLocation("thalrathis", path);
    }
}
