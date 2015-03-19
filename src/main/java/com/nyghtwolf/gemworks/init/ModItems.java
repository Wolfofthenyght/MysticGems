package com.nyghtwolf.gemworks.init;

import com.nyghtwolf.gemworks.item.*;
import com.nyghtwolf.gemworks.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;

@GameRegistry.ObjectHolder(Reference.MOD_ID)

//Initialize Items
public class ModItems
{
    public static final ItemGemworks EnergizedMysticGem = new com.nyghtwolf.gemworks.item.ItemEnergizedMysticGem();
    public static final ItemGemworks ProsperousMysticGem = new com.nyghtwolf.gemworks.item.ItemProsperousMysticGem();
    public static final ItemGemworks ShimmeringMysticGem = new com.nyghtwolf.gemworks.item.ItemShimmeringMysticGem();
    public static final ItemGemworks TimelessMysticGem = new com.nyghtwolf.gemworks.item.ItemTimelessMysticGem();
    public static final ItemGemworks MysticCoreGem = new com.nyghtwolf.gemworks.item.ItemMysticCoreGem();

    //Define Swords
    public static final SwordRedstone SwordRedstone = new SwordRedstone();
    public static final SwordLapis SwordLapis = new SwordLapis();
    public static final SwordGlowstone SwordGlowstone = new SwordGlowstone();
    public static final SwordQuartz SwordQuartz = new SwordQuartz();

    //Define Mystic Sword
    public static final SwordMysticCore SwordMysticCore = new SwordMysticCore();

    //Define MysticCore Armor
    public static Item MysticCoreChestplateT1;
    public static Item MysticCoreLegsT1;
    public static Item MysticCoreBootsT1;

    //Define Mystic Arrows

    public static void init()
    {
        //Register Crafting Gems/Materials
        GameRegistry.registerItem(EnergizedMysticGem, "EnergizedMysticGem");
        GameRegistry.registerItem(ProsperousMysticGem, "ProsperousMysticGem");
        GameRegistry.registerItem(ShimmeringMysticGem, "ShimmeringMysticGem");
        GameRegistry.registerItem(TimelessMysticGem, "TimelessMysticGem");
        GameRegistry.registerItem(MysticCoreGem, "MysticCoreGem");

        //Register Tier 1 Swords
        GameRegistry.registerItem(SwordRedstone, "RedstoneSwordTier1");
        GameRegistry.registerItem(SwordLapis, "LapisSwordTier1");
        GameRegistry.registerItem(SwordGlowstone, "GlowstoneSwordTier1");
        GameRegistry.registerItem(SwordQuartz, "QuartzSwordTier1");

        //Register MysticCoreArmor


        //Register Mystic Swords of all three tiers
        GameRegistry.registerItem(SwordMysticCore, "SwordMysticCore");

        //Register Mystic Arrows
        //GameRegistry.registerItem(ItemEnergizedArrow, "MysticArrow");
    }
}