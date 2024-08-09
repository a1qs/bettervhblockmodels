package io.github.a1qs.bettervhblockmodels.voxelshapes;

import io.github.a1qs.bettervhblockmodels.util.VoxelShapeUtil;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class ShopPedestalShape {
    public static final VoxelShape SHOP_PEDESTAL_SHAPE;
    static {
        VoxelShape[] shape = {
                Shapes.box(0, 0.75, 0, 1, 1, 1),
                Shapes.box(0.25, 0, 0.25, 0.75, 0.75, 0.75),
                Shapes.box(0.0625, 0.1875, 0.375, 0.25, 0.75, 0.625),
                Shapes.box(0.125, 0, 0.40625, 0.25, 0.1875, 0.59375),
                Shapes.box(0, 0.3125, 0.28125, 0.25, 0.4375, 0.71875),
                Shapes.box(0, 0.453125, 0.46875, 0.0625, 0.578125, 0.53125),
                Shapes.box(0.75, 0.1875, 0.375, 0.9375, 0.75, 0.625),
                Shapes.box(0.9375, 0.453125, 0.46875, 1, 0.578125, 0.53125),
                Shapes.box(0.75, 0.3125, 0.28125, 1, 0.4375, 0.71875),
                Shapes.box(0.75, 0, 0.40625, 0.875, 0.1875, 0.59375),
                Shapes.box(0.375, 0.1875, 0.75, 0.625, 0.75, 0.9375),
                Shapes.box(0.46875, 0.453125, 0.9375, 0.53125, 0.578125, 1),
                Shapes.box(0.28125, 0.3125, 0.75, 0.71875, 0.4375, 1),
                Shapes.box(0.40625, 0, 0.75, 0.59375, 0.1875, 0.875),
                Shapes.box(0.375, 0.1875, 0.0625, 0.625, 0.75, 0.25),
                Shapes.box(0.46875, 0.453125, 0, 0.53125, 0.578125, 0.0625),
                Shapes.box(0.28125, 0.3125, 0, 0.71875, 0.4375, 0.25),
                Shapes.box(0.40625, 0, 0.125, 0.59375, 0.1875, 0.25)
        };
        SHOP_PEDESTAL_SHAPE = VoxelShapeUtil.mergeVoxelShapes(shape);
    }
}
