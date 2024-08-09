package io.github.a1qs.bettervhblockmodels.voxelshapes;

import io.github.a1qs.bettervhblockmodels.util.VoxelShapeUtil;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class VaultDiffuserShape {
    public static final VoxelShape VAULT_DIFFUSER_SHAPE;

    static {
        VoxelShape[] shape = {
                Shapes.box(0.6875, 0.25, 0, 1, 0.4375, 1),
                Shapes.box(0, 0.25, 0, 0.3125, 0.4375, 1),
                Shapes.box(0.3125, 0.25, 0, 0.6875, 0.4375, 0.3125),
                Shapes.box(0.3125, 0.25, 0.6875, 0.6875, 0.4375, 1),
                Shapes.box(0.25, 0.375, 0.25, 0.75, 0.375, 0.75),
                Shapes.box(0.25, 0.1875, 0.25, 0.75, 0.25, 0.75),
                Shapes.box(0.0625, 0, 0.0625, 0.9375, 0.125, 0.9375),
                Shapes.box(0.1875, 0.0625, 0.1875, 0.8125, 0.1875, 0.8125),
                Shapes.box(0.0625, 0.4375, 0.6875, 0.3125, 0.5, 0.9375),
                Shapes.box(0.6875, 0.4375, 0.6875, 0.9375, 0.5, 0.9375),
                Shapes.box(0.6875, 0.4375, 0.0625, 0.9375, 0.5, 0.3125),
                Shapes.box(0.0625, 0.9375, 0.0625, 0.1875, 1, 0.1875),
                Shapes.box(0.8125, 0.9375, 0.0625, 0.9375, 1, 0.1875),
                Shapes.box(0.0625, 0.9375, 0.8125, 0.1875, 1, 0.9375),
                Shapes.box(0.8125, 0.9375, 0.8125, 0.9375, 1, 0.9375),
                Shapes.box(0.0625, 0.5, 0.0625, 0.25, 0.9375, 0.25),
                Shapes.box(0.0625, 0.5, 0.75, 0.25, 0.9375, 0.9375),
                Shapes.box(0.75, 0.5, 0.0625, 0.9375, 0.9375, 0.25),
                Shapes.box(0.75, 0.5, 0.75, 0.9375, 0.9375, 0.9375),
                Shapes.box(0.0625, 0.4375, 0.0625, 0.3125, 0.5, 0.3125),
                Shapes.box(0.375, 0.25, 0.375, 0.625, 0.4375, 0.625),
                Shapes.box(0.7484375, 0.8765625, 0.7484375, 0.8109375, 0.9390625, 0.8109375),
                Shapes.box(0.8734375, 1.0015625, 0.8734375, 0.9359375, 1.0640625, 0.9359375),
                Shapes.box(0.1890625, 0.8765625, 0.7484375, 0.2515625, 0.9390625, 0.8109375),
                Shapes.box(0.0640625, 1.0015625, 0.8734375, 0.1265625, 1.0640625, 0.9359375),
                Shapes.box(0.7484375, 0.8765625, 0.1890625, 0.8109375, 0.9390625, 0.2515625),
                Shapes.box(0.8734375, 1.0015625, 0.0640625, 0.9359375, 1.0640625, 0.1265625),
                Shapes.box(0.1890625, 0.8765625, 0.1890625, 0.2515625, 0.9390625, 0.2515625),
                Shapes.box(0.0640625, 1.0015625, 0.0640625, 0.1265625, 1.0640625, 0.1265625),
        };
        VAULT_DIFFUSER_SHAPE = VoxelShapeUtil.mergeVoxelShapes(shape);
    }
}
