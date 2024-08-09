package io.github.a1qs.bettervhblockmodels.voxelshapes;

import io.github.a1qs.bettervhblockmodels.util.VoxelShapeUtil;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class VaultCrateShape {
    public static final VoxelShape CRATE_SHAPE;

    static {
        VoxelShape[] crateShape = {
                Shapes.box(0.125, 0.0625, 0.125, 0.875, 0.8125, 0.875),
                Shapes.box(0.0625, 0, 0.0625, 0.1875, 0.125, 0.9375),
                Shapes.box(0.0625, 0.75, 0.0625, 0.1875, 0.875, 0.9375),
                Shapes.box(0.8125, 0.75, 0.0625, 0.9375, 0.875, 0.9375),
                Shapes.box(0.8125, 0, 0.0625, 0.9375, 0.125, 0.9375),
                Shapes.box(0.1875, 0, 0.8125, 0.8125, 0.125, 0.9375),
                Shapes.box(0.1875, 0.75, 0.8125, 0.8125, 0.875, 0.9375),
                Shapes.box(0.1875, 0.75, 0.0625, 0.8125, 0.875, 0.1875),
                Shapes.box(0.1875, 0, 0.0625, 0.8125, 0.125, 0.1875),
                Shapes.box(0.0625, 0.125, 0.0625, 0.1875, 0.75, 0.1875),
                Shapes.box(0.8125, 0.125, 0.0625, 0.9375, 0.75, 0.1875),
                Shapes.box(0.8125, 0.125, 0.8125, 0.9375, 0.75, 0.9375),
                Shapes.box(0.0625, 0.125, 0.8125, 0.1875, 0.75, 0.9375)
        };
        CRATE_SHAPE = VoxelShapeUtil.mergeVoxelShapes(crateShape);
    }
}
