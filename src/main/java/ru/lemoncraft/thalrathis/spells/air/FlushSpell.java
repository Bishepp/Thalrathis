package ru.lemoncraft.thalrathis.spells.air;

import io.redspace.ironsspellbooks.api.config.DefaultConfig;
import io.redspace.ironsspellbooks.api.magic.MagicData;
import io.redspace.ironsspellbooks.api.spells.AbstractSpell;
import io.redspace.ironsspellbooks.api.spells.CastSource;
import io.redspace.ironsspellbooks.api.spells.CastType;
import io.redspace.ironsspellbooks.api.spells.SpellRarity;
import io.redspace.ironsspellbooks.capabilities.magic.MagicManager;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BucketPickup;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.FluidState;
import ru.lemoncraft.thalrathis.Thalrathis;
import ru.lemoncraft.thalrathis.registry.TSchoolRegistry;

public class FlushSpell extends AbstractSpell {

    private final DefaultConfig defaultConfig = new DefaultConfig()
            .setMinRarity(SpellRarity.UNCOMMON)
            .setSchoolResource(TSchoolRegistry.WIND_RESOURCE)
            .setMaxLevel(3)
            .setCooldownSeconds(15)
            .build();
    public FlushSpell() {
        this.manaCostPerLevel = 15;
        this.baseSpellPower = 30;
        this.spellPowerPerLevel = 5;
        this.castTime = 40;
        this.baseManaCost = 50;
    }
    @Override
    public ResourceLocation getSpellResource() {
        return Thalrathis.id("flush");
    }

    @Override
    public DefaultConfig getDefaultConfig() {
        return defaultConfig;
    }

    @Override
    public CastType getCastType() {
        return CastType.LONG;
    }

    @Override
    public void onCast(Level level, int spellLevel, LivingEntity entity, CastSource castSource, MagicData playerMagicData) {
        MagicManager.spawnParticles(level, ParticleTypes.POOF, entity.getX(), entity.getEyePosition().y(), entity.getZ(), 20, 0.5, 0.5, 0.5, spellLevel*0.3f, true);
        this.removeWaterBreadthFirstSearch(level, entity.blockPosition(), 2*spellLevel);
        super.onCast(level, spellLevel, entity, castSource, playerMagicData);
    }
    private boolean removeWaterBreadthFirstSearch(Level level, BlockPos pos, int spellLevel) {
        BlockState spongeState = level.getBlockState(pos);
        if (level.getBlockState(pos).getBlock() instanceof LiquidBlock) {
            level.setBlock(pos, Blocks.AIR.defaultBlockState(), 3);
        }
        return BlockPos.breadthFirstTraversal(pos, 6 + spellLevel, 40 + (25*spellLevel), (p_277519_, p_277492_) -> {
            Direction[] var2 = Direction.values();

            for (Direction direction : var2) {
                p_277492_.accept(p_277519_.relative(direction));
            }

        }, (searchPos) -> {
            if (searchPos.equals(pos)) {
                return true;
            } else {
                BlockState blockstate = level.getBlockState(searchPos);
                FluidState fluidstate = level.getFluidState(searchPos);
                if (!spongeState.canBeHydrated(level, pos, fluidstate, searchPos)) {
                    return false;
                } else {
                    Block patt0$temp = blockstate.getBlock();
                    if (patt0$temp instanceof BucketPickup bucketpickup) {
                        if (!bucketpickup.pickupBlock(level, searchPos, blockstate).isEmpty()) {
                            return true;
                        }
                    }

                    if (blockstate.getBlock() instanceof LiquidBlock) {
                        level.setBlock(searchPos, Blocks.AIR.defaultBlockState(), 3);
                    } else {
                        if (!blockstate.is(Blocks.KELP) && !blockstate.is(Blocks.KELP_PLANT) && !blockstate.is(Blocks.SEAGRASS) && !blockstate.is(Blocks.TALL_SEAGRASS)) {
                            if (blockstate.getValue(BlockStateProperties.WATERLOGGED)) {
                                blockstate.setValue(BlockStateProperties.WATERLOGGED, false);
                            }
                        }

                        BlockEntity blockentity = blockstate.hasBlockEntity() ? level.getBlockEntity(searchPos) : null;
                        Block.dropResources(blockstate, level, searchPos, blockentity);
                        level.setBlock(searchPos, Blocks.AIR.defaultBlockState(), 3);
                    }

                    return true;
                }
            }
        }) > 1;
    }
}
