package io.github.a1qs.bettervhblockmodels.voxelshapes;

import io.github.a1qs.bettervhblockmodels.util.VoxelShapeUtil;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class PylonShape {
    public static final VoxelShape PYLON_SHAPE;
    static {
        VoxelShape[] shape = {
                Shapes.box(0.1875, 0.25, 0.875, 0.8125, 0.375, 1),
                Shapes.box(-0.0625, 0.125, 0.8125, 0.1875, 0.5, 1.0625),
                Shapes.box(0.8125, 0.125, 0.8125, 1.0625, 0.5, 1.0625),
                Shapes.box(0.8125, 0.125, -0.0625, 1.0625, 0.5, 0.1875),
                Shapes.box(-0.0625, 0.125, -0.0625, 0.1875, 0.5, 0.1875),
                Shapes.box(0.1875, 0.25, 0, 0.8125, 0.375, 0.125),
                Shapes.box(0, 0.25, 0.1875, 0.125, 0.375, 0.8125),
                Shapes.box(0.875, 0.25, 0.1875, 1, 0.375, 0.8125),
                Block.box(3.0, 0.0, 3.0, 13.0, 18.0, 13.0),
        };
        PYLON_SHAPE = VoxelShapeUtil.mergeVoxelShapes(shape);
    }
}
