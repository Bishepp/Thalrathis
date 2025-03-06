package ru.lemoncraft.thalrathis.data;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;
import static ru.lemoncraft.thalrathis.data.TModTags.*;

public class TItemTags extends ItemTagsProvider {
    public TItemTags(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags) {
        super(output, lookupProvider, blockTags);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        tag(WIND_FOCUS).add(Items.FEATHER);
        tag(WATER_FOCUS).add(Items.PRISMARINE);
        tag(LIGHT_FOCUS).add(Items.GLOWSTONE_DUST);
        tag(DARK_FOCUS).add(Items.FEATHER);
        tag(MIGHT_FOCUS).add(Items.FEATHER);
        tag(FINALITY_FOCUS).add(Items.FEATHER);
        tag(NIHILITY_FOCUS).add(Items.FEATHER);

    }
}
