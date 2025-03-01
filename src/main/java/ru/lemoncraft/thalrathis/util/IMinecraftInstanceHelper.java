package ru.lemoncraft.thalrathis.util;

import net.minecraft.world.entity.player.Player;
import org.jetbrains.annotations.Nullable;

public interface IMinecraftInstanceHelper {
    @Nullable
    Player player();
}
