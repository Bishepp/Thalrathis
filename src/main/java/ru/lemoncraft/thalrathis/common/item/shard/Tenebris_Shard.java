package ru.lemoncraft.thalrathis.common.item.shard;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import ru.lemoncraft.thalrathis.util.ItemPropertiesHelper;

public class Tenebris_Shard extends Item {
    private static final Component description = Component.translatable("item.thalrathis.tenebris_shard_desc").withStyle(ChatFormatting.LIGHT_PURPLE);
    public Tenebris_Shard(Properties material) {
        super(ItemPropertiesHelper.material());
    }
}
