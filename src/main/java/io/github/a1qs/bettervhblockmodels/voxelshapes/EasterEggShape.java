package io.github.a1qs.bettervhblockmodels.voxelshapes;

import io.github.a1qs.bettervhblockmodels.util.VoxelShapeUtil;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class EasterEggShape {
    public static final VoxelShape EGG_SHAPE;

    static {
        VoxelShape[] eggShape = {
                Shapes.box(0.375, 0.046875, 0.375, 0.625, 0.296875, 0.625),
                Shapes.box(0.40625, 0.296875, 0.40625, 0.59375, 0.359375, 0.59375),
                Shapes.box(0.4375, 0.359375, 0.4375, 0.5625, 0.421875, 0.5625),
                Shapes.box(0.40625, 0, 0.40625, 0.59375, 0.0625, 0.59375)
        };
        EGG_SHAPE = VoxelShapeUtil.mergeVoxelShapes(eggShape);
    }
}
