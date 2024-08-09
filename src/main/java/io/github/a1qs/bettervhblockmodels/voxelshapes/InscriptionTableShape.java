package io.github.a1qs.bettervhblockmodels.voxelshapes;

import io.github.a1qs.bettervhblockmodels.util.VoxelShapeUtil;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class InscriptionTableShape {
    public static final VoxelShape INSCRIPTION_TABLE_SHAPE;
    public static final VoxelShape INSCRIPTION_TABLE_SHAPE_90;
    public static final VoxelShape INSCRIPTION_TABLE_SHAPE_180;
    public static final VoxelShape INSCRIPTION_TABLE_SHAPE_270;
    static {
        VoxelShape[] shape = {
                Shapes.box(0.0625, 0.625, 0.0625, 0.9375, 0.75, 0.9375),
                Shapes.box(0.625, 0, 0.375, 0.9375, 0.125, 0.625),
                Shapes.box(0.0625, 0, 0.375, 0.375, 0.125, 0.625),
                Shapes.box(0.375, 0, 0.625, 0.625, 0.125, 0.9375),
                Shapes.box(0.375, 0, 0.0625, 0.625, 0.125, 0.375),
                Shapes.box(0.125, 0, 0.125, 0.375, 0.0625, 0.375),
                Shapes.box(0.125, 0, 0.625, 0.375, 0.0625, 0.875),
                Shapes.box(0.625, 0, 0.625, 0.875, 0.0625, 0.875),
                Shapes.box(0.625, 0, 0.125, 0.875, 0.0625, 0.375),
                Shapes.box(0.375, 0, 0.375, 0.625, 0.625, 0.625),
                Shapes.box(0.8125, 0.5, 0, 1, 1, 0.1875),
                Shapes.box(0.1875, 0.5625, 0, 0.8125, 0.8125, 0.875),
                Shapes.box(0.8125, 0.5, 0.8125, 1, 1, 1),
                Shapes.box(0, 0.5, 0.8125, 0.1875, 0.9375, 1),
                Shapes.box(0.546875, 0.5, 0.8125, 0.734375, 1.125, 1),
                Shapes.box(0.265625, 0.5, 0.8125, 0.453125, 1.0625, 1)
        };

        INSCRIPTION_TABLE_SHAPE = VoxelShapeUtil.mergeVoxelShapes(shape);
        INSCRIPTION_TABLE_SHAPE_90 = VoxelShapeUtil.rotateShape(INSCRIPTION_TABLE_SHAPE, 90);
        INSCRIPTION_TABLE_SHAPE_180 = VoxelShapeUtil.rotateShape(INSCRIPTION_TABLE_SHAPE, 180);
        INSCRIPTION_TABLE_SHAPE_270 = VoxelShapeUtil.rotateShape(INSCRIPTION_TABLE_SHAPE, 270);
    }
}
