package io.github.a1qs.bettervhblockmodels.mixins;

import io.github.a1qs.bettervhblockmodels.config.CommonConfigs;
import io.github.a1qs.bettervhblockmodels.voxelshapes.ToolStationShape;
import iskallia.vault.block.ToolStationBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import javax.annotation.Nonnull;

@Mixin(value = ToolStationBlock.class)
public class MixinToolStationBlock {
    /**
     * @author a1qs
     * @reason make Block Hitbox match block model
     */
    @Nonnull
    @Overwrite
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        if (CommonConfigs.TOOLSTATION.get()) {
            VoxelShape shape;
            Direction direction = pState.getValue(ToolStationBlock.FACING);
            switch (direction) {
                case SOUTH -> shape = ToolStationShape.TOOL_STATION_SHAPE_90;
                case EAST -> shape = ToolStationShape.TOOL_STATION_SHAPE;
                case NORTH -> shape = ToolStationShape.TOOL_STATION_SHAPE_270;
                default -> shape = ToolStationShape.TOOL_STATION_SHAPE_180;
            }
            return shape;
        }
        return ToolStationBlock.SHAPE;
    }
}
