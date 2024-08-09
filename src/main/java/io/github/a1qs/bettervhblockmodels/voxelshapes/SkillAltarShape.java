package io.github.a1qs.bettervhblockmodels.voxelshapes;

import io.github.a1qs.bettervhblockmodels.util.VoxelShapeUtil;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class SkillAltarShape {
    public static final VoxelShape SKILL_ALTAR_SHAPE;
    public static final VoxelShape SKILL_ALTAR_SHAPE_90;
    public static final VoxelShape SKILL_ALTAR_SHAPE_180;
    public static final VoxelShape SKILL_ALTAR_SHAPE_270;
    static {
        VoxelShape[] shape = {
                Shapes.box(0.0625, 0.3125, 0.25, 0.9375, 0.375, 0.75),
                Shapes.box(0.78125, 0.1875, 0.4375, 0.90625, 0.75, 0.5625),
                Shapes.box(0.09375, 0.1875, 0.4375, 0.21875, 0.75, 0.5625),
                Shapes.box(0.21875, 0.390625, 0.46875, 0.78125, 0.953125, 0.53125),
                Shapes.box(0, 0, 0.1875, 1, 0.1875, 0.8125),
                Shapes.box(0.125, 0.1875, 0.3125, 0.875, 0.3125, 0.6875)
        };
        SKILL_ALTAR_SHAPE = VoxelShapeUtil.mergeVoxelShapes(shape);
        SKILL_ALTAR_SHAPE_90 = VoxelShapeUtil.rotateShape(SKILL_ALTAR_SHAPE, 90);
        SKILL_ALTAR_SHAPE_180 = VoxelShapeUtil.rotateShape(SKILL_ALTAR_SHAPE, 180);
        SKILL_ALTAR_SHAPE_270 = VoxelShapeUtil.rotateShape(SKILL_ALTAR_SHAPE, 270);
    }
}
