package io.github.a1qs.bettervhblockmodels.voxelshapes;

import io.github.a1qs.bettervhblockmodels.util.VoxelShapeUtil;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class GridGatewayShape {
    public static final VoxelShape GRID_GATEWAY_SHAPE;
    static {
        VoxelShape[] shape = {
                Shapes.box(0.0625, 0, 0.0625, 0.9375, 0.125, 0.9375),
                Shapes.box(0.0625, 0, 0.0625, 0.9375, 0.125, 0.9375),
                Shapes.box(0.0625, 0, 0.0625, 0.9375, 0.125, 0.9375),
                Shapes.box(0.0625, 0, 0.0625, 0.9375, 0.125, 0.9375),
                Shapes.box(0.0625, 0, 0.0625, 0.9375, 0.125, 0.9375),
                Shapes.box(0.25, 0.125, 0.25, 0.75, 1.0625, 0.75),
                Shapes.box(0.25, 0.125, 0.25, 0.75, 1.0625, 0.75),
                Shapes.box(0.25, 0.125, 0.25, 0.75, 1.0625, 0.75),
                Shapes.box(0.25, 0.125, 0.25, 0.75, 1.0625, 0.75),
                Shapes.box(0.25, 0.125, 0.25, 0.75, 1.0625, 0.75),
                Shapes.box(0.25, 0.125, 0.25, 0.75, 1.0625, 0.75),
                Shapes.box(0.25, 0.125, 0.25, 0.75, 1.0625, 0.75),
                Shapes.box(0.25, 0.125, 0.25, 0.75, 1.0625, 0.75),
                Shapes.box(0.25, 0.125, 0.25, 0.75, 1.0625, 0.75),
                Shapes.box(0.25, 0.125, 0.25, 0.75, 1.0625, 0.75),
                Shapes.box(0.1875, 0.125, 0.1875, 0.3125, 1.125, 0.3125),
                Shapes.box(0.1875, 0.125, 0.6875, 0.3125, 1.125, 0.8125),
                Shapes.box(0.6875, 0.125, 0.6875, 0.8125, 1.125, 0.8125),
                Shapes.box(0.6875, 0.125, 0.3125, 0.8125, 0.25, 0.6875),
                Shapes.box(0.6875, 1, 0.3125, 0.8125, 1.125, 0.6875),
                Shapes.box(0.3125, 1, 0.1875, 0.6875, 1.125, 0.3125),
                Shapes.box(0.3125, 1, 0.6875, 0.6875, 1.125, 0.8125),
                Shapes.box(0.3125, 0.5625, 0.6875, 0.6875, 0.6875, 0.8125),
                Shapes.box(0.3125, 0.5625, 0.1875, 0.6875, 0.6875, 0.3125),
                Shapes.box(0.3125, 0.125, 0.6875, 0.6875, 0.25, 0.8125),
                Shapes.box(0.3125, 0.125, 0.1875, 0.6875, 0.25, 0.3125),
                Shapes.box(0.6875, 0.5625, 0.3125, 0.8125, 0.6875, 0.6875),
                Shapes.box(0.1875, 0.5625, 0.3125, 0.3125, 0.6875, 0.6875),
                Shapes.box(0.1875, 1, 0.3125, 0.3125, 1.125, 0.6875),
                Shapes.box(0.1875, 0.125, 0.3125, 0.3125, 0.25, 0.6875),
                Shapes.box(0.6875, 0.125, 0.1875, 0.8125, 1.125, 0.3125),
                Shapes.box(0.1875, 0, 0.9375, 0.8125, 0.0625, 1),
                Shapes.box(0.1875, 0, 0, 0.8125, 0.0625, 0.0625),
                Shapes.box(0, 0, 0.1875, 0.0625, 0.0625, 0.8125),
                Shapes.box(0.9375, 0, 0.1875, 1, 0.0625, 0.8125),
        };
        GRID_GATEWAY_SHAPE = VoxelShapeUtil.mergeVoxelShapes(shape);
    }
}
