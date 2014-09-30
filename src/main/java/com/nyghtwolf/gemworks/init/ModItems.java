package com.nyghtwolf.gemworks.init;

import com.nyghtwolf.gemworks.item.*;
import com.nyghtwolf.gemworks.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)

//Initialize Items
public class ModItems
{
    public static final ItemGemworks EnergizedMysticGem = new com.nyghtwolf.gemworks.item.ItemEnergizedMysticGem();
    public static final ItemGemworks ProsperousMysticGem = new com.nyghtwolf.gemworks.item.ItemProsperousMysticGem();
    public static final ItemGemworks ShimmeringMysticGem = new com.nyghtwolf.gemworks.item.ItemShimmeringMysticGem();
    public static final ItemGemworks TimelessMysticGem = new com.nyghtwolf.gemworks.item.ItemTimelessMysticGem();
    public static final ItemGemworks MysticEssenceGem = new com.nyghtwolf.gemworks.item.ItemMysticEssenceGem();
    public static final ItemGemworks MysticCoreGem = new com.nyghtwolf.gemworks.item.ItemMysticCoreGem();
    public static final ItemGemworks MysticRegalGem = new com.nyghtwolf.gemworks.item.ItemMysticRegalGem();

    //Define Tier 1 Swords
    public static final com.nyghtwolf.gemworks.item.SwordRedstoneT1 SwordRedstoneT1 = new com.nyghtwolf.gemworks.item.SwordRedstoneT1();
    public static final com.nyghtwolf.gemworks.item.SwordLapisT1 SwordLapisT1 = new com.nyghtwolf.gemworks.item.SwordLapisT1();
    public static final com.nyghtwolf.gemworks.item.SwordGlowstoneT1 SwordGlowstoneT1 = new com.nyghtwolf.gemworks.item.SwordGlowstoneT1();
    public static final com.nyghtwolf.gemworks.item.SwordQuartzT1 SwordQuartzT1 = new com.nyghtwolf.gemworks.item.SwordQuartzT1();

    //Define Tier 2 Swords
    public static final com.nyghtwolf.gemworks.item.SwordRedstoneT2 SwordRedstoneT2 = new com.nyghtwolf.gemworks.item.SwordRedstoneT2();
    public static final com.nyghtwolf.gemworks.item.SwordLapisT2 SwordLapisT2 = new com.nyghtwolf.gemworks.item.SwordLapisT2();
    public static final com.nyghtwolf.gemworks.item.SwordGlowstoneT2 SwordGlowstoneT2 = new com.nyghtwolf.gemworks.item.SwordGlowstoneT2();
    public static final com.nyghtwolf.gemworks.item.SwordQuartzT2 SwordQuartzT2 = new com.nyghtwolf.gemworks.item.SwordQuartzT2();

    //Define Tier 3 Swords
    public static final com.nyghtwolf.gemworks.item.SwordRedstoneT3 SwordRedstoneT3 = new com.nyghtwolf.gemworks.item.SwordRedstoneT3();
    public static final com.nyghtwolf.gemworks.item.SwordLapisT3 SwordLapisT3 = new com.nyghtwolf.gemworks.item.SwordLapisT3();
    public static final com.nyghtwolf.gemworks.item.SwordGlowstoneT3 SwordGlowstoneT3 = new com.nyghtwolf.gemworks.item.SwordGlowstoneT3();
    public static final com.nyghtwolf.gemworks.item.SwordQuartzT3 SwordQuartzT3 = new com.nyghtwolf.gemworks.item.SwordQuartzT3();

    //Define Mystic Swords of all three tiers
    public static final com.nyghtwolf.gemworks.item.SwordMysticEssenceT1 SwordMysticEssenceT1 = new com.nyghtwolf.gemworks.item.SwordMysticEssenceT1();
    public static final com.nyghtwolf.gemworks.item.SwordMysticCoreT2 SwordMysticCoreT2 = new com.nyghtwolf.gemworks.item.SwordMysticCoreT2();
    public static final com.nyghtwolf.gemworks.item.SwordMysticRegalT3 SwordMysticRegalT3 = new com.nyghtwolf.gemworks.item.SwordMysticRegalT3();

    public static void init()
    {
        //Register Crafting Gems/Materials
        GameRegistry.registerItem(EnergizedMysticGem, "EnergizedMysticGem");
        GameRegistry.registerItem(ProsperousMysticGem, "ProsperousMysticGem");
        GameRegistry.registerItem(ShimmeringMysticGem, "ShimmeringMysticGem");
        GameRegistry.registerItem(TimelessMysticGem, "TimelessMysticGem");
        GameRegistry.registerItem(MysticEssenceGem, "MysticEssenceGem");
        GameRegistry.registerItem(MysticCoreGem, "MysticCoreGem");
        GameRegistry.registerItem(MysticRegalGem, "MysticRegalGem");

        //Register Tier 1 Swords
        GameRegistry.registerItem(SwordRedstoneT1, "RedstoneSwordTier1");
        GameRegistry.registerItem(SwordLapisT1, "LapisSwordTier1");
        GameRegistry.registerItem(SwordGlowstoneT1, "GlowstoneSwordTier1");
        GameRegistry.registerItem(SwordQuartzT1, "QuartzSwordTier1");

        //register Tier 2 Swords
        GameRegistry.registerItem(SwordRedstoneT2, "RedstoneSwordTier2");
        GameRegistry.registerItem(SwordLapisT2, "LapisSwordTier2");
        GameRegistry.registerItem(SwordGlowstoneT2, "GlowstoneSwordTier2");
        GameRegistry.registerItem(SwordQuartzT2, "QuartzSwordTier2");

        //register Tier 3 Swords
        GameRegistry.registerItem(SwordRedstoneT3, "RedstoneSwordTier3");
        GameRegistry.registerItem(SwordLapisT3, "SwordLapisT3");
        GameRegistry.registerItem(SwordGlowstoneT3, "SwordGlowstoneT3");
        GameRegistry.registerItem(SwordQuartzT3, "SwordQuartzT3");

        //Register Mystic Swords of all three tiers
        GameRegistry.registerItem(SwordMysticEssenceT1, "SwordMysticEssenceT1");
        GameRegistry.registerItem(SwordMysticCoreT2, "SwordMysticCoreT2");
        GameRegistry.registerItem(SwordMysticRegalT3, "SwordMysticRegalT3");

    }
}