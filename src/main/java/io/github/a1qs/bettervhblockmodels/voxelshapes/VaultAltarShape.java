package io.github.a1qs.bettervhblockmodels.voxelshapes;

import io.github.a1qs.bettervhblockmodels.util.VoxelShapeUtil;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class VaultAltarShape {
    public static final VoxelShape VAULT_ALTAR_SHAPE;
    
    static {
        VoxelShape[] shape = new VoxelShape[]{
                Shapes.box(0, 0.8125, 0, 1, 1, 1),
                Shapes.box(0.3125, 0.0625, 0.3125, 0.6875, 0.6875, 0.6875),
                Shapes.box(0.25, 0.6875, 0.25, 0.75, 0.8125, 0.75),
                Shapes.box(0.25, 0.953125, 0.25, 0.75, 1.078125, 0.75),
                Shapes.box(0.0625, 0, 0.0625, 0.9375, 0.1875, 0.9375),
                Shapes.box(0.1875, 0.1875, 0.1875, 0.8125, 0.375, 0.8125),
                Shapes.box(0, 1.1875, 0.875, 0.125, 1.25, 1),
                Shapes.box(0, 1.1875, 0, 0.125, 1.25, 0.125),
                Shapes.box(0.875, 1.1875, 0, 1, 1.25, 0.125),
                Shapes.box(0.875, 1.1875, 0.875, 1, 1.25, 1),
                Shapes.box(0.8125, 0.75, 0.8125, 1.0625, 1.1875, 1.0625),
                Shapes.box(-0.0625, 0.75, 0.8125, 0.1875, 1.1875, 1.0625),
                Shapes.box(-0.0625, 0.75, -0.0625, 0.1875, 1.1875, 0.1875),
                Shapes.box(0.8125, 0.75, -0.0625, 1.0625, 1.1875, 0.1875),
                Shapes.box(0.9375, 0.6875, -0.0625, 1.0625, 0.75, 0.0625),
                Shapes.box(-0.0625, 0.6875, -0.0625, 0.0625, 0.75, 0.0625),
                Shapes.box(-0.0625, 0.6875, 0.9375, 0.0625, 0.75, 1.0625),
                Shapes.box(0.9375, 0.6875, 0.9375, 1.0625, 0.75, 1.0625)
        };
        
        VAULT_ALTAR_SHAPE = VoxelShapeUtil.mergeVoxelShapes(shape);
    }
}
