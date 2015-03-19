package com.nyghtwolf.gemworks.item;

import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class GemArmorMaterialT1 {
    //First number indicates armor piece to calculate
    //durability * 11 for the helmet
    //durability * 16 for the chestplate
    //durability * 15 for the leggings
    //durability * 13 for the boots
    //
    //Common durability values
    //
    //5 for leather armor
    //15 for chain and iron armor
    //7 for gold armor
    //33 for diamond armor

    public static ItemArmor.ArmorMaterial GemArmorMaterialT1 = EnumHelper.addArmorMaterial("MysticCoreArmorT1",33,new int[] {3,8,6,3}, 30);
}
