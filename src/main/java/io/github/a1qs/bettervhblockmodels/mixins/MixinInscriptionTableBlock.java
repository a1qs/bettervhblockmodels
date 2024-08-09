package io.github.a1qs.bettervhblockmodels.mixins;

import io.github.a1qs.bettervhblockmodels.voxelshapes.InscriptionTableShape;
import iskallia.vault.block.InscriptionTableBlock;
import iskallia.vault.block.VaultArtisanStationBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import javax.annotation.Nonnull;

@Mixin(InscriptionTableBlock.class)
public class MixinInscriptionTableBlock {
    /**
     * @author a1qs
     * @reason make Block Hitbox match block model
     */
    @Nonnull
    @Overwrite
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        VoxelShape inscriptionTableShape;
        Direction direction = pState.getValue(VaultArtisanStationBlock.FACING);
        switch (direction) {
            case SOUTH -> inscriptionTableShape = InscriptionTableShape.INSCRIPTION_TABLE_SHAPE_90;
            case EAST -> inscriptionTableShape = InscriptionTableShape.INSCRIPTION_TABLE_SHAPE;
            case NORTH -> inscriptionTableShape = InscriptionTableShape.INSCRIPTION_TABLE_SHAPE_270;
            default -> inscriptionTableShape = InscriptionTableShape.INSCRIPTION_TABLE_SHAPE_180;
        }
        return inscriptionTableShape;
    }
}
