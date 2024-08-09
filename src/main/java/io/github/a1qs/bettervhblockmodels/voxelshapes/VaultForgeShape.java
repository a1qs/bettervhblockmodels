package io.github.a1qs.bettervhblockmodels.voxelshapes;

import io.github.a1qs.bettervhblockmodels.util.VoxelShapeUtil;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class VaultForgeShape {
    public static final VoxelShape FORGE_SHAPE;
    public static final VoxelShape FORGE_SHAPE_90;
    public static final VoxelShape FORGE_SHAPE_180;
    public static final VoxelShape FORGE_SHAPE_270;

    static {
        VoxelShape[] shapes = new VoxelShape[] {
                Shapes.box(0, 0, 0, 1, 0.125, 1),
                Shapes.box(0.875, 0.125, 0, 1, 0.875, 1),
                Shapes.box(0, 0.125, 0, 0.125, 0.875, 1),
                Shapes.box(0.125, 0.125, 0.8125, 0.875, 0.875, 1),
                Shapes.box(0.125, 0.125, 0.0625, 0.875, 0.3125, 0.25),
                Shapes.box(0.75, 0.25, 0.09375, 0.8125, 0.75, 0.15625),
                Shapes.box(0.1875, 0.25, 0.09375, 0.25, 0.75, 0.15625),
                Shapes.box(0.5625, 0.25, 0.09375, 0.625, 0.75, 0.15625),
                Shapes.box(0.375, 0.25, 0.09375, 0.4375, 0.75, 0.15625),
                Shapes.box(0.125, 0.625, 0.0625, 0.875, 0.875, 0.25),
                Shapes.box(0.125, 0.25, 0.1875, 0.875, 0.875, 0.375),
                Shapes.box(0, 0.875, 0, 1, 1, 1)
        };
        FORGE_SHAPE = VoxelShapeUtil.mergeVoxelShapes(shapes);
        FORGE_SHAPE_90 = VoxelShapeUtil.rotateShape(FORGE_SHAPE, 90);
        FORGE_SHAPE_180 = VoxelShapeUtil.rotateShape(FORGE_SHAPE, 180);
        FORGE_SHAPE_270 = VoxelShapeUtil.rotateShape(FORGE_SHAPE, 270);
    }
}
