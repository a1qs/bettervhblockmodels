package io.github.a1qs.bettervhblockmodels.voxelshapes;

import io.github.a1qs.bettervhblockmodels.util.VoxelShapeUtil;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class BountyTableShape {
    public static final VoxelShape BOUNTY_TABLE_SHAPE;
    public static final VoxelShape BOUNTY_TABLE_SHAPE_90;
    public static final VoxelShape BOUNTY_TABLE_SHAPE_180;
    public static final VoxelShape BOUNTY_TABLE_SHAPE_270;

    static {
        VoxelShape[] shape = {
                Shapes.box(0.125, 0, 0.125, 0.25, 0.5, 0.25),
                Shapes.box(0, 0.5, 0, 1, 0.625, 1),
                Shapes.box(0.75, 0, 0.125, 0.875, 0.5, 0.25),
                Shapes.box(0.75, 0, 0.75, 0.875, 0.5, 0.875),
                Shapes.box(0.75, 0.1875, 0.25, 0.875, 0.3125, 0.75),
                Shapes.box(0.125, 0.1875, 0.25, 0.25, 0.3125, 0.75),
                Shapes.box(0.125, 0, 0.75, 0.25, 0.5, 0.875),
                Shapes.box(0.75, 0.625, 0.6875, 0.875, 0.9375, 0.8125),
                Shapes.box(0.75, 0.625, 0.5625, 0.875, 0.75, 0.6875),
                Shapes.box(0.5625, 0.625, 0.625, 0.6875, 0.875, 0.75),
                Shapes.box(0.109375, 0.625, 0.625, 0.421875, 0.9375, 0.9375),
        };
        BOUNTY_TABLE_SHAPE = VoxelShapeUtil.mergeVoxelShapes(shape);
        BOUNTY_TABLE_SHAPE_90 = VoxelShapeUtil.rotateShape(BOUNTY_TABLE_SHAPE, 90);
        BOUNTY_TABLE_SHAPE_180 = VoxelShapeUtil.rotateShape(BOUNTY_TABLE_SHAPE, 180);
        BOUNTY_TABLE_SHAPE_270 = VoxelShapeUtil.rotateShape(BOUNTY_TABLE_SHAPE, 270);
    }
}
