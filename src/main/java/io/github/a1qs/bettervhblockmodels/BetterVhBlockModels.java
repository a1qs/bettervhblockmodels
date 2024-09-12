package io.github.a1qs.bettervhblockmodels;

import io.github.a1qs.bettervhblockmodels.config.CommonConfigs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;

@Mod(BetterVhBlockModels.MOD_ID)
public class BetterVhBlockModels {
    public static final String MOD_ID = "bettervhblockmodels";
    public BetterVhBlockModels() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, CommonConfigs.SPEC, "bettervhblockmodels-common.toml");
        MinecraftForge.EVENT_BUS.register(this);
    }
}
