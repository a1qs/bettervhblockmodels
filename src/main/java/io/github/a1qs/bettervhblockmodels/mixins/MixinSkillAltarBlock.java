package io.github.a1qs.bettervhblockmodels.mixins;

import io.github.a1qs.bettervhblockmodels.voxelshapes.SkillAltarShape;
import iskallia.vault.block.SkillAltarBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import javax.annotation.Nonnull;

@Mixin(value = SkillAltarBlock.class)
public class MixinSkillAltarBlock {
    /**
     * @author a1qs
     * @reason make Block Hitbox match block model
     */
    @Nonnull
    @Overwrite
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        VoxelShape skillAltarShape;
        Direction direction = pState.getValue(SkillAltarBlock.FACING);
        switch (direction) {
            case SOUTH -> skillAltarShape = SkillAltarShape.SKILL_ALTAR_SHAPE;
            case EAST -> skillAltarShape = SkillAltarShape.SKILL_ALTAR_SHAPE_270;
            case NORTH -> skillAltarShape = SkillAltarShape.SKILL_ALTAR_SHAPE_180;
            default -> skillAltarShape = SkillAltarShape.SKILL_ALTAR_SHAPE_90;
        }
        return skillAltarShape;
    }
}
