package io.github.a1qs.bettervhblockmodels.voxelshapes;

import io.github.a1qs.bettervhblockmodels.util.VoxelShapeUtil;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class LodestoneShape {
    public static final VoxelShape LODESTONE_SHAPE;
    public static final VoxelShape DEFAULT_LODESTONE_SHAPE;

    static {
        VoxelShape[] shape = {
                Shapes.box(0.25, 0.3125, 0.25, 0.75, 0.875, 0.75),
                Shapes.box(0.3125, 0.875, 0.3125, 0.6875, 1, 0.6875),
                Shapes.box(0.3125, 0.1875, 0.3125, 0.6875, 0.3125, 0.6875),
                Shapes.box(0.25, 0.125, 0.3125, 0.3125, 0.3125, 0.4375),
                Shapes.box(0.4375, 0.0625, 0.4375, 0.5625, 0.1875, 0.5625),
                Shapes.box(0.3125, 0, 0.625, 0.375, 0.125, 0.6875),
                Shapes.box(0.1875, 0.25, 0.8125, 0.25, 0.375, 0.875),
                Shapes.box(0.8125, 0.25, 0.625, 0.875, 0.4375, 0.75),
                Shapes.box(0.8125, 0.6875, 0.3125, 0.875, 0.875, 0.375),
                Shapes.box(0.5, 0.25, 0.125, 0.5625, 0.4375, 0.1875),
        };
        LODESTONE_SHAPE = VoxelShapeUtil.mergeVoxelShapes(shape);
        DEFAULT_LODESTONE_SHAPE = Block.box(2.0, 0.0, 2.0, 14.0, 18.0, 14.0);
    }
}
