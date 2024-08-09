package io.github.a1qs.bettervhblockmodels.mixins;


import io.github.a1qs.bettervhblockmodels.voxelshapes.MVPCrownShape;
import iskallia.vault.block.MVPCrownBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(value = MVPCrownBlock.class, remap = false)
public class MixinMVPCrownBlock {

    /**
     * @author a1qs
     * @reason make Block Hitbox match block model... my god.
     */
    @Overwrite
    public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context) {
        return MVPCrownShape.MVP_CROWN_SHAPE;
    }
}
