package io.github.a1qs.bettervhblockmodels.mixins;

import io.github.a1qs.bettervhblockmodels.config.CommonConfigs;
import io.github.a1qs.bettervhblockmodels.voxelshapes.CrystalWorkbenchShape;
import iskallia.vault.block.CrystalWorkbenchBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import javax.annotation.Nonnull;

@Mixin(value = CrystalWorkbenchBlock.class)
public class MixinCrystalWorkbenchBlock {

    /**
     * @author a1qs
     * @reason make Block Hitbox match block model
     */
    @Overwrite
    @Nonnull
    public VoxelShape getShape(@Nonnull BlockState state, @Nonnull BlockGetter world, @Nonnull BlockPos pos, @Nonnull CollisionContext context) {
        if(CommonConfigs.CRYSTAL_WORKBENCH.get()) {
            return CrystalWorkbenchShape.CRYSTAL_WORKBENCH_SHAPE;
        }
        return CrystalWorkbenchBlock.SHAPE;
    }
}