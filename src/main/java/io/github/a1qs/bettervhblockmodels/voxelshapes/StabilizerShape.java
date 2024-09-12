package io.github.a1qs.bettervhblockmodels.voxelshapes;

import io.github.a1qs.bettervhblockmodels.util.VoxelShapeUtil;
import iskallia.vault.util.VoxelUtils;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class StabilizerShape {
    public static final VoxelShape STABILIZER_SHAPE;
    public static final VoxelShape STABILIZER_DEFAULT_SHAPE_1;
    public static final VoxelShape STABILIZER_DEFAULT_SHAPE_2;
    static {
        VoxelShape[] shape = {
                Shapes.box(0.3125, 0.1875, 0.203125, 0.6875, 1.4375, 0.203125),
                Shapes.box(0.78125, 0.1875, 0.3125, 0.78125, 1.4375, 0.6875),
                Shapes.box(0.3125, 0.1875, 0.796875, 0.6875, 1.4375, 0.796875),
                Shapes.box(0.21875, 0.1875, 0.3125, 0.21875, 1.4375, 0.6875),
                Shapes.box(0, 0, 0, 1, 0.1875, 1),
                Shapes.box(0.6875, 0.25, 0.125, 0.875, 1.4375, 0.3125),
                Shapes.box(0.125, 1.5625, 0.125, 0.25, 1.6875, 0.25),
                Shapes.box(0.125, 1.5625, 0.75, 0.25, 1.6875, 0.875),
                Shapes.box(0.75, 1.5625, 0.75, 0.875, 1.6875, 0.875),
                Shapes.box(0.75, 1.5625, 0.125, 0.875, 1.6875, 0.25),
                Shapes.box(0.6875, 1.5, 0.125, 0.875, 1.5625, 0.3125),
                Shapes.box(0.6875, 1.5, 0.6875, 0.875, 1.5625, 0.875),
                Shapes.box(0.125, 1.5, 0.6875, 0.3125, 1.5625, 0.875),
                Shapes.box(0.125, 1.6875, 0.8125, 0.1875, 1.8125, 0.875),
                Shapes.box(0.125, 1.6875, 0.125, 0.1875, 1.8125, 0.1875),
                Shapes.box(0.8125, 1.6875, 0.125, 0.875, 1.8125, 0.1875),
                Shapes.box(0.8125, 1.6875, 0.8125, 0.875, 1.8125, 0.875),
                Shapes.box(0.125, 1.5, 0.125, 0.3125, 1.5625, 0.3125),
                Shapes.box(0.125, 0.25, 0.125, 0.3125, 1.4375, 0.3125),
                Shapes.box(0.125, 0.25, 0.6875, 0.3125, 1.4375, 0.875),
                Shapes.box(0.6875, 0.25, 0.6875, 0.875, 1.4375, 0.875),
                Shapes.box(0.0625, 0.1875, 0.0625, 0.3125, 0.25, 0.3125),
                Shapes.box(0.6875, 0.1875, 0.0625, 0.9375, 0.25, 0.3125),
                Shapes.box(0.6875, 0.1875, 0.6875, 0.9375, 0.25, 0.9375),
                Shapes.box(0.0625, 0.1875, 0.6875, 0.3125, 0.25, 0.9375),
                Shapes.box(0.125, 1.4375, 0.125, 0.875, 1.5, 0.875),
                Shapes.box(0.375, 0.1875, 0.375, 0.625, 0.5, 0.625),
                Shapes.box(0.375, 1.125, 0.375, 0.625, 1.4375, 0.625),
        };
        STABILIZER_SHAPE = VoxelShapeUtil.mergeVoxelShapes(shape);
        STABILIZER_DEFAULT_SHAPE_1 = makeShape().move(0.0, -1.0, 0.0);
        STABILIZER_DEFAULT_SHAPE_2 = makeShape();
    }

    private static VoxelShape makeShape() {
        VoxelShape m1 = Block.box(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
        VoxelShape m2 = Block.box(2.0, 2.0, 2.0, 14.0, 29.0, 14.0);
        return VoxelUtils.combineAll(BooleanOp.OR, m1, m2);
    }
}
