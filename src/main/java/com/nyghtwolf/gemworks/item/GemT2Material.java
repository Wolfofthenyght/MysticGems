package com.nyghtwolf.gemworks.item;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class GemT2Material {
    //First int: harvestLevel, Second int: maxUses, Third float: efficiencyOnProperMaterial, Fourth float: damageVsEntity, Fifth int: enchantibility
    public static Item.ToolMaterial GemT2Material = EnumHelper.addToolMaterial("GemT2Material", 0, 1600, 1.0F, 6.0F, 25);
}
