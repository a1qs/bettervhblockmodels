package io.github.a1qs.bettervhblockmodels.voxelshapes;

import io.github.a1qs.bettervhblockmodels.util.VoxelShapeUtil;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class HeraldControllerShape {
    public static final VoxelShape HERALD_CONTROLLER_SHAPE;
    public static final VoxelShape HERALD_CONTROLLER_SHAPE_90;
    static {
        VoxelShape[] shape = {
                Shapes.box(-0.1875, -1, 0.0625, 1.1875, -0.8125, 0.9375),
                Shapes.box(-0.0625, 0.5, 0.1875, 1.0625, 1.375, 0.8125),
                Shapes.box(0.0625, -0.8125, 0.1875, 0.9375, 0.5, 0.8125),
                Shapes.box(1.0625, -0.25, 0.3125, 1.5, 0.875, 0.6875),
                Shapes.box(-0.5, -0.25, 0.3125, -0.0625, 0.875, 0.6875),
                Shapes.box(0.1875, 1, -0.0625, 0.8125, 1.5625, 0.4375),
                Shapes.box(0.125, 1.375, 0, 0.25, 1.75, 0.125),
                Shapes.box(0.125, 1.4375, 0.25, 0.25, 2, 0.375),
                Shapes.box(0.75, 1.4375, 0.25, 0.875, 2, 0.375),
                Shapes.box(0.75, 1.375, 0, 0.875, 1.75, 0.125),
                Shapes.box(1.0625, 0.9625, 0.25, 1.6875, 1.5875, 0.75),
                Shapes.box(-0.1875, 0.75, 0.0625, -0.0625, 1.625, 0.9375),
                Shapes.box(-0.8125, 0.8125, 0.125, -0.1875, 1.625, 0.875),
                Shapes.box(1.0625, 0.875, 0.28125, 1.75, 1.4375, 0.71875),
        };
        HERALD_CONTROLLER_SHAPE = VoxelShapeUtil.mergeVoxelShapes(shape);
        HERALD_CONTROLLER_SHAPE_90 = VoxelShapeUtil.rotateShape(HERALD_CONTROLLER_SHAPE, 90);
    }
}
