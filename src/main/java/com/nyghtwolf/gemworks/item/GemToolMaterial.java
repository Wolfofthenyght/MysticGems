package com.nyghtwolf.gemworks.item;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class GemToolMaterial {
    //First int: harvestLevel, Second int: maxUses, Third float: efficiencyOnProperMaterial, Fourth float: damageVsEntity, Fifth int: enchantibility
    public static Item.ToolMaterial GemT1Material = EnumHelper.addToolMaterial("GemToolMaterial", 0, 1100, 1.6F, 6.0F, 20);

}