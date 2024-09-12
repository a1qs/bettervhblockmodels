package io.github.a1qs.bettervhblockmodels.voxelshapes;

import io.github.a1qs.bettervhblockmodels.util.VoxelShapeUtil;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class SpiritExtractorShape {
    public static final VoxelShape SPIRIT_EXTRACTOR_SHAPE;
    public static final VoxelShape SPIRIT_EXTRACTOR_DEFAULT_SHAPE;
    static {
        VoxelShape[] shape = {
                Shapes.box(0, 0.375, 0, 1, 0.5, 1),
                Shapes.box(0, 0, 0, 1, 0.125, 1),
                Shapes.box(0.0625, 0.125, 0.0625, 0.9375, 0.375, 0.9375)
        };
        SPIRIT_EXTRACTOR_SHAPE = VoxelShapeUtil.mergeVoxelShapes(shape);
        SPIRIT_EXTRACTOR_DEFAULT_SHAPE = Block.box(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
    }
}
