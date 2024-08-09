package io.github.a1qs.bettervhblockmodels.voxelshapes;

import io.github.a1qs.bettervhblockmodels.util.VoxelShapeUtil;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class VaultRecyclerShape {
    public static final VoxelShape VAULT_RECYCLER_SHAPE;

    static {
        VoxelShape[] shape = {
                Shapes.box(0.6875, 0.8125, 0, 1, 1, 1),
                Shapes.box(0, 0.8125, 0, 0.3125, 1, 1),
                Shapes.box(0.3125, 0.8125, 0, 0.6875, 1, 0.3125),
                Shapes.box(0.3125, 0.8125, 0.6875, 0.6875, 1, 1),
                Shapes.box(0.25, 0.5625, 0.25, 0.75, 0.75, 0.75),
                Shapes.box(0.25, 0.1875, 0.25, 0.75, 0.375, 0.75),
                Shapes.box(0.296875, 0.375, 0.296875, 0.359375, 0.5625, 0.359375),
                Shapes.box(0.640625, 0.375, 0.296875, 0.703125, 0.5625, 0.359375),
                Shapes.box(0.5625, 0.921875, 0.3125, 0.625, 0.984375, 0.6875),
                Shapes.box(0.375, 0.921875, 0.3125, 0.4375, 0.984375, 0.6875),
                Shapes.box(0.640625, 0.375, 0.640625, 0.703125, 0.5625, 0.703125),
                Shapes.box(0.296875, 0.375, 0.640625, 0.359375, 0.5625, 0.703125),
                Shapes.box(0.640625, 0.375, 0.46875, 0.703125, 0.5625, 0.53125),
                Shapes.box(0.296875, 0.375, 0.46875, 0.359375, 0.5625, 0.53125),
                Shapes.box(0.46875, 0.375, 0.640625, 0.53125, 0.5625, 0.703125),
                Shapes.box(0.46875, 0.375, 0.296875, 0.53125, 0.5625, 0.359375),
                Shapes.box(0.375, 0.375, 0.375, 0.625, 0.5625, 0.625),
                Shapes.box(0.375, 0.71875, 0.375, 0.625, 0.90625, 0.625),
                Shapes.box(0.1875, 0.75, 0.1875, 0.8125, 0.875, 0.8125),
                Shapes.box(0.0625, 0, 0.0625, 0.9375, 0.125, 0.9375),
                Shapes.box(0.1875, 0.0625, 0.1875, 0.8125, 0.1875, 0.8125),
                Shapes.box(0.6875, 0.5, 0.6875, 0.9375, 0.9375, 0.9375),
                Shapes.box(0.75, 0.4375, 0.75, 0.875, 0.5, 0.875),
                Shapes.box(0.125, 0.4375, 0.75, 0.25, 0.5, 0.875),
                Shapes.box(0.125, 0.4375, 0.125, 0.25, 0.5, 0.25),
                Shapes.box(0.75, 0.4375, 0.125, 0.875, 0.5, 0.25),
                Shapes.box(0.0625, 0.5, 0.6875, 0.3125, 0.9375, 0.9375),
                Shapes.box(0.0625, 0.5, 0.0625, 0.3125, 0.9375, 0.3125),
                Shapes.box(0.6875, 0.5, 0.0625, 0.9375, 0.9375, 0.3125),
        };
        VAULT_RECYCLER_SHAPE = VoxelShapeUtil.mergeVoxelShapes(shape);
    }
}
