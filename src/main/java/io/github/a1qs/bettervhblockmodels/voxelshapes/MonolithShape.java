package io.github.a1qs.bettervhblockmodels.voxelshapes;

import io.github.a1qs.bettervhblockmodels.util.VoxelShapeUtil;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class MonolithShape {
    public static final VoxelShape MONOLITH_SHAPE;
    static {
        VoxelShape[] shape = {
                Shapes.box(0.1875, 0.5, 0.8125, 0.8125, 0.625, 0.875),
                Shapes.box(0, 0, 0, 1, 0.5, 1),
                Shapes.box(0.125, 0.5, 0.125, 0.1875, 0.625, 0.875),
                Shapes.box(0.8125, 0.5, 0.125, 0.875, 0.625, 0.875),
                Shapes.box(0.1875, 0.5, 0.125, 0.8125, 0.625, 0.1875),
                Shapes.box(0.25, 0.5, 0.25, 0.375, 0.625, 0.75),
                Shapes.box(0.625, 0.5, 0.25, 0.75, 0.625, 0.75),
                Shapes.box(0.25, 0.625, 0.625, 0.75, 0.75, 0.75),
                Shapes.box(0.25, 0.625, 0.375, 0.75, 0.75, 0.5),
                Shapes.box(0.4375, 0.5, 0.25, 0.5625, 0.625, 0.75),
        };
        MONOLITH_SHAPE = VoxelShapeUtil.mergeVoxelShapes(shape);
    }
}
