package io.github.a1qs.bettervhblockmodels.mixins;

import io.github.a1qs.bettervhblockmodels.config.CommonConfigs;
import io.github.a1qs.bettervhblockmodels.voxelshapes.VaultCrateShape;
import iskallia.vault.block.VaultCrateBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import javax.annotation.Nonnull;

@Mixin(value = VaultCrateBlock.class)
public class MixinVaultCrateBlock {
    /**
     * @author a1qs
     * @reason make Block Hitbox match block model
     */
    @Overwrite
    @Nonnull
    public VoxelShape getShape(@Nonnull BlockState state, @Nonnull BlockGetter world, @Nonnull BlockPos pos, @Nonnull CollisionContext context) {
        if (CommonConfigs.VAULT_CRATE.get()) {
            return VaultCrateShape.CRATE_SHAPE;
        }
        return VaultCrateBlock.SHAPE;
    }
}
