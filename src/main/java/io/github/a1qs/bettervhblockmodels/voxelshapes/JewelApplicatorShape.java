package io.github.a1qs.bettervhblockmodels.voxelshapes;

import io.github.a1qs.bettervhblockmodels.util.VoxelShapeUtil;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class JewelApplicatorShape {
    public static final VoxelShape JEWEL_APPLICATOR_SHAPE;
    public static final VoxelShape JEWEL_APPLICATOR_SHAPE_90;
    public static final VoxelShape JEWEL_APPLICATOR_SHAPE_180;
    public static final VoxelShape JEWEL_APPLICATOR_SHAPE_270;

    static {
        VoxelShape[] shape = {
                Shapes.box(0.21875, 0.75, 0.21875, 0.78125, 0.8125, 0.78125),
                Shapes.box(0.5625, 0.8125, 0.625, 0.6875, 0.875, 0.75),
                Shapes.box(0.5625, 0.8125, 0.25, 0.6875, 0.875, 0.375),
                Shapes.box(0.5, 0.8125, 0.5625, 0.75, 0.9375, 0.625),
                Shapes.box(0.5, 0.75, 0.9, 0.6875, 0.875, 1.025),
                Shapes.box(0.5, 0.8125, 0.375, 0.75, 0.9375, 0.4375),
                Shapes.box(0.125, 0, 0.6875, 0.3125, 0.625, 0.875),
                Shapes.box(0.125, 0, 0.125, 0.3125, 0.625, 0.3125),
                Shapes.box(0.0625, 0.625, 0.0625, 0.9375, 0.75, 0.9375),
                Shapes.box(0.6875, 0, 0.125, 0.875, 0.625, 0.3125),
                Shapes.box(0.6875, 0, 0.6875, 0.875, 0.625, 0.875),
                Shapes.box(0.1875, 0.25, 0.1875, 0.25, 0.375, 0.8125),
                Shapes.box(0.75, 0.25, 0.1875, 0.8125, 0.375, 0.8125),
                Shapes.box(0.1875, 0.25, 0.1875, 0.8125, 0.375, 0.25),
                Shapes.box(0.1875, 0.25, 0.75, 0.8125, 0.375, 0.8125),
                Shapes.box(0.25, 0.625, 0.9375, 0.75, 0.75, 1),
                Shapes.box(0.375, 0.71875, 0.93125, 0.4375, 0.84375, 0.99375),
                Shapes.box(0.5625, 0.84375, 0.93125, 0.625, 0.90625, 0.99375),
                Shapes.box(0.375, 0.515625, 0.93125, 0.4375, 0.640625, 0.99375),
                Shapes.box(0.375, 0.71875, 0.93125, 0.4375, 0.84375, 0.99375),
                Shapes.box(0.375, 0.44375, 0.93125, 0.4375, 0.56875, 0.99375),
                Shapes.box(0.375, 0.44375, 0.93125, 0.4375, 0.56875, 0.99375),
                Shapes.box(0.375, 0.515625, 0.93125, 0.4375, 0.640625, 0.99375),
                Shapes.box(0.5625, 0.4375, 0.93125, 0.625, 0.625, 0.99375),
                Shapes.box(0.059375, 0.4453125, 0.1875, 0.059375, 0.7578125, 0.8125),
                Shapes.box(0.1875, 0.4453125, 0.940625, 0.8125, 0.7578125, 0.940625),
                Shapes.box(0.940625, 0.4453125, 0.1875, 0.940625, 0.7578125, 0.8125),
                Shapes.box(0.059375, 0.7515625, 0.059375, 0.940625, 0.7578125, 0.940625),
                Shapes.box(0.1875, 0.4453125, 0.059375, 0.8125, 0.7578125, 0.059375)
        };
        JEWEL_APPLICATOR_SHAPE = VoxelShapeUtil.mergeVoxelShapes(shape);
        JEWEL_APPLICATOR_SHAPE_90 = VoxelShapeUtil.rotateShape(JEWEL_APPLICATOR_SHAPE, 90);
        JEWEL_APPLICATOR_SHAPE_180 = VoxelShapeUtil.rotateShape(JEWEL_APPLICATOR_SHAPE, 180);
        JEWEL_APPLICATOR_SHAPE_270 = VoxelShapeUtil.rotateShape(JEWEL_APPLICATOR_SHAPE, 270);
    }
}
