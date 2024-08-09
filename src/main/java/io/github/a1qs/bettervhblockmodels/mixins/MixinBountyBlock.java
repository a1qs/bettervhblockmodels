package io.github.a1qs.bettervhblockmodels.mixins;

import io.github.a1qs.bettervhblockmodels.voxelshapes.BountyTableShape;
import iskallia.vault.block.BountyBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import javax.annotation.Nonnull;

@Mixin(value = BountyBlock.class, remap = false)
public class MixinBountyBlock {
    /**
     * @author a1qs
     * @reason make Block Hitbox match block model
     */
    @Nonnull
    @Overwrite
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        VoxelShape bountyTableShape;
        Direction direction = pState.getValue(BountyBlock.FACING);
        switch (direction) {
            case SOUTH -> bountyTableShape = BountyTableShape.BOUNTY_TABLE_SHAPE_180;
            case EAST -> bountyTableShape = BountyTableShape.BOUNTY_TABLE_SHAPE_90;
            case NORTH -> bountyTableShape = BountyTableShape.BOUNTY_TABLE_SHAPE;
            default -> bountyTableShape = BountyTableShape.BOUNTY_TABLE_SHAPE_270;
        }
        return bountyTableShape;
    }
}
