package ru.lemoncraft.thalrathis.data;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.EntityTypeTagsProvider;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.common.data.ExistingFileHelper;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import ru.lemoncraft.thalrathis.Thalrathis;

import java.util.concurrent.CompletableFuture;

public class TEntityTypeTags extends EntityTypeTagsProvider {
    public static final TagKey<EntityType<?>> REFLECTION_IMMUNE = TagKey.create(Registries.ENTITY_TYPE, Thalrathis.id("reflection_immune"));
    public static final TagKey<EntityType<?>> ASPHYXIATION_IMMUNE = TagKey.create(Registries.ENTITY_TYPE, Thalrathis.id("asphyxiation_immune"));
    public TEntityTypeTags(PackOutput output, CompletableFuture<HolderLookup.Provider> provider, String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, provider, modId, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        tag(REFLECTION_IMMUNE).add(EntityType.LLAMA_SPIT);
        tag(ASPHYXIATION_IMMUNE).add(EntityType.DROWNED);
    }
}
