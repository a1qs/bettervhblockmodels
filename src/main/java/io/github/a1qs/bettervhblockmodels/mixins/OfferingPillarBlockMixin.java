package io.github.a1qs.bettervhblockmodels.mixins;

import io.github.a1qs.bettervhblockmodels.config.CommonConfigs;
import io.github.a1qs.bettervhblockmodels.voxelshapes.ScavengerAltarShape;
import iskallia.vault.block.OfferingPillarBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(value = OfferingPillarBlock.class)
public class OfferingPillarBlockMixin {
    /**
     * @author a1qs
     * @reason make Block Hitbox match block model
     */
    @Overwrite
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        if (CommonConfigs.OFFERING_PILLAR.get()) {
            return ScavengerAltarShape.SCAVENGER_ALTAR_SHAPE;
        }
        return ScavengerAltarShape.SCAVENGER_DEFAULT_SHAPE;
    }
}
