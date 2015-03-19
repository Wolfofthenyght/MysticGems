package com.nyghtwolf.gemworks.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

//Define Specific Items
public class ItemProsperousMysticGem extends ItemGemworks
{
    public ItemProsperousMysticGem()
    {
        super();
        this.setUnlocalizedName("ProsperousMysticGem");
        this.maxStackSize = 64;
        this.setNoRepair();
    }
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par2List,boolean par4){
        par2List.add("§6§o" + "The core of this gem seems to");
        par2List.add("§6§o" + "contain something shiny. If you");
        par2List.add("§6§o" + "rotate the gem, you can see it." );
    }
}