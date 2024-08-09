package io.github.a1qs.bettervhblockmodels.voxelshapes;

import io.github.a1qs.bettervhblockmodels.util.VoxelShapeUtil;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class WardrobeShape {
    public static final VoxelShape WARDROBE_SHAPE;
    static {
        VoxelShape[] shape = {
                Shapes.box(0.0625, 0, 0.0625, 0.9375, 0.125, 0.9375),
                Shapes.box(0.125, 0.125, 0.125, 0.875, 0.1875, 0.875)
        };
        WARDROBE_SHAPE = VoxelShapeUtil.mergeVoxelShapes(shape);
    }
}
