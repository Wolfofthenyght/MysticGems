package com.nyghtwolf.gemworks.item;

import com.nyghtwolf.gemworks.creativetab.CreativeTabGemworks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class PickaxeRedstone extends ItemPickaxe{
    public PickaxeRedstone(int id, Item.ToolMaterial mat){

        super(mat);
        this.setCreativeTab(CreativeTabGemworks.Gemworks_Tab);
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister register){
        this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1);
    }
}