package ru.lemoncraft.thalrathis.registry;

import io.redspace.ironsspellbooks.api.registry.SchoolRegistry;
import io.redspace.ironsspellbooks.api.spells.SchoolType;
import net.minecraft.ChatFormatting;
import net.minecraft.core.Registry;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.client.event.ModelEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryBuilder;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;
import ru.lemoncraft.thalrathis.Thalrathis;
import ru.lemoncraft.thalrathis.data.damage.TDamageTypes;
import ru.lemoncraft.thalrathis.data.TModTags;

import java.util.function.Supplier;

public class TSchoolRegistry extends SchoolRegistry {
    public static final ResourceKey<Registry<SchoolType>> SCHOOL_REGISTRY_KEY =
            ResourceKey.createRegistryKey(new ResourceLocation(Thalrathis.MODID, "schools"));
    private static final DeferredRegister<SchoolType> SCHOOLS = DeferredRegister.create(SCHOOL_REGISTRY_KEY, Thalrathis.MODID);
    public static final Supplier<IForgeRegistry<SchoolType>> REGISTRY = SCHOOLS.makeRegistry(() ->
            new RegistryBuilder<SchoolType>().disableSaving().disableOverrides());

    public static void register(IEventBus eventBus) {
        SCHOOLS.register(eventBus);
        eventBus.addListener(SchoolRegistry::clientSetup);
    }

    private static RegistryObject<SchoolType> registerSchool(SchoolType schoolType) {
        return SCHOOLS.register(schoolType.getId().getPath(), () -> schoolType);
    }

    public static SchoolType getSchool(ResourceLocation resourceLocation) {
        return REGISTRY.get().getValue(resourceLocation);
    }

    public static final ResourceLocation WIND_RESOURCE = Thalrathis.id("wind");
    public static final ResourceLocation WATER_RESOURCE = Thalrathis.id("water");
    public static final ResourceLocation LIGHT_RESOURCE = Thalrathis.id("light");
    public static final ResourceLocation DARK_RESOURCE = Thalrathis.id("dark");
    public static final ResourceLocation MIGHT_RESOURCE = Thalrathis.id("might");
    public static final ResourceLocation FINALITY_RESOURCE = Thalrathis.id("finality");
    public static final ResourceLocation NIHILITY_RESOURCE = Thalrathis.id("nihility");

    public static final RegistryObject<SchoolType> WIND = registerSchool(new SchoolType(
            WIND_RESOURCE,
            TModTags.WIND_FOCUS,
            Component.translatable("school.thalrathis.wind").withStyle(ChatFormatting.WHITE),
            LazyOptional.of(TAttributeRegistry.WIND_SPELL_POWER::get),
            LazyOptional.of(TAttributeRegistry.WIND_MAGIC_RESIST::get),
            LazyOptional.of(TSoundRegistry.WIND_CAST::get),
            TDamageTypes.WIND_MAGIC
    ));

    public static final RegistryObject<SchoolType> WATER = registerSchool(new SchoolType(
            WATER_RESOURCE,
            TModTags.WATER_FOCUS,
            Component.translatable("school.thalrathis.water").withStyle(ChatFormatting.DARK_BLUE),
            LazyOptional.of(TAttributeRegistry.WATER_SPELL_POWER::get),
            LazyOptional.of(TAttributeRegistry.WATER_MAGIC_RESIST::get),
            LazyOptional.of(TSoundRegistry.WATER_CAST::get),
            TDamageTypes.WATER_MAGIC
    ));

    public static final RegistryObject<SchoolType> LIGHT = registerSchool(new SchoolType(
            LIGHT_RESOURCE,
            TModTags.LIGHT_FOCUS,
            Component.translatable("school.thalrathis.light").withStyle(ChatFormatting.YELLOW),
            LazyOptional.of(TAttributeRegistry.LIGHT_SPELL_POWER::get),
            LazyOptional.of(TAttributeRegistry.LIGHT_MAGIC_RESIST::get),
            LazyOptional.of(TSoundRegistry.LIGHT_CAST::get),
            TDamageTypes.LIGHT_MAGIC
    ));

    public static final RegistryObject<SchoolType> DARK = registerSchool(new SchoolType(
            DARK_RESOURCE,
            TModTags.DARK_FOCUS,
            Component.translatable("school.thalrathis.dark").withStyle(ChatFormatting.DARK_GRAY),
            LazyOptional.of(TAttributeRegistry.DARK_SPELL_POWER::get),
            LazyOptional.of(TAttributeRegistry.DARK_MAGIC_RESIST::get),
            LazyOptional.of(TSoundRegistry.DARK_CAST::get),
            TDamageTypes.DARK_MAGIC
    ));

    public static final RegistryObject<SchoolType> MIGHT = registerSchool(new SchoolType(
            MIGHT_RESOURCE,
            TModTags.MIGHT_FOCUS,
            Component.translatable("school.thalrathis.might").withStyle(ChatFormatting.GRAY),
            LazyOptional.of(TAttributeRegistry.MIGHT_SPELL_POWER::get),
            LazyOptional.of(TAttributeRegistry.MIGHT_MAGIC_RESIST::get),
            LazyOptional.of(TSoundRegistry.MIGHT_CAST::get),
            TDamageTypes.MIGHT_MAGIC
    ));

    public static final RegistryObject<SchoolType> FINALITY = registerSchool(new SchoolType(
            FINALITY_RESOURCE,
            TModTags.FINALITY_FOCUS,
            Component.translatable("school.thalrathis.finality").withStyle(ChatFormatting.DARK_PURPLE),
            LazyOptional.of(TAttributeRegistry.FINALITY_SPELL_POWER::get),
            LazyOptional.of(TAttributeRegistry.FINALITY_MAGIC_RESIST::get),
            LazyOptional.of(TSoundRegistry.FINALITY_CAST::get),
            TDamageTypes.FINALITY_MAGIC));

    public static final RegistryObject<SchoolType> NIHILITY = registerSchool(new SchoolType(
            NIHILITY_RESOURCE,
            TModTags.NIHILITY_FOCUS,
            Component.translatable("school.thalrathis.nihility").withStyle(ChatFormatting.DARK_PURPLE),
            LazyOptional.of(TAttributeRegistry.NIHILITY_SPELL_POWER::get),
            LazyOptional.of(TAttributeRegistry.NIHILITY_MAGIC_RESIST::get),
            LazyOptional.of(TSoundRegistry.NIHILITY_CAST::get),
            TDamageTypes.NIHILITY_MAGIC));

    @Nullable
    public static SchoolType getSchoolFromFocus(ItemStack focusStack) {
        for (SchoolType school : REGISTRY.get().getValues()) {
            if (school.isFocus(focusStack)) {
                return school;
            }
        }
        return null;
    }

    public static void clientSetup(ModelEvent.RegisterAdditional event) {

    }
}
