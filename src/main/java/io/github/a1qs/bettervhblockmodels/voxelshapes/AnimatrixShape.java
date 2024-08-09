package io.github.a1qs.bettervhblockmodels.voxelshapes;

import io.github.a1qs.bettervhblockmodels.util.VoxelShapeUtil;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class AnimatrixShape {
    public static final VoxelShape ANIMATRIX_SHAPE;
    static {
        VoxelShape[] shape = {
                Shapes.box(0, 0, 0, 1, 0.875, 1),
                Shapes.box(0, 0.875, 0, 0.125, 1, 1),
                Shapes.box(0.875, 0.875, 0, 1, 1, 1),
                Shapes.box(0.125, 0.875, 0, 0.875, 1, 0.125),
                Shapes.box(0.125, 0.875, 0.875, 0.875, 1, 1)
        };
        ANIMATRIX_SHAPE = VoxelShapeUtil.mergeVoxelShapes(shape);
    }
}
