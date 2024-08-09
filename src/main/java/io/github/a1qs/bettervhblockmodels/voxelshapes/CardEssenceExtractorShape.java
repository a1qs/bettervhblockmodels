package io.github.a1qs.bettervhblockmodels.voxelshapes;

import io.github.a1qs.bettervhblockmodels.util.VoxelShapeUtil;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class CardEssenceExtractorShape {
    public static final VoxelShape CARD_ESSENCE_EXTRACTOR_SHAPE;
    public static final VoxelShape CARD_ESSENCE_EXTRACTOR_SHAPE_90;
    public static final VoxelShape CARD_ESSENCE_EXTRACTOR_SHAPE_180;
    public static final VoxelShape CARD_ESSENCE_EXTRACTOR_SHAPE_270;
    static {
        VoxelShape[] shape = {
                Shapes.box(0.25, 0, 0.125, 1, 0.25, 0.875),
                Shapes.box(0.6875, 0.25, 0.125, 1, 0.75, 0.875),
                Shapes.box(0.25, 0.75, 0.125, 1, 0.875, 0.875),
                Shapes.box(0.5625, 0.875, 0.5, 0.9375, 1, 0.625),
                Shapes.box(0.5625, 0.875, 0.4375, 0.625, 1, 0.5),
                Shapes.box(0.625, 0.875, 0.4375, 0.875, 0.9375, 0.5),
                Shapes.box(0.5625, 0.875, 0.3125, 0.9375, 1, 0.4375),
                Shapes.box(0.875, 0.875, 0.4375, 0.9375, 1, 0.5),
                Shapes.box(0.8125, 0.375, 0.09375, 0.875, 0.4375, 0.125),
                Shapes.box(0.8125, 0.5, 0.09375, 0.875, 0.5625, 0.125),
                Shapes.box(0, 0, 0.625, 0.25, 0.3125, 0.6875),
                Shapes.box(0.0625, 0, 0.3125, 0.1875, 0.0625, 0.625),
                Shapes.box(0, 0, 0.3125, 0.0625, 0.3125, 0.625),
                Shapes.box(0, 0, 0.25, 0.25, 0.3125, 0.3125),
                Shapes.box(0.1875, 0, 0.3125, 0.25, 0.3125, 0.625),
                Shapes.box(0.15625, 0.3125, 0.375, 0.34375, 0.390625, 0.5625),
        };
        CARD_ESSENCE_EXTRACTOR_SHAPE = VoxelShapeUtil.mergeVoxelShapes(shape);
        CARD_ESSENCE_EXTRACTOR_SHAPE_90 = VoxelShapeUtil.rotateShape(CARD_ESSENCE_EXTRACTOR_SHAPE, 90);
        CARD_ESSENCE_EXTRACTOR_SHAPE_180 = VoxelShapeUtil.rotateShape(CARD_ESSENCE_EXTRACTOR_SHAPE, 180);
        CARD_ESSENCE_EXTRACTOR_SHAPE_270 = VoxelShapeUtil.rotateShape(CARD_ESSENCE_EXTRACTOR_SHAPE, 270);
    }
}
