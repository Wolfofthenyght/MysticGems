package com.nyghtwolf.gemworks.item;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class GemT1Material {
    //First int: harvestLevel, Second int: maxUses, Third float: efficiencyOnProperMaterial, Fourth float: damageVsEntity, Fifth int: enchantibility
    public static Item.ToolMaterial GemT1Material = EnumHelper.addToolMaterial("GemT1Material", 0, 1000, 1.0F, 5.0F, 20);
}