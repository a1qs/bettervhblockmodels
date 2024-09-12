package io.github.a1qs.bettervhblockmodels.voxelshapes;

import io.github.a1qs.bettervhblockmodels.util.VoxelShapeUtil;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class ObeliskShape {
    public static final VoxelShape OBELISK_SHAPE;
    public static final VoxelShape DEFAULT_OBELISK_SHAPE;
    public static final VoxelShape DEFAULT_OBELISK_SHAPE_TOP;
    static {
        VoxelShape[] shape = {
                Shapes.box(0, 0, 0, 1, 0.1875, 1),
                Shapes.box(0.125, 0.1875, 0.125, 0.875, 1.0625, 0.875),
                Shapes.box(0.125, 1.0625, 0.125, 0.875, 2, 0.875),
        };
        OBELISK_SHAPE = VoxelShapeUtil.mergeVoxelShapes(shape);
        DEFAULT_OBELISK_SHAPE = Block.box(2.0, 0.0, 2.0, 14.0, 32.0, 14.0);
        DEFAULT_OBELISK_SHAPE_TOP = DEFAULT_OBELISK_SHAPE.move(0.0, -1.0, 0.0);
    }
}
