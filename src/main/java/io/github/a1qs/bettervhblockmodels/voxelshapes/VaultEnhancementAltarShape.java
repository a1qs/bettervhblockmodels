package io.github.a1qs.bettervhblockmodels.voxelshapes;

import io.github.a1qs.bettervhblockmodels.util.VoxelShapeUtil;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class VaultEnhancementAltarShape {
    public static final VoxelShape VAULT_ENHANCEMENT_ALTAR_SHAPE;
    
    static {
        VoxelShape[] shape = new VoxelShape[]{
                Shapes.box(0, 0.8125, 0, 1, 1, 1),
                Shapes.box(0.3125, 0.0625, 0.3125, 0.6875, 0.6875, 0.6875),
                Shapes.box(0.25, 0.6875, 0.25, 0.75, 0.8125, 0.75),
                Shapes.box(0.0625, 0, 0.0625, 0.9375, 0.1875, 0.9375),
                Shapes.box(0.6875, 0.625, 0.6875, 0.9375, 0.875, 0.9375),
                Shapes.box(0.0625, 0.625, 0.6875, 0.3125, 0.875, 0.9375),
                Shapes.box(0.0625, 0.625, 0.0625, 0.3125, 0.9375, 0.3125),
                Shapes.box(0.6875, 0.625, 0.0625, 0.9375, 0.8125, 0.3125)
        };
        VAULT_ENHANCEMENT_ALTAR_SHAPE = VoxelShapeUtil.mergeVoxelShapes(shape);
    }
}
