package io.github.a1qs.bettervhblockmodels.voxelshapes;

import io.github.a1qs.bettervhblockmodels.util.VoxelShapeUtil;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class RelicPedestalShape {
    public static final VoxelShape RELIC_PEDESTAL_SHAPE;

    static {
        VoxelShape[] shape = {
                Shapes.box(0.125, 0, 0.125, 0.875, 0.0625, 0.875),
                Shapes.box(0.21875, 0.0625, 0.21875, 0.78125, 0.9375, 0.78125),
                Shapes.box(0.1875, 0.125, 0.1875, 0.25, 0.25, 0.25),
                Shapes.box(0.25, 0.125, 0.1875, 0.3125, 0.1875, 0.25),
                Shapes.box(0.1875, 0.125, 0.25, 0.25, 0.1875, 0.3125),
                Shapes.box(0.1875, 0.0625, 0.1875, 0.8125, 0.125, 0.8125),
                Shapes.box(0.75, 0.125, 0.1875, 0.8125, 0.25, 0.25),
                Shapes.box(0.6875, 0.125, 0.1875, 0.75, 0.1875, 0.25),
                Shapes.box(0.75, 0.125, 0.25, 0.8125, 0.1875, 0.3125),
                Shapes.box(0.75, 0.125, 0.75, 0.8125, 0.25, 0.8125),
                Shapes.box(0.75, 0.125, 0.6875, 0.8125, 0.1875, 0.75),
                Shapes.box(0.6875, 0.125, 0.75, 0.75, 0.1875, 0.8125),
                Shapes.box(0.1875, 0.125, 0.75, 0.25, 0.25, 0.8125),
                Shapes.box(0.25, 0.125, 0.75, 0.3125, 0.1875, 0.8125),
                Shapes.box(0.1875, 0.125, 0.6875, 0.25, 0.1875, 0.75),
                Shapes.box(0.125, 0.9375, 0.125, 0.875, 1, 0.875),
                Shapes.box(0.1875, 0.875, 0.1875, 0.8125, 0.9375, 0.8125),
                Shapes.box(0.1875, 0.75, 0.75, 0.25, 0.875, 0.8125),
                Shapes.box(0.1875, 0.75, 0.1875, 0.25, 0.875, 0.25),
                Shapes.box(0.75, 0.75, 0.1875, 0.8125, 0.875, 0.25),
                Shapes.box(0.75, 0.75, 0.75, 0.8125, 0.875, 0.8125),
                Shapes.box(0.25, 0.8125, 0.1875, 0.3125, 0.875, 0.25),
                Shapes.box(0.1875, 0.8125, 0.25, 0.25, 0.875, 0.3125),
                Shapes.box(0.6875, 0.8125, 0.1875, 0.75, 0.875, 0.25),
                Shapes.box(0.75, 0.8125, 0.25, 0.8125, 0.875, 0.3125),
                Shapes.box(0.75, 0.8125, 0.6875, 0.8125, 0.875, 0.75),
                Shapes.box(0.6875, 0.8125, 0.75, 0.75, 0.875, 0.8125),
                Shapes.box(0.25, 0.8125, 0.75, 0.3125, 0.875, 0.8125),
                Shapes.box(0.1875, 0.8125, 0.6875, 0.25, 0.875, 0.75),
        };
        RELIC_PEDESTAL_SHAPE = VoxelShapeUtil.mergeVoxelShapes(shape);
    }
}
