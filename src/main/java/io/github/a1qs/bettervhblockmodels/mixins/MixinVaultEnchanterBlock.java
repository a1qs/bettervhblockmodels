package io.github.a1qs.bettervhblockmodels.mixins;

import io.github.a1qs.bettervhblockmodels.config.CommonConfigs;
import io.github.a1qs.bettervhblockmodels.voxelshapes.VaultEnchanterShape;
import iskallia.vault.block.VaultEnchanterBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import javax.annotation.Nonnull;

@Mixin(value = VaultEnchanterBlock.class)
public class MixinVaultEnchanterBlock {
    /**
     * @author a1qs
     * @reason make Block Hitbox match block model
     */
    @Nonnull
    @Overwrite
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        if (CommonConfigs.VAULT_ENCHANTER.get()) {
            return VaultEnchanterShape.VAULT_ENCHANTER_SHAPE;
        }
        return VaultEnchanterBlock.SHAPE;
    }
}
