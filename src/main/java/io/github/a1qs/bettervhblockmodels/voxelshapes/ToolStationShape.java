package io.github.a1qs.bettervhblockmodels.voxelshapes;

import io.github.a1qs.bettervhblockmodels.util.VoxelShapeUtil;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class ToolStationShape {
    public static final VoxelShape TOOL_STATION_SHAPE;
    public static final VoxelShape TOOL_STATION_SHAPE_90;
    public static final VoxelShape TOOL_STATION_SHAPE_180;
    public static final VoxelShape TOOL_STATION_SHAPE_270;
    static {
        VoxelShape[] shape = {
                Shapes.box(0.0625, 0.625, 0.0625, 0.9375, 0.8125, 0.9375),
                Shapes.box(0.625, 0, 0.625, 0.8125, 0.625, 0.8125),
                Shapes.box(0.375, 0.1875, 0.6875, 0.625, 0.3125, 0.75),
                Shapes.box(0.25, 0.1875, 0.375, 0.3125, 0.3125, 0.625),
                Shapes.box(0.6875, 0.1875, 0.375, 0.75, 0.3125, 0.625),
                Shapes.box(0.375, 0.1875, 0.25, 0.625, 0.3125, 0.3125),
                Shapes.box(0.1875, 0, 0.625, 0.375, 0.625, 0.8125),
                Shapes.box(0.1875, 0, 0.1875, 0.375, 0.625, 0.375),
                Shapes.box(0.625, 0, 0.1875, 0.8125, 0.625, 0.375),
                Shapes.box(0.375, 0.8125, 0.5625, 0.4375, 0.9375, 0.8125),
                Shapes.box(0.5625, 0.8125, 0.5625, 0.625, 0.9375, 0.8125),
                Shapes.box(0.625, 0.8125, 0.5625, 0.75, 0.875, 0.8125),
                Shapes.box(0.25, 0.8125, 0.5625, 0.375, 0.875, 0.8125),
                Shapes.box(0, 0.625, 0.25, 0.0625, 0.75, 0.75),
                Shapes.box(0, 0.1875, 0.3125, 0.0625, 0.625, 0.375),
                Shapes.box(0, 0.75, 0.3125, 0.0625, 0.875, 0.375),
                Shapes.box(0, 0.75, 0.421875, 0.0625, 0.875, 0.484375),
                Shapes.box(0, 0.75, 0.625, 0.0625, 0.875, 0.6875),
                Shapes.box(0, 0.1875, 0.421875, 0.0625, 0.625, 0.484375),
                Shapes.box(0, 0.1875, 0.625, 0.0625, 0.625, 0.6875),
        };
        TOOL_STATION_SHAPE = VoxelShapeUtil.mergeVoxelShapes(shape);
        TOOL_STATION_SHAPE_90 = VoxelShapeUtil.rotateShape(TOOL_STATION_SHAPE, 90);
        TOOL_STATION_SHAPE_180 = VoxelShapeUtil.rotateShape(TOOL_STATION_SHAPE, 180);
        TOOL_STATION_SHAPE_270 = VoxelShapeUtil.rotateShape(TOOL_STATION_SHAPE, 270);
    }
}
