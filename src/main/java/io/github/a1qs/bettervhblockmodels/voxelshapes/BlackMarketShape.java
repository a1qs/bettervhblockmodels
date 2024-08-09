package io.github.a1qs.bettervhblockmodels.voxelshapes;

import io.github.a1qs.bettervhblockmodels.util.VoxelShapeUtil;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class BlackMarketShape {
    public static final VoxelShape BLACK_MARKET_SHAPE;
    static {
        VoxelShape[] shape = {
                Shapes.box(0.125, 0, 0.125, 0.25, 0.5, 0.25),
                Shapes.box(0, 0.5, 0, 1, 0.625, 1),
                Shapes.box(0.75, 0, 0.125, 0.875, 0.5, 0.25),
                Shapes.box(0.75, 0, 0.75, 0.875, 0.5, 0.875),
                Shapes.box(0.125, 0.1875, 0.0625, 0.25, 0.3125, 0.9375),
                Shapes.box(0.75, 0.1875, 0.0625, 0.875, 0.3125, 0.9375),
                Shapes.box(0.0625, 0.1875, 0.125, 0.9375, 0.3125, 0.25),
                Shapes.box(0.0625, 0.1875, 0.75, 0.9375, 0.3125, 0.875),
                Shapes.box(0.125, 0, 0.75, 0.25, 0.5, 0.875),
                Shapes.box(-0.003125, 0.3203125, 0.1875, -0.003125, 0.6328125, 0.8125),
                Shapes.box(0.1875, 0.3203125, 1.003125, 0.8125, 0.6328125, 1.003125),
                Shapes.box(1.003125, 0.3203125, 0.1875, 1.003125, 0.6328125, 0.8125),
                Shapes.box(-0.003125, 0.6265625, -0.003125, 1.003125, 0.6328125, 1.003125),
                Shapes.box(0.1875, 0.3203125, -0.003125, 0.8125, 0.6328125, -0.003125)
        };
        BLACK_MARKET_SHAPE = VoxelShapeUtil.mergeVoxelShapes(shape);
    }
}
