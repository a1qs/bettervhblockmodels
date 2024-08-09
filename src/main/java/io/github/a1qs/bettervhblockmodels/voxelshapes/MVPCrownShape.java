package io.github.a1qs.bettervhblockmodels.voxelshapes;

import io.github.a1qs.bettervhblockmodels.util.VoxelShapeUtil;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class MVPCrownShape {
    public static final VoxelShape MVP_CROWN_SHAPE;

    static {
            VoxelShape[] shape = new VoxelShape[] {
            Shapes.box(0.375, 0, 0.125, 0.625, 0.1875, 0.1875),
            Shapes.box(0.375, 0, 0.8125, 0.625, 0.1875, 0.875),
            Shapes.box(0.8125, 0, 0.375, 0.875, 0.1875, 0.625),
            Shapes.box(0.125, 0, 0.375, 0.1875, 0.1875, 0.625),
            Shapes.box(0.25, 0, 0.1875, 0.375, 0.15625, 0.25),
            Shapes.box(0.625, 0, 0.1875, 0.75, 0.15625, 0.25),
            Shapes.box(0.625, 0, 0.75, 0.75, 0.15625, 0.8125),
            Shapes.box(0.25, 0, 0.75, 0.375, 0.15625, 0.8125),
            Shapes.box(0.1875, 0, 0.625, 0.25, 0.15625, 0.75),
            Shapes.box(0.1875, 0, 0.25, 0.25, 0.15625, 0.375),
            Shapes.box(0.75, 0, 0.25, 0.8125, 0.15625, 0.375),
            Shapes.box(0.75, 0, 0.625, 0.8125, 0.15625, 0.75),
            Shapes.box(0.40625, 0.1875, 0.125, 0.59375, 0.21875, 0.1875),
            Shapes.box(0.40625, 0.1875, 0.8125, 0.59375, 0.21875, 0.875),
            Shapes.box(0.125, 0.1875, 0.40625, 0.1875, 0.21875, 0.59375),
            Shapes.box(0.8125, 0.1875, 0.40625, 0.875, 0.21875, 0.59375),
            Shapes.box(0.8125, 0.21875, 0.421875, 0.875, 0.25, 0.578125),
            Shapes.box(0.125, 0.21875, 0.421875, 0.1875, 0.25, 0.578125),
            Shapes.box(0.421875, 0.21875, 0.8125, 0.578125, 0.25, 0.875),
            Shapes.box(0.421875, 0.21875, 0.125, 0.578125, 0.25, 0.1875),
            Shapes.box(0.46875, 0.25, 0.125, 0.53125, 0.28125, 0.1875),
            Shapes.box(0.46875, 0.25, 0.8125, 0.53125, 0.28125, 0.875),
            Shapes.box(0.8125, 0.25, 0.46875, 0.875, 0.28125, 0.53125),
            Shapes.box(0.125, 0.25, 0.46875, 0.1875, 0.28125, 0.53125),
            Shapes.box(0.140625, 0.28125, 0.484375, 0.171875, 0.3125, 0.515625),
            Shapes.box(0.828125, 0.28125, 0.484375, 0.859375, 0.3125, 0.515625),
            Shapes.box(0.484375, 0.28125, 0.828125, 0.515625, 0.3125, 0.859375),
            Shapes.box(0.484375, 0.28125, 0.140625, 0.515625, 0.3125, 0.171875),
            Shapes.box(0.4625, 0.03125, 0.109375, 0.540625, 0.140625, 0.125),
            Shapes.box(0.4625, 0.03125, 0.875, 0.540625, 0.140625, 0.890625),
            Shapes.box(0.875, 0.03125, 0.460625, 0.890625, 0.140625, 0.53875),
            Shapes.box(0.109375, 0.03125, 0.4625, 0.125, 0.140625, 0.540625),
            Shapes.box(0.875, 0.0625, 0.390625, 0.890625, 0.109375, 0.4375),
            Shapes.box(0.875, 0.0625, 0.5625, 0.890625, 0.109375, 0.609375),
            Shapes.box(0.109375, 0.0625, 0.5625, 0.125, 0.109375, 0.609375),
            Shapes.box(0.109375, 0.0625, 0.390625, 0.125, 0.109375, 0.4375),
            Shapes.box(0.5625, 0.0625, 0.875, 0.609375, 0.109375, 0.890625),
            Shapes.box(0.390625, 0.0625, 0.875, 0.4375, 0.109375, 0.890625),
            Shapes.box(0.390625, 0.0625, 0.109375, 0.4375, 0.109375, 0.125),
            Shapes.box(0.5625, 0.0625, 0.109375, 0.609375, 0.109375, 0.125)
        };

        MVP_CROWN_SHAPE = VoxelShapeUtil.mergeVoxelShapes(shape);
    }
}
