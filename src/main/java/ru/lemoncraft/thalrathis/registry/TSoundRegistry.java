package ru.lemoncraft.thalrathis.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import ru.lemoncraft.thalrathis.Thalrathis;

public class TSoundRegistry extends SoundEvents {
    private static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(Registries.SOUND_EVENT, Thalrathis.MODID);

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }

    public static RegistryObject<SoundEvent> WIND_CAST = registerSoundEvent("cast.generic.wind");
    public static RegistryObject<SoundEvent> WATER_CAST = registerSoundEvent("cast.generic.water");
    public static RegistryObject<SoundEvent> LIGHT_CAST = registerSoundEvent("cast.generic.light");
    public static RegistryObject<SoundEvent> DARK_CAST = registerSoundEvent("cast.generic.dark");
    public static RegistryObject<SoundEvent> MIGHT_CAST = registerSoundEvent("cast.generic.might");
    public static RegistryObject<SoundEvent> FINALITY_CAST = registerSoundEvent("cast.generic.finality");
    public static RegistryObject<SoundEvent> NIHILITY_CAST = registerSoundEvent("cast.generic.nihility");

    public static RegistryObject<SoundEvent> AIRBLAST_CAST = registerSoundEvent("cast.generic.airblast");
    public static RegistryObject<SoundEvent> AIRBLAST_REDIRECT = registerSoundEvent("cast.generic.airblast_success");

    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(Thalrathis.MODID, name)));
    }
}
