package com.nyghtwolf.gemworks.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

//Add a § and follow it up by:
//1 - blue
//2 - green
//3 - teal
//4 - maroon
//5 - purple
//6 - orange
//7 - light-grey
//8 - dark-grey
//9 - lighter-blue
//0 - black
//a - lime
//b - aqua
//c - red
//d - pink
//e - yellow
//f - white
//§k - Obfuscated
//§l - Bold
//§m - Strikethrough
//§n - Underline
//§o - Italic

//Define Specific Items
public class ItemMysticCoreGem extends ItemGemworks
{
    public ItemMysticCoreGem()
    {
        super();
        this.setUnlocalizedName("MysticCoreGem");
        this.maxStackSize = 64;
        this.setNoRepair();
    }
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par2List,boolean par4){
        par2List.add("§6§o" + "The core of this gem seems to");
        par2List.add("§6§o" + "constantly change color, shifting");
        par2List.add("§6§o" + "between red, blue, green, and yellow." );
    }
}