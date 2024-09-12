package io.github.a1qs.bettervhblockmodels.voxelshapes;

import io.github.a1qs.bettervhblockmodels.util.VoxelShapeUtil;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.stream.Stream;

public class ScavengerAltarShape {
    public static final VoxelShape SCAVENGER_ALTAR_SHAPE;
    public static final VoxelShape SCAVENGER_DEFAULT_SHAPE;

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
        SCAVENGER_DEFAULT_SHAPE = Stream.of(Block.box(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), Block.box(4.0, 3.0, 4.0, 12.0, 11.0, 12.0), Block.box(0.0, 13.0, 0.0, 16.0, 16.0, 16.0), Block.box(1.0, 11.0, 1.0, 15.0, 13.0, 15.0), Block.box(2.0, 9.0, 2.0, 14.0, 11.0, 14.0), Block.box(2.0, 2.0, 2.0, 14.0, 4.0, 14.0)).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    }
}
