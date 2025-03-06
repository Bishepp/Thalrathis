package ru.lemoncraft.thalrathis.registry;

import io.redspace.ironsspellbooks.api.attribute.MagicRangedAttribute;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraftforge.event.entity.EntityAttributeModificationEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import ru.lemoncraft.thalrathis.Thalrathis;


@Mod.EventBusSubscriber(modid = Thalrathis.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class TAttributeRegistry {

    private static final DeferredRegister<Attribute> ATTRIBUTES = DeferredRegister.create(ForgeRegistries.ATTRIBUTES, Thalrathis.MODID);

    public static void register(IEventBus eventBus) {
        ATTRIBUTES.register(eventBus);
    }

    public static final RegistryObject<Attribute> WIND_MAGIC_RESIST = newResistanceAttribute("wind");
    public static final RegistryObject<Attribute> WATER_MAGIC_RESIST = newResistanceAttribute("water");
    public static final RegistryObject<Attribute> LIGHT_MAGIC_RESIST = newResistanceAttribute("light");
    public static final RegistryObject<Attribute> DARK_MAGIC_RESIST = newResistanceAttribute("dark");
    public static final RegistryObject<Attribute> MIGHT_MAGIC_RESIST = newResistanceAttribute("might");
    public static final RegistryObject<Attribute> FINALITY_MAGIC_RESIST = newResistanceAttribute("finality");
    public static final RegistryObject<Attribute> NIHILITY_MAGIC_RESIST = newResistanceAttribute("nihility");

    public static final RegistryObject<Attribute> WIND_SPELL_POWER = newPowerAttribute("wind");
    public static final RegistryObject<Attribute> WATER_SPELL_POWER = newPowerAttribute("water");
    public static final RegistryObject<Attribute> LIGHT_SPELL_POWER = newPowerAttribute("light");
    public static final RegistryObject<Attribute> DARK_SPELL_POWER = newPowerAttribute("dark");
    public static final RegistryObject<Attribute> MIGHT_SPELL_POWER = newPowerAttribute("might");
    public static final RegistryObject<Attribute> FINALITY_SPELL_POWER = newPowerAttribute("finality");
    public static final RegistryObject<Attribute> NIHILITY_SPELL_POWER = newPowerAttribute("nihility");

    @SubscribeEvent
    public static void modifyEntityAttributes(EntityAttributeModificationEvent e) {
        e.getTypes().forEach(entity -> ATTRIBUTES.getEntries().forEach(attribute -> e.add(entity, attribute.get())));
    }

    private static RegistryObject<Attribute> newResistanceAttribute(String id) {
        return ATTRIBUTES.register(id + "_magic_resist", () -> (new MagicRangedAttribute("attribute.thalrathis." + id + "_magic_resist", 1.0D, -100, 100).setSyncable(true)));
    }

    private static RegistryObject<Attribute> newPowerAttribute(String id) {
        return ATTRIBUTES.register(id + "_spell_power", () -> (new MagicRangedAttribute("attribute.thalrathis." + id + "_spell_power", 1.0D, -100, 100).setSyncable(true)));
    }
}