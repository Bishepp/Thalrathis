package ru.lemoncraft.thalrathis.registry;

import io.redspace.ironsspellbooks.api.registry.*;
import io.redspace.ironsspellbooks.api.spells.*;
import io.redspace.ironsspellbooks.item.armor.UpgradeType;
import io.redspace.ironsspellbooks.spells.*;

import net.minecraft.core.*;
import net.minecraft.resources.*;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.*;
import net.minecraftforge.registries.*;

import ru.lemoncraft.thalrathis.Thalrathis;
import ru.lemoncraft.thalrathis.spells.air.*;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static ru.lemoncraft.thalrathis.Thalrathis.id;
import static software.bernie.example.registry.EntityRegistry.ENTITIES;

public class TSpellRegistry {

    public static final ResourceKey<Registry<AbstractSpell>> SPELL_REGISTRY_KEY = ResourceKey.createRegistryKey(
            new ResourceLocation(Thalrathis.MODID, "spells"));
    private static final DeferredRegister<AbstractSpell> SPELLS = DeferredRegister.create(SPELL_REGISTRY_KEY, Thalrathis.MODID);
    public static final Supplier<IForgeRegistry<AbstractSpell>> REGISTRY = SPELLS.makeRegistry(() ->
            new RegistryBuilder<AbstractSpell>().disableSaving().disableOverrides());
    private static final NoneSpell noneSpell = new NoneSpell();
    private static final Map<SchoolType, List<AbstractSpell>> SCHOOLS_TO_SPELLS = new HashMap<>();
    public static void register(IEventBus eventBus) {
        SPELLS.register(eventBus);
    }

    public static NoneSpell none() {
        return noneSpell;
    }

    private static RegistryObject<AbstractSpell> registerSpell(AbstractSpell spell) {
        return SPELLS.register(spell.getSpellName(), () -> spell);
    }

    public static AbstractSpell getSpell(String spellId) {
        return getSpell(new ResourceLocation(spellId));
    }

    public static List<AbstractSpell> getEnabledSpells() {
        return SpellRegistry.REGISTRY.get()
                .getValues()
                .stream()
                .filter(AbstractSpell::isEnabled)
                .toList();
    }

    public static List<AbstractSpell> getSpellsForSchool(SchoolType schoolType) {
        return SCHOOLS_TO_SPELLS.computeIfAbsent(schoolType, (school) -> SpellRegistry.REGISTRY.get()
                .getValues()
                .stream()
                .filter(spell -> spell.getSchoolType() == school).collect(Collectors.toList()));
    }

    public static AbstractSpell getSpell(ResourceLocation resourceLocation) {
        var spell = REGISTRY.get().getValue(resourceLocation);
        if (spell == null) {
            return noneSpell;
        }
        return spell;
    }

    public static void onConfigReload() {
        SCHOOLS_TO_SPELLS.clear();
    }

    public static final RegistryObject<EntityType<UpdraftEntity>> UPDRAFT_VISUAL_ENTITY = ENTITIES.register("updraft_visual", () ->
            EntityType.Builder.of(UpdraftEntity::new, MobCategory.MISC)
            .sized(0.5f,0.5f)
            .clientTrackingRange(64)
            .build(id("updraft_visual").toString()));

    public static final RegistryObject<EntityType<WindBladeProjectile>> WIND_BLADE_PROJECTILE =
            ENTITIES.register("wind_blade", () -> EntityType.Builder.<WindBladeProjectile>of(WindBladeProjectile::new, MobCategory.MISC)
                    .sized(.5f, .5f)
                    .clientTrackingRange(64)
                    .build(id("wind_blade").toString()));

    public enum UpgradeTypes implements UpgradeType {
        WIND_SPELL_POWER("wind_power", ItemRegistry.WIND_UPGRADE_ORB, TAttributeRegistry.WIND_SPELL_POWER.get(),
                AttributeModifier.Operation.MULTIPLY_BASE, .05f),
        WATER_SPELL_POWER("water_power", ItemRegistry.WATER_UPGRADE_ORB, TAttributeRegistry.WATER_SPELL_POWER.get(),
                AttributeModifier.Operation.MULTIPLY_BASE, .05f),
        LIGHT_SPELL_POWER("light_power", ItemRegistry.LIGHT_UPGRADE_ORB, TAttributeRegistry.LIGHT_SPELL_POWER.get(),
                AttributeModifier.Operation.MULTIPLY_BASE, .05f),
        DARK_SPELL_POWER("dark_power", ItemRegistry.DARK_UPGRADE_ORB, TAttributeRegistry.DARK_SPELL_POWER.get(),
                AttributeModifier.Operation.MULTIPLY_BASE, .05f),
        MIGHT_SPELL_POWER("might_power", ItemRegistry.MIGHT_UPGRADE_ORB, TAttributeRegistry.MIGHT_SPELL_POWER.get(),
                AttributeModifier.Operation.MULTIPLY_BASE, .05f),
        FINALITY_SPELL_POWER("finality_power", ItemRegistry.FINALITY_UPGRADE_ORB, TAttributeRegistry.FINALITY_SPELL_POWER.get(),
                AttributeModifier.Operation.MULTIPLY_BASE, .05f),
        NIHILITY_SPELL_POWER("nihility_power", ItemRegistry.NIHILITY_UPGRADE_ORB, TAttributeRegistry.NIHILITY_SPELL_POWER.get(),
                AttributeModifier.Operation.MULTIPLY_BASE, .05f);

        final Attribute attribute;
        final AttributeModifier.Operation operation;
        final float amountPerUpgrade;
        final ResourceLocation id;
        final Optional<Supplier<Item>> containerItem;

        UpgradeTypes(String key, Supplier<Item> containerItem, Attribute attribute, AttributeModifier.Operation operation, float amountPerUpgrade) {
            this(key, Optional.of(containerItem), attribute, operation, amountPerUpgrade);
        }

        UpgradeTypes(String key, Optional<Supplier<Item>> containerItem, Attribute attribute, AttributeModifier.Operation operation, float amountPerUpgrade) {
            this.id = Thalrathis.id(key);
            this.attribute = attribute;
            this.operation = operation;
            this.amountPerUpgrade = amountPerUpgrade;
            this.containerItem = containerItem;
            UpgradeType.registerUpgrade(this);
        }

        @Override
        public Attribute getAttribute() {
            return attribute;
        }

        @Override
        public AttributeModifier.Operation getOperation() {
            return operation;
        }

        @Override
        public float getAmountPerUpgrade() {
            return amountPerUpgrade;
        }

        @Override
        public ResourceLocation getId() {
            return id;
        }

        @Override
        public Optional<Supplier<Item>> getContainerItem() {
            return containerItem;
        }
    }
    // WIND
    public static final RegistryObject<AbstractSpell> UPDRAFT = registerSpell(new UpdraftSpell());
    public static final RegistryObject<AbstractSpell> AIRSTEP = registerSpell(new AirstepSpell());
    public static final RegistryObject<AbstractSpell> ASPHYXIATE = registerSpell(new AsphyxiateSpell());
    public static final RegistryObject<AbstractSpell> FEATHER_FALL = registerSpell(new FeatherFallSpell());
    public static final RegistryObject<AbstractSpell> AIRBLAST = registerSpell(new AirblastSpell());
    public static final RegistryObject<AbstractSpell> WIND_BLADE = registerSpell(new WindBladeSpell());
    public static final RegistryObject<AbstractSpell> FLUSH = registerSpell(new FlushSpell());
    public static final RegistryObject<AbstractSpell> DASH = registerSpell(new DashSpell());

    // WATER

    // LIGHT

    // DARK

    // MIGHT

    // FINALITY

    // NIHILITY
}
