package io.github.a1qs.bettervhblockmodels.mixins;

import io.github.a1qs.bettervhblockmodels.voxelshapes.StabilizerShape;
import iskallia.vault.block.StabilizerBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(value = StabilizerBlock.class, remap = false)
public class MixinStabilizerBlock {
    /**
     * @author a1qs
     * @reason make Block Hitbox match block model
     */
    @Overwrite
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        VoxelShape shape = StabilizerShape.STABILIZER_SHAPE;
        return pState.getValue(StabilizerBlock.HALF) == DoubleBlockHalf.UPPER ? shape.move(0.0, -1.0, 0.0) : shape;
    }
}
