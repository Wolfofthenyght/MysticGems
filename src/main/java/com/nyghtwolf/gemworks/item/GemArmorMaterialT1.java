package com.nyghtwolf.gemworks.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class GemArmorMaterialT1 {
    //First number indicates armor piece to calculate
    //durability * a for the helmet
    //durability * b the chestplate
    //durability * c the leggings
    //durability * d for the boots
    //
    //Common durability values
    //
    //5 for leather armor
    //15 for chain and iron armor
    //7 for gold armor
    //33 for diamond armor

    //public static ItemArmor.ArmorMaterial GemArmorMaterialT1 = EnumHelper.addArmorMaterial("MysticCoreArmorT1",33,new int[] {a,b,c,d}, 30);
    static ItemArmor.ArmorMaterial GemArmorMaterialT1 = EnumHelper.addArmorMaterial("GemArmorMaterialT1", 20, new int[]{3,8,6,3}, 18);
    static ItemArmor.ArmorMaterial GemArmorMaterialT2 = EnumHelper.addArmorMaterial("GemMaterialT1", 28, new int[]{3,7,5,2}, 25);
    static ItemArmor.ArmorMaterial GemArmorMaterialT3 = EnumHelper.addArmorMaterial("GemMaterialT1", 33, new int[]{3,7,5,2}, 30);
}
