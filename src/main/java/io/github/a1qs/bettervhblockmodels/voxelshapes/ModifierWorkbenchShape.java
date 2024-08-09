package io.github.a1qs.bettervhblockmodels.voxelshapes;

import io.github.a1qs.bettervhblockmodels.util.VoxelShapeUtil;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class ModifierWorkbenchShape {
    public static final VoxelShape WORKBENCH_SHAPE;
    public static final VoxelShape WORKBENCH_SHAPE_90;
    public static final VoxelShape WORKBENCH_SHAPE_180;
    public static final VoxelShape WORKBENCH_SHAPE_270;

    static {
        VoxelShape[] shape = {
                Shapes.box(0, 0.625, 0, 1, 0.8125, 1),
                Shapes.box(0.1875, 0, 0.1875, 0.8125, 0.625, 0.8125),
                Shapes.box(0.75, 0.8125, 0.625, 0.875, 1, 0.8125),
                Shapes.box(0.75, 0.8125, 0.40625, 0.875, 1, 0.59375),
                Shapes.box(0.75, 0.8125, 0.1875, 0.875, 1, 0.375),
                Shapes.box(0.625, 0.9375, 0.1875, 0.75, 1, 0.375),
                Shapes.box(0.625, 0.9375, 0.40625, 0.75, 1, 0.59375),
                Shapes.box(0.625, 0.9375, 0.625, 0.75, 1, 0.8125),
                Shapes.box(0.25, 0.9375, 0.625, 0.375, 1, 0.8125),
                Shapes.box(0.25, 0.9375, 0.40625, 0.375, 1, 0.59375),
                Shapes.box(0.25, 0.9375, 0.1875, 0.375, 1, 0.375),
                Shapes.box(0.125, 0.8125, 0.1875, 0.25, 1, 0.375),
                Shapes.box(0.125, 0.8125, 0.40625, 0.25, 1, 0.59375),
                Shapes.box(0.125, 0.8125, 0.625, 0.25, 1, 0.8125),
                Shapes.box(0.125, 0.4375, 0.0625, 0.4375, 0.625, 0.1875),
                Shapes.box(0.1875, 0.375, 0.0625, 0.375, 0.4375, 0.1875),
                Shapes.box(0.25, 0.0625, 0.09375, 0.3125, 0.375, 0.15625),
                Shapes.box(0.8125, 0, 0.3125, 1, 0.125, 0.6875),
                Shapes.box(0, 0, 0.3125, 0.1875, 0.125, 0.6875),
                Shapes.box(0.3125, 0, 0.8125, 0.6875, 0.125, 1),
                Shapes.box(0.3125, 0, 0, 0.6875, 0.125, 0.1875),
        };
        WORKBENCH_SHAPE = VoxelShapeUtil.mergeVoxelShapes(shape);
        WORKBENCH_SHAPE_90 = VoxelShapeUtil.rotateShape(WORKBENCH_SHAPE, 90);
        WORKBENCH_SHAPE_180 = VoxelShapeUtil.rotateShape(WORKBENCH_SHAPE, 180);
        WORKBENCH_SHAPE_270 = VoxelShapeUtil.rotateShape(WORKBENCH_SHAPE, 270);
    }
}
