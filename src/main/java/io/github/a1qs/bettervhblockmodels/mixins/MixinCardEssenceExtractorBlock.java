package io.github.a1qs.bettervhblockmodels.mixins;

import io.github.a1qs.bettervhblockmodels.config.CommonConfigs;
import io.github.a1qs.bettervhblockmodels.voxelshapes.CardEssenceExtractorShape;
import iskallia.vault.block.CardEssenceExtractorBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import javax.annotation.Nonnull;

@Mixin(value = CardEssenceExtractorBlock.class)
public class MixinCardEssenceExtractorBlock {
    /**
     * @author a1qs
     * @reason make Block Hitbox match block model
     */
    @Nonnull
    @Overwrite
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        Direction direction = pState.getValue(CardEssenceExtractorBlock.FACING);
        if(CommonConfigs.CARD_ESSENCE_EXTRACTOR.get()) {
            VoxelShape essenceExtractor;
            switch (direction) {
                case EAST -> essenceExtractor = CardEssenceExtractorShape.CARD_ESSENCE_EXTRACTOR_SHAPE_180;
                case SOUTH -> essenceExtractor = CardEssenceExtractorShape.CARD_ESSENCE_EXTRACTOR_SHAPE_270;
                case WEST -> essenceExtractor = CardEssenceExtractorShape.CARD_ESSENCE_EXTRACTOR_SHAPE;
                default -> essenceExtractor = CardEssenceExtractorShape.CARD_ESSENCE_EXTRACTOR_SHAPE_90;
            }
            return essenceExtractor;
        }
        return direction.getAxis() == Direction.Axis.X ? CardEssenceExtractorBlock.SHAPE_EW : CardEssenceExtractorBlock.SHAPE_SN;
    }
}
