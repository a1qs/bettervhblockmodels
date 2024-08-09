package io.github.a1qs.bettervhblockmodels.voxelshapes;

import io.github.a1qs.bettervhblockmodels.util.VoxelShapeUtil;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class DemagnetizerShape {
    public static final VoxelShape DEMAGNETIZER_SHAPE;

    static {
        VoxelShape[] demagnetizerShape = {
                Shapes.box(0, 0, 0, 1, 0.25, 1),
                Shapes.box(0.3125, 0.25, 0.3125, 0.6875, 1, 0.6875),
                Shapes.box(0.125, 0.5625, 0.125, 0.875, 0.6875, 0.875),
                Shapes.box(0.25, 0.625, 0.25, 0.75, 1.0625, 0.75),
        };
        DEMAGNETIZER_SHAPE = VoxelShapeUtil.mergeVoxelShapes(demagnetizerShape);
    }
}
