package io.github.a1qs.bettervhblockmodels.voxelshapes;

import io.github.a1qs.bettervhblockmodels.util.VoxelShapeUtil;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class VaultEnchanterShape {
    public static final VoxelShape VAULT_ENCHANTER_SHAPE;

    static {
        VoxelShape[] shape = {
                 Shapes.box(0, 0.5625, 0, 1, 1, 1),
                 Shapes.box(0.3125, 0.0625, 0.3125, 0.6875, 0.6875, 0.6875),
                 Shapes.box(0.0625, 0, 0.0625, 0.9375, 0.1875, 0.9375),
                 Shapes.box(0.375, 0.1875, 0.6875, 0.625, 0.625, 0.9375),
                 Shapes.box(0.0625, 0.1875, 0.375, 0.3125, 0.625, 0.625),
                 Shapes.box(0.375, 0.1875, 0.0625, 0.625, 0.6875, 0.3125),
                 Shapes.box(0.6875, 0.1875, 0.375, 0.9375, 0.5625, 0.625),
        };
        VAULT_ENCHANTER_SHAPE = VoxelShapeUtil.mergeVoxelShapes(shape);
    }
}
