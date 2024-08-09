package io.github.a1qs.bettervhblockmodels;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(BetterVhBlockModels.MOD_ID)
public class BetterVhBlockModels {
    public static final String MOD_ID = "bettervhblockmodels";
    public BetterVhBlockModels() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
