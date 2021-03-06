package com.nyghtwolf.gemworks.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ModRecipes {
    public static void init(){
    //Tier 1 Redstone Sword Recipe
    GameRegistry.addShapedRecipe(new ItemStack(ModItems.SwordRedstone), " G "," G "," I ",'G', ModItems.EnergizedMysticGem, 'I', Items.gold_ingot);
    GameRegistry.addShapedRecipe(new ItemStack(ModItems.SwordRedstone), "  G","  G","  I",'G', ModItems.EnergizedMysticGem, 'I', Items.gold_ingot);
    GameRegistry.addShapedRecipe(new ItemStack(ModItems.SwordRedstone), "G  ","G  ","I  ",'G', ModItems.EnergizedMysticGem, 'I', Items.gold_ingot);

    //Tier 1 Glowstone Sword Recipe
    GameRegistry.addShapedRecipe(new ItemStack(ModItems.SwordGlowstone), " G "," G "," I ",'G', ModItems.ShimmeringMysticGem, 'I', Items.gold_ingot);
    GameRegistry.addShapedRecipe(new ItemStack(ModItems.SwordGlowstone), "  G","  G","  I",'G', ModItems.ShimmeringMysticGem, 'I', Items.gold_ingot);
    GameRegistry.addShapedRecipe(new ItemStack(ModItems.SwordGlowstone), "G  ","G  ","I  ",'G', ModItems.ShimmeringMysticGem, 'I', Items.gold_ingot);

    //Tier 1 Lapis Sword Recipe
    GameRegistry.addShapedRecipe(new ItemStack(ModItems.SwordLapis), " G "," G "," I ",'G', ModItems.ProsperousMysticGem, 'I', Items.gold_ingot);
    GameRegistry.addShapedRecipe(new ItemStack(ModItems.SwordLapis), "  G","  G","  I",'G', ModItems.ProsperousMysticGem, 'I', Items.gold_ingot);
    GameRegistry.addShapedRecipe(new ItemStack(ModItems.SwordLapis), "G  ","G  ","I  ",'G', ModItems.ProsperousMysticGem, 'I', Items.gold_ingot);

    //Tier 1 Quartz Sword Recipe
    GameRegistry.addShapedRecipe(new ItemStack(ModItems.SwordQuartz), " G "," G "," I ",'G', ModItems.TimelessMysticGem, 'I', Items.gold_ingot);
    GameRegistry.addShapedRecipe(new ItemStack(ModItems.SwordQuartz), "  G","  G","  I",'G', ModItems.TimelessMysticGem, 'I', Items.gold_ingot);
    GameRegistry.addShapedRecipe(new ItemStack(ModItems.SwordQuartz), "G  ","G  ","I  ",'G', ModItems.TimelessMysticGem, 'I', Items.gold_ingot);
}
}
