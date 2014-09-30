package com.nyghtwolf.gemworks.item;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class GemT3Material {
    //First int: harvestLevel, Second int: maxUses, Third float: efficiencyOnProperMaterial, Fourth float: damageVsEntity, Fifth int: enchantibility
    public static Item.ToolMaterial GemT3Material = EnumHelper.addToolMaterial("GemT3Material", 0, 2000, 1.0F, 7.0F, 30);
}
