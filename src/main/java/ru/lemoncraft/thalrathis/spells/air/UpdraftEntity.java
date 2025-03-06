package ru.lemoncraft.thalrathis.spells.air;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class UpdraftEntity extends Entity {

    public UpdraftEntity(EntityType<?> entityType, Level level) {
        super(entityType, level);
        this.setXRot(-90);
        this.setYRot(0);
    }

    @Override
    protected void defineSynchedData() {}

    @Override
    protected void readAdditionalSaveData(@NotNull CompoundTag compoundTag) {}

    @Override
    protected void addAdditionalSaveData(@NotNull CompoundTag compoundTag) {}

    @Override
    public void tick() {
        double x = this.getX();
        double y = this.getY();
        double z = this.getZ();
        if (this.tickCount > 8) {
            this.discard();
        } else {
            super.tick();
        }

        this.setPosRaw(x, y, z);
    }
}
