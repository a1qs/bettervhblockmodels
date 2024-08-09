package io.github.a1qs.bettervhblockmodels.mixins;

import io.github.a1qs.bettervhblockmodels.voxelshapes.*;
import iskallia.vault.block.*;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = BlockBehaviour.class, remap = false)
public class MixinBlockBehaviour {
    @Inject(method = "getShape", at = @At("HEAD"), cancellable = true)
    public void addAdditionalShapes(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext, CallbackInfoReturnable<VoxelShape> cir) {
        if(pState.getBlock() instanceof VaultAltarBlock) {
            // Vault Altar
            cir.setReturnValue(VaultAltarShape.VAULT_ALTAR_SHAPE);
        } else if(pState.getBlock() instanceof VaultEnhancementAltar) {
            // Vault Enhancement Altar
            cir.setReturnValue(VaultEnhancementAltarShape.VAULT_ENHANCEMENT_ALTAR_SHAPE);
        } else if(pState.getBlock() instanceof DemagnetizerBlock) {
            // Demagnetizer
            cir.setReturnValue(DemagnetizerShape.DEMAGNETIZER_SHAPE);
        } else if(pState.getBlock() instanceof VaultDiffuserBlock) {
            // Vault Diffuser
            cir.setReturnValue(VaultDiffuserShape.VAULT_DIFFUSER_SHAPE);
        } else if(pState.getBlock() instanceof VaultDiffuserUpgradedBlock) {
            // Soul Harvester
            cir.setReturnValue(SoulHarvesterShape.SOUL_HARVESTER_SHAPE);
        } else if(pState.getBlock() instanceof VaultRecyclerBlock) {
            // Vault Recycler
            cir.setReturnValue(VaultRecyclerShape.VAULT_RECYCLER_SHAPE);
        } else if(pState.getBlock() instanceof ModifierDiscoveryBlock) {
            // Modifier Archive
            cir.setReturnValue(ModifierArchiveShape.MODIFIER_ARCHIVE_SHAPE);
        } else if(pState.getBlock() instanceof AnimatrixBlock) {
            // Animatrix
            cir.setReturnValue(AnimatrixShape.ANIMATRIX_SHAPE);
        } else if(pState.getBlock() instanceof DebagnetizerBlock) {
            // Debagnetizer
            cir.setReturnValue(DebagnetizerShape.DEBAGNETIZER_SHAPE);
        } else if(pState.getBlock() instanceof VaultForgeBlock) {
            // Vault Forge
            VoxelShape vaultForgeShape;
            Direction direction = pState.getValue(VaultForgeBlock.FACING);
            switch (direction) {
                case NORTH -> vaultForgeShape = VaultForgeShape.FORGE_SHAPE_180;
                case EAST -> vaultForgeShape = VaultForgeShape.FORGE_SHAPE_270;
                case SOUTH -> vaultForgeShape = VaultForgeShape.FORGE_SHAPE;
                default -> vaultForgeShape = VaultForgeShape.FORGE_SHAPE_90;
            }
            cir.setReturnValue(vaultForgeShape);
        } else if(pState.getBlock() instanceof VaultArtisanStationBlock) {
            // Vault Artisan Station
            VoxelShape vaultArtisanShape;
            Direction direction = pState.getValue(VaultArtisanStationBlock.FACING);
            switch (direction) {
                case EAST -> vaultArtisanShape = VaultArtisanShape.VAULT_ARTISAN_SHAPE;
                case SOUTH -> vaultArtisanShape = VaultArtisanShape.VAULT_ARTISAN_SHAPE_90;
                case WEST -> vaultArtisanShape = VaultArtisanShape.VAULT_ARTISAN_SHAPE_180;
                default -> vaultArtisanShape = VaultArtisanShape.VAULT_ARTISAN_SHAPE_270;
            }
            cir.setReturnValue(vaultArtisanShape);
        } else if(pState.getBlock() instanceof ModifierWorkbenchBlock) {
            // Modifier Workbench
            VoxelShape modifierWorkbench;
            Direction direction = pState.getValue(ModifierWorkbenchBlock.FACING);
            switch (direction) {
                case EAST -> modifierWorkbench = ModifierWorkbenchShape.WORKBENCH_SHAPE_270;
                case SOUTH -> modifierWorkbench = ModifierWorkbenchShape.WORKBENCH_SHAPE;
                case WEST -> modifierWorkbench = ModifierWorkbenchShape.WORKBENCH_SHAPE_90;
                default -> modifierWorkbench = ModifierWorkbenchShape.WORKBENCH_SHAPE_180;
            }
            cir.setReturnValue(modifierWorkbench);
        } else if(pState.getBlock() instanceof CardEssenceExtractorBlock) {
            // Card Essence Extractor
            VoxelShape essenceExtractor;
            Direction direction = pState.getValue(ModifierWorkbenchBlock.FACING);
            switch (direction) {
                case EAST -> essenceExtractor = CardEssenceExtractorShape.CARD_ESSENCE_EXTRACTOR_SHAPE_270;
                case SOUTH -> essenceExtractor = CardEssenceExtractorShape.CARD_ESSENCE_EXTRACTOR_SHAPE;
                case WEST -> essenceExtractor = CardEssenceExtractorShape.CARD_ESSENCE_EXTRACTOR_SHAPE_90;
                default -> essenceExtractor = CardEssenceExtractorShape.CARD_ESSENCE_EXTRACTOR_SHAPE_180;
            }
            cir.setReturnValue(essenceExtractor);
        }

    }
}
