package io.github.a1qs.bettervhblockmodels.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class CommonConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;


    public static final ForgeConfigSpec.ConfigValue<Boolean> ASCENSION_FORGE;
    public static final ForgeConfigSpec.ConfigValue<Boolean> BLACK_MARKET;
    public static final ForgeConfigSpec.ConfigValue<Boolean> BOUNTY_BLOCK;
    public static final ForgeConfigSpec.ConfigValue<Boolean> CARD_ESSENCE_EXTRACTOR;
    public static final ForgeConfigSpec.ConfigValue<Boolean> CRAKE_PEDESTAL_BLOCK;
    public static final ForgeConfigSpec.ConfigValue<Boolean> CRYSTAL_WORKBENCH;
    public static final ForgeConfigSpec.ConfigValue<Boolean> EASTER_EGG;
    public static final ForgeConfigSpec.ConfigValue<Boolean> GRID_GATEWAY;
    public static final ForgeConfigSpec.ConfigValue<Boolean> HERALD_CONTROLLER;
    public static final ForgeConfigSpec.ConfigValue<Boolean> INSCRIPTION_TABLE;
    public static final ForgeConfigSpec.ConfigValue<Boolean> LODESTONE;
    public static final ForgeConfigSpec.ConfigValue<Boolean> MONOLITH;
    public static final ForgeConfigSpec.ConfigValue<Boolean> MVP_CROWN;
    public static final ForgeConfigSpec.ConfigValue<Boolean> OBELISK;
    public static final ForgeConfigSpec.ConfigValue<Boolean> PYLON;
    public static final ForgeConfigSpec.ConfigValue<Boolean> RELIC_PEDESTAL;
    public static final ForgeConfigSpec.ConfigValue<Boolean> SCAVENGER_ALTAR;
    public static final ForgeConfigSpec.ConfigValue<Boolean> SHOP_PEDESTAL;
    public static final ForgeConfigSpec.ConfigValue<Boolean> SKILL_ALTAR;
    public static final ForgeConfigSpec.ConfigValue<Boolean> SPIRIT_EXTRACTOR;
    public static final ForgeConfigSpec.ConfigValue<Boolean> STABILIZER;
    public static final ForgeConfigSpec.ConfigValue<Boolean> TOOLSTATION;
    public static final ForgeConfigSpec.ConfigValue<Boolean> VAULT_CRATE;
    public static final ForgeConfigSpec.ConfigValue<Boolean> VAULT_ENCHANTER;
    public static final ForgeConfigSpec.ConfigValue<Boolean> JEWEL_APPLICATOR;
    public static final ForgeConfigSpec.ConfigValue<Boolean> WARDROBE;
    public static final ForgeConfigSpec.ConfigValue<Boolean> OFFERING_PILLAR;

    public static final ForgeConfigSpec.ConfigValue<Boolean> VAULT_ALTAR;
    public static final ForgeConfigSpec.ConfigValue<Boolean> ENHANCEMENT_ALTAR;
    public static final ForgeConfigSpec.ConfigValue<Boolean> DEMAGNETIZER;
    public static final ForgeConfigSpec.ConfigValue<Boolean> VAULT_DIFFUSER;
    public static final ForgeConfigSpec.ConfigValue<Boolean> SOUL_HARVESTER;
    public static final ForgeConfigSpec.ConfigValue<Boolean> VAULT_RECYCLER;
    public static final ForgeConfigSpec.ConfigValue<Boolean> MODIFIER_ARCHIVE;
    public static final ForgeConfigSpec.ConfigValue<Boolean> ANIMATRIX;
    public static final ForgeConfigSpec.ConfigValue<Boolean> DEBAGNETIZER;
    public static final ForgeConfigSpec.ConfigValue<Boolean> VAULT_FORGE;
    public static final ForgeConfigSpec.ConfigValue<Boolean> ARTISAN_STATION;
    public static final ForgeConfigSpec.ConfigValue<Boolean> MODIFIER_WORKBENCH;



    static {
        BUILDER.push("BetterVHBlockModels Common Config");

        ASCENSION_FORGE = BUILDER.comment("Enable the Ascension Forge Block Hitbox")
                .define("ASCENSION_FORGE", false);

        BLACK_MARKET = BUILDER.comment("Enable the Black Market Block Hitbox")
                .define("BLACK_MARKET", true);

        BOUNTY_BLOCK = BUILDER.comment("Enable the Bounty Block Hitbox")
                .define("BOUNTY_BLOCK", true);

        CARD_ESSENCE_EXTRACTOR = BUILDER.comment("Enable the Card Essence Extractor Block Hitbox")
                .define("CARD_ESSENCE_EXTRACTOR", true);

        CRAKE_PEDESTAL_BLOCK = BUILDER.comment("Enable the Crake Pedestal Block Hitbox")
                .define("CRAKE_PEDESTAL_BLOCK", true);

        CRYSTAL_WORKBENCH = BUILDER.comment("Enable the Crystal Workbench Block Hitbox")
                .define("CRYSTAL_WORKBENCH", true);

        EASTER_EGG = BUILDER.comment("Enable the Easter Egg Block Hitbox")
                .define("EASTER_EGG", true);

        GRID_GATEWAY = BUILDER.comment("Enable the Grid Gateway Block Hitbox")
                .define("GRID_GATEWAY", true);

        HERALD_CONTROLLER = BUILDER.comment("Enable the Herald Controller Block Hitbox")
                .define("HERALD_CONTROLLER", true);

        INSCRIPTION_TABLE = BUILDER.comment("Enable the Inscription Table Block Hitbox")
                .define("INSCRIPTION_TABLE", true);

        LODESTONE = BUILDER.comment("Enable the Lodestone Block Hitbox")
                .define("LODESTONE", true);

        MONOLITH = BUILDER.comment("Enable the Monolith Block Hitbox")
                .define("MONOLITH", true);

        MVP_CROWN = BUILDER.comment("Enable the MVP Crown Block Hitbox")
                .define("MVP_CROWN", true);

        OBELISK = BUILDER.comment("Enable the Obelisk Block Hitbox")
                .define("OBELISK", true);

        PYLON = BUILDER.comment("Enable the Pylon Block Hitbox")
                .define("PYLON", true);

        RELIC_PEDESTAL = BUILDER.comment("Enable the Relic Pedestal Block Hitbox")
                .define("RELIC_PEDESTAL", true);

        SCAVENGER_ALTAR = BUILDER.comment("Enable the Scavenger Altar Block Hitbox")
                .define("SCAVENGER_ALTAR", true);

        SHOP_PEDESTAL = BUILDER.comment("Enable the Shop Pedestal Block Hitbox")
                .define("SHOP_PEDESTAL", true);

        SKILL_ALTAR = BUILDER.comment("Enable the Skill Altar Block Hitbox")
                .define("SKILL_ALTAR", true);

        SPIRIT_EXTRACTOR = BUILDER.comment("Enable the Spirit Extractor Block Hitbox")
                .define("SPIRIT_EXTRACTOR", true);

        STABILIZER = BUILDER.comment("Enable the Stabilizer Block Hitbox")
                .define("STABILIZER", true);

        TOOLSTATION = BUILDER.comment("Enable the Toolstation Block Hitbox")
                .define("TOOLSTATION", true);

        VAULT_CRATE = BUILDER.comment("Enable the Vault Crate Block Hitbox")
                .define("VAULT_CRATE", true);

        VAULT_ENCHANTER = BUILDER.comment("Enable the Vault Enchanter Block Hitbox")
                .define("VAULT_ENCHANTER", true);

        JEWEL_APPLICATOR = BUILDER.comment("Enable the Jewel Applicator Block Hitbox")
                .define("JEWEL_APPLICATOR", true);

        WARDROBE = BUILDER.comment("Enable the Wardrobe Block Hitbox")
                .define("WARDROBE", true);

        OFFERING_PILLAR = BUILDER.comment("Enable the Offering Pillar Block Hitbox")
                .define("OFFERING_PILLAR", true);

        VAULT_ALTAR = BUILDER.comment("Enable the Vault Altar Block Hitbox")
                .define("VAULT_ALTAR", false);

        ENHANCEMENT_ALTAR = BUILDER.comment("Enable the Enhancement Altar Block Hitbox")
                .define("ENHANCEMENT_ALTAR", true);

        DEMAGNETIZER = BUILDER.comment("Enable the Demagnetizer Block Hitbox")
                .define("DEMAGNETIZER", true);

        VAULT_DIFFUSER = BUILDER.comment("Enable the Vault Diffuser Block Hitbox")
                .define("VAULT_DIFFUSER", true);

        SOUL_HARVESTER = BUILDER.comment("Enable the Soul Harvester Block Hitbox")
                .define("SOUL_HARVESTER", true);

        VAULT_RECYCLER = BUILDER.comment("Enable the Vault Recycler Block Hitbox")
                .define("VAULT_RECYCLER", true);

        MODIFIER_ARCHIVE = BUILDER.comment("Enable the Modifier Archive Block Hitbox")
                .define("MODIFIER_ARCHIVE", true);

        ANIMATRIX = BUILDER.comment("Enable the Animatrix Block Hitbox")
                .define("ANIMATRIX", true);

        DEBAGNETIZER = BUILDER.comment("Enable the Debagnetizer Block Hitbox")
                .define("DEBAGNETIZER", true);

        VAULT_FORGE = BUILDER.comment("Enable the Vault Forge Block Hitbox")
                .define("VAULT_FORGE", true);

        ARTISAN_STATION = BUILDER.comment("Enable the Artisan Station Block Hitbox")
                .define("ARTISAN_STATION", true);

        MODIFIER_WORKBENCH = BUILDER.comment("Enable the Modifier Workbench Block Hitbox")
                .define("MODIFIER_WORKBENCH", true);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
