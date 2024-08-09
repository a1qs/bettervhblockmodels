package io.github.a1qs.bettervhblockmodels.voxelshapes;

import io.github.a1qs.bettervhblockmodels.util.VoxelShapeUtil;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class ScavengerAltarShape {
    public static final VoxelShape SCAVENGER_ALTAR_SHAPE;

    static {
        VoxelShape[] shape = new VoxelShape[] {
                Shapes.box(0.6875, 0.8125, 0.0625, 0.9375, 1, 0.9375),
                Shapes.box(0.0625, 0.8125, 0.0625, 0.3125, 1, 0.9375),
                Shapes.box(0.3125, 0.8125, 0.0625, 0.6875, 1, 0.3125),
                Shapes.box(0.3125, 0.8125, 0.6875, 0.6875, 1, 0.9375),
                Shapes.box(0.25, 0.5625, 0.25, 0.75, 0.75, 0.75),
                Shapes.box(0.25, 0.1875, 0.25, 0.75, 0.375, 0.75),
                Shapes.box(0.28125, 0.375, 0.28125, 0.34375, 0.5625, 0.34375),
                Shapes.box(0.65625, 0.375, 0.28125, 0.71875, 0.5625, 0.34375),
                Shapes.box(0.65625, 0.375, 0.65625, 0.71875, 0.5625, 0.71875),
                Shapes.box(0.28125, 0.375, 0.65625, 0.34375, 0.5625, 0.71875),
                Shapes.box(0.1875, 0.75, 0.1875, 0.8125, 0.875, 0.8125),
                Shapes.box(0.0625, 0, 0.0625, 0.9375, 0.125, 0.9375),
                Shapes.box(0.1875, 0.0625, 0.1875, 0.8125, 0.1875, 0.8125),
                Shapes.box(0.6875, 0.6875, 0.6875, 0.9375, 0.8125, 0.9375),
                Shapes.box(0.75, 0.5625, 0.75, 0.875, 0.75, 0.875),
                Shapes.box(0.125, 0.5625, 0.75, 0.25, 0.75, 0.875),
                Shapes.box(0.125, 0.5625, 0.125, 0.25, 0.75, 0.25),
                Shapes.box(0.75, 0.5625, 0.125, 0.875, 0.75, 0.25),
                Shapes.box(0.125, 1, 0.125, 0.25, 1.0625, 0.25),
                Shapes.box(0.125, 1, 0.75, 0.25, 1.0625, 0.875),
                Shapes.box(0.75, 1, 0.75, 0.875, 1.0625, 0.875),
                Shapes.box(0.75, 1, 0.125, 0.875, 1.0625, 0.25),
                Shapes.box(0.75, 0.125, 0.75, 0.875, 0.25, 0.875),
                Shapes.box(0.75, 0.25, 0.75, 0.8125, 0.3125, 0.8125),
                Shapes.box(0.75, 0.25, 0.1875, 0.8125, 0.3125, 0.25),
                Shapes.box(0.1875, 0.25, 0.1875, 0.25, 0.3125, 0.25),
                Shapes.box(0.1875, 0.25, 0.75, 0.25, 0.3125, 0.8125),
                Shapes.box(0.125, 0.125, 0.75, 0.25, 0.25, 0.875),
                Shapes.box(0.125, 0.125, 0.125, 0.25, 0.25, 0.25),
                Shapes.box(0.75, 0.125, 0.125, 0.875, 0.25, 0.25),
                Shapes.box(0.0625, 0.6875, 0.6875, 0.3125, 0.8125, 0.9375),
                Shapes.box(0.0625, 0.6875, 0.0625, 0.3125, 0.8125, 0.3125),
                Shapes.box(0.6875, 0.6875, 0.0625, 0.9375, 0.8125, 0.3125),
                Shapes.box(0.0625, 0.8125, 0.9375, 0.9375, 0.9375, 1),
                Shapes.box(0, 0.8125, 0, 0.0625, 0.9375, 1),
                Shapes.box(0.0625, 0.8125, 0, 0.9375, 0.9375, 0.0625),
                Shapes.box(0.9375, 0.8125, 0, 1, 0.9375, 1),
                Shapes.box(0.375, 0.375, 0.375, 0.625, 0.5625, 0.625),
                Shapes.box(0.375, 0.71875, 0.375, 0.625, 0.90625, 0.625)
        };

        SCAVENGER_ALTAR_SHAPE = VoxelShapeUtil.mergeVoxelShapes(shape);
    }
}
