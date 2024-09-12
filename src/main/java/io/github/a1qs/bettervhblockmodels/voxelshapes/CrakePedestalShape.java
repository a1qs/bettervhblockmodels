package io.github.a1qs.bettervhblockmodels.voxelshapes;

import io.github.a1qs.bettervhblockmodels.util.VoxelShapeUtil;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class CrakePedestalShape {
    public static final VoxelShape CRAKE_PEDESTAL_SHAPE;
    public static final VoxelShape DEFAULT_CRAKE_SHAPE;

    static {
        VoxelShape[] pedestal_shape = {
                Shapes.box(0.25, 0.25, 0.25, 0.75, 0.75, 0.75),
                Shapes.box(0, 0.125, 0, 1, 0.25, 1),
                Shapes.box(0.25, 0, 0.25, 0.75, 0.125, 0.75),
                Shapes.box(0.125, 0.25, 0.125, 0.875, 0.875, 0.875)
        };
        CRAKE_PEDESTAL_SHAPE = VoxelShapeUtil.mergeVoxelShapes(pedestal_shape);
        DEFAULT_CRAKE_SHAPE = Block.box(2.0, 0.0, 2.0, 14.0, 14.0, 14.0);
    }
}
