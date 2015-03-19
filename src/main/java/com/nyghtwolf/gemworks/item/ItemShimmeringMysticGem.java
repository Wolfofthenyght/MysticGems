package com.nyghtwolf.gemworks.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

//Define Specific Items
public class ItemShimmeringMysticGem extends ItemGemworks
{
    public ItemShimmeringMysticGem()
    {
        super();
        this.setUnlocalizedName("ShimmeringMysticGem");
        this.maxStackSize = 64;
        this.setNoRepair();
    }
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par2List,boolean par4){
        par2List.add("§6§o" + "The core of this gem seems to");
        par2List.add("§6§o" + "radiate pure light no matter");
        par2List.add("§6§o" + "how dark it gets." );
    }
}