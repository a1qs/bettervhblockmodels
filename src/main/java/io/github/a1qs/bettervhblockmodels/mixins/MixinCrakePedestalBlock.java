package io.github.a1qs.bettervhblockmodels.mixins;

import io.github.a1qs.bettervhblockmodels.config.CommonConfigs;
import io.github.a1qs.bettervhblockmodels.voxelshapes.CrakePedestalShape;
import iskallia.vault.block.CrakePedestalBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import javax.annotation.Nonnull;

@Mixin(value = CrakePedestalBlock.class)
public class MixinCrakePedestalBlock {

    /**
     * @author a1qs
     * @reason make Block Hitbox match block model
     */
    @Overwrite
    @Nonnull
    public VoxelShape getShape(@Nonnull BlockState state, @Nonnull BlockGetter world, @Nonnull BlockPos pos, @Nonnull CollisionContext context) {
        if(CommonConfigs.CRAKE_PEDESTAL_BLOCK.get()) {
            return CrakePedestalShape.CRAKE_PEDESTAL_SHAPE;
        }
        return CrakePedestalShape.DEFAULT_CRAKE_SHAPE;
    }
}
