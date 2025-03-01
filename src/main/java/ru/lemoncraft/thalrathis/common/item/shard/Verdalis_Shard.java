package ru.lemoncraft.thalrathis.common.item.shard;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import ru.lemoncraft.thalrathis.util.ItemPropertiesHelper;

public class Verdalis_Shard extends Item {
    private static final Component description = Component.translatable("item.thalrathis.verdalis_shard_desc").withStyle(ChatFormatting.DARK_GREEN);
    public Verdalis_Shard(Properties material) {
        super(ItemPropertiesHelper.material());
    }
}
