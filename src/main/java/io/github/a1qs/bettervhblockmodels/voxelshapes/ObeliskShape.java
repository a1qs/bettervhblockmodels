package io.github.a1qs.bettervhblockmodels.voxelshapes;

import io.github.a1qs.bettervhblockmodels.util.VoxelShapeUtil;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class ObeliskShape {
    public static final VoxelShape OBELISK_SHAPE;
    static {
        VoxelShape[] shape = {
                Shapes.box(0, 0, 0, 1, 0.1875, 1),
                Shapes.box(0.125, 0.1875, 0.125, 0.875, 1.0625, 0.875),
                Shapes.box(0.125, 1.0625, 0.125, 0.875, 2, 0.875),
        };
        OBELISK_SHAPE = VoxelShapeUtil.mergeVoxelShapes(shape);
    }
}
