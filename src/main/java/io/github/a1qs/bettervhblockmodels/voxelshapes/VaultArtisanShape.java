package io.github.a1qs.bettervhblockmodels.voxelshapes;

import io.github.a1qs.bettervhblockmodels.util.VoxelShapeUtil;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class VaultArtisanShape {
    public static final VoxelShape VAULT_ARTISAN_SHAPE;
    public static final VoxelShape VAULT_ARTISAN_SHAPE_90;
    public static final VoxelShape VAULT_ARTISAN_SHAPE_180;
    public static final VoxelShape VAULT_ARTISAN_SHAPE_270;
    
    static {
        VoxelShape[] vaultArtisanStationShape = {
                Shapes.box(0.3125, 0.75, 0, 1, 1, 1),
                Shapes.box(0.3125, 0, 0.125, 1, 0.1875, 0.875),
                Shapes.box(0, 0, 0.125, 0.3125, 0.0625, 0.875),
                Shapes.box(0, 0.75, 0.1875, 0.3125, 1, 0.8125),
                Shapes.box(0.1875, 0.4375, 0.484375, 0.3125, 0.625, 0.859375),
                Shapes.box(0.234375, 0.0625, 0.609375, 0.296875, 0.4375, 0.734375),
                Shapes.box(0.234375, 0.0625, 0.234375, 0.296875, 0.4375, 0.296875),
                Shapes.box(0.234375, 0.0625, 0.359375, 0.296875, 0.4375, 0.421875),
                Shapes.box(0.234375, 0.375, 0.25, 0.296875, 0.625, 0.3125),
                Shapes.box(0.234375, 0.375, 0.34375, 0.296875, 0.625, 0.40625),
                Shapes.box(0.3125, 0.1875, 0.1875, 0.9375, 0.75, 0.8125),
                Shapes.box(0.1875, 0.3125, 0.546875, 0.3125, 0.375, 0.796875),
                Shapes.box(0.1875, 0.359375, 0.203125, 0.3125, 0.421875, 0.453125),
                Shapes.box(0.875, 0.1875, 0.125, 1, 0.75, 0.25),
                Shapes.box(0.875, 0.1875, 0.75, 1, 0.75, 0.875),
                Shapes.box(0.3125, 0.1875, 0.8125, 0.4375, 0.75, 0.875),
        };
        VAULT_ARTISAN_SHAPE = VoxelShapeUtil.mergeVoxelShapes(vaultArtisanStationShape);
        VAULT_ARTISAN_SHAPE_90 = VoxelShapeUtil.rotateShape(VAULT_ARTISAN_SHAPE, 90);
        VAULT_ARTISAN_SHAPE_180 = VoxelShapeUtil.rotateShape(VAULT_ARTISAN_SHAPE, 180);
        VAULT_ARTISAN_SHAPE_270 = VoxelShapeUtil.rotateShape(VAULT_ARTISAN_SHAPE, 270);

    }
}
