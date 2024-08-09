package io.github.a1qs.bettervhblockmodels.mixins;

import io.github.a1qs.bettervhblockmodels.voxelshapes.HeraldControllerShape;
import iskallia.vault.block.HeraldControllerBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(value = HeraldControllerBlock.class, remap = false)
public class MixinHeraldControllerBlock {
    /**
     * @author a1qs
     * @reason make Block Hitbox match block model
     */
    @Overwrite
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        VoxelShape shape = HeraldControllerShape.HERALD_CONTROLLER_SHAPE_90;
        return pState.getValue(HeraldControllerBlock.HALF) == DoubleBlockHalf.LOWER ? shape.move(0, 1.0, 0.0) : shape;
    }
}
