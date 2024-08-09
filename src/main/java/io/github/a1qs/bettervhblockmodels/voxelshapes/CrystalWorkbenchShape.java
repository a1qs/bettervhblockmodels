package io.github.a1qs.bettervhblockmodels.voxelshapes;

import io.github.a1qs.bettervhblockmodels.util.VoxelShapeUtil;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class CrystalWorkbenchShape {
    public static final VoxelShape CRYSTAL_WORKBENCH_SHAPE;

    static {
        VoxelShape[] shape = {
                Shapes.box(0.125, 0.0625, 0.125, 0.875, 0.1875, 0.875),
                Shapes.box(0.125, 0.75, 0.125, 0.875, 0.875, 0.875),
                Shapes.box(0.1875, 0.1875, 0.1875, 0.8125, 0.75, 0.8125),
                Shapes.box(0.71875, 0.1875, 0.15625, 0.84375, 0.75, 0.28125),
                Shapes.box(0.15625, 0.1875, 0.15625, 0.28125, 0.75, 0.28125),
                Shapes.box(0.15625, 0.1875, 0.71875, 0.28125, 0.75, 0.84375),
                Shapes.box(0.71875, 0.1875, 0.71875, 0.84375, 0.75, 0.84375),
                Shapes.box(0.0625, 0, 0.0625, 0.25, 0.125, 0.25),
                Shapes.box(0.75, 0, 0.0625, 0.9375, 0.125, 0.25),
                Shapes.box(0.75, 0, 0.75, 0.9375, 0.125, 0.9375),
                Shapes.box(0.0625, 0, 0.75, 0.25, 0.125, 0.9375),
                Shapes.box(0.4375, 0.3125, 0.75, 0.5625, 0.625, 0.875),
                Shapes.box(0.375, 0.375, 0.71875, 0.4375, 0.5625, 0.84375),
                Shapes.box(0.5625, 0.375, 0.71875, 0.625, 0.5625, 0.84375),
                Shapes.box(0.5625, 0.375, 0.15625, 0.625, 0.5625, 0.28125),
                Shapes.box(0.375, 0.375, 0.15625, 0.4375, 0.5625, 0.28125),
                Shapes.box(0.4375, 0.3125, 0.125, 0.5625, 0.625, 0.25),
                Shapes.box(0.75, 0.3125, 0.4375, 0.875, 0.625, 0.5625),
                Shapes.box(0.71875, 0.375, 0.5625, 0.84375, 0.5625, 0.625),
                Shapes.box(0.71875, 0.375, 0.375, 0.84375, 0.5625, 0.4375),
                Shapes.box(0.15625, 0.375, 0.375, 0.28125, 0.5625, 0.4375),
                Shapes.box(0.15625, 0.375, 0.5625, 0.28125, 0.5625, 0.625),
                Shapes.box(0.125, 0.3125, 0.4375, 0.25, 0.625, 0.5625),
                Shapes.box(0.3125, 0.875, 0.3125, 0.6875, 0.9375, 0.6875),
                Shapes.box(0.4375, 0.875, 0.25, 0.5625, 1, 0.375),
                Shapes.box(0.25, 0.875, 0.4375, 0.375, 1, 0.5625),
                Shapes.box(0.625, 0.875, 0.4375, 0.75, 1, 0.5625),
                Shapes.box(0.4375, 0.875, 0.625, 0.5625, 1, 0.75)
        };
        CRYSTAL_WORKBENCH_SHAPE = VoxelShapeUtil.mergeVoxelShapes(shape);
    }
}
