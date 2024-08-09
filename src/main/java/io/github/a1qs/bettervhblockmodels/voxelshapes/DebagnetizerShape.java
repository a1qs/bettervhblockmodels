package io.github.a1qs.bettervhblockmodels.voxelshapes;

import io.github.a1qs.bettervhblockmodels.util.VoxelShapeUtil;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class DebagnetizerShape {
    public static final VoxelShape DEBAGNETIZER_SHAPE;
    static {
        VoxelShape[] shape = {
                Shapes.box(0, 0, 0, 1, 0.25, 1),
                Shapes.box(0.3125, 0.25, 0.3125, 0.6875, 0.5625, 0.6875),
                Shapes.box(0.4375, 0.6875, 0.4375, 0.5625, 0.8125, 0.5625),
                Shapes.box(0.125, 0.5, 0.125, 0.875, 0.625, 0.875),
                Shapes.box(0.1875, 0.875, 0.1875, 0.8125, 1, 0.8125),
                Shapes.box(0.25, 1, 0.25, 0.75, 1.125, 0.75),
                Shapes.box(0.6875, 0.625, 0.25, 0.75, 0.875, 0.3125),
                Shapes.box(0.6875, 0.625, 0.375, 0.75, 0.875, 0.4375),
                Shapes.box(0.6875, 0.625, 0.6875, 0.75, 0.875, 0.75),
                Shapes.box(0.25, 0.625, 0.6875, 0.3125, 0.875, 0.75),
                Shapes.box(0.25, 0.625, 0.375, 0.3125, 0.875, 0.4375),
                Shapes.box(0.25, 0.625, 0.5625, 0.3125, 0.875, 0.625),
                Shapes.box(0.375, 0.625, 0.6875, 0.4375, 0.875, 0.75),
                Shapes.box(0.5625, 0.625, 0.6875, 0.625, 0.875, 0.75),
                Shapes.box(0.6875, 0.625, 0.5625, 0.75, 0.875, 0.625),
                Shapes.box(0.5625, 0.625, 0.25, 0.625, 0.875, 0.3125),
                Shapes.box(0.375, 0.625, 0.25, 0.4375, 0.875, 0.3125),
                Shapes.box(0.25, 0.625, 0.25, 0.3125, 0.875, 0.3125),
        };
        DEBAGNETIZER_SHAPE = VoxelShapeUtil.mergeVoxelShapes(shape);
    }
}
