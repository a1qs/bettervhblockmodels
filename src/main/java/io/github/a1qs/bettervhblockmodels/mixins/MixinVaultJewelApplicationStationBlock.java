package io.github.a1qs.bettervhblockmodels.mixins;


import io.github.a1qs.bettervhblockmodels.config.CommonConfigs;
import io.github.a1qs.bettervhblockmodels.voxelshapes.JewelApplicatorShape;
import iskallia.vault.block.VaultJewelApplicationStationBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import javax.annotation.Nonnull;

@Mixin(value = VaultJewelApplicationStationBlock.class)
public class MixinVaultJewelApplicationStationBlock {

    /**
     * @author a1qs
     * @reason make Block Hitbox match block model
     */
    @Overwrite
    @Nonnull
    public VoxelShape getShape(@Nonnull BlockState state, @Nonnull BlockGetter world, @Nonnull BlockPos pos, @Nonnull CollisionContext context) {
        if (CommonConfigs.JEWEL_APPLICATOR.get()) {
            VoxelShape shape;
            Direction direction = state.getValue(VaultJewelApplicationStationBlock.FACING);
            switch (direction) {
                case SOUTH -> shape = JewelApplicatorShape.JEWEL_APPLICATOR_SHAPE_180;
                case EAST -> shape = JewelApplicatorShape.JEWEL_APPLICATOR_SHAPE_90;
                case NORTH -> shape = JewelApplicatorShape.JEWEL_APPLICATOR_SHAPE;
                default -> shape = JewelApplicatorShape.JEWEL_APPLICATOR_SHAPE_270;
            }

            return shape;
        }
        return VaultJewelApplicationStationBlock.SHAPE;
    }
}
