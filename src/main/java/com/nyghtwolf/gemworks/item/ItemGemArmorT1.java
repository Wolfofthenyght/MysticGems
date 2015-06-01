package com.nyghtwolf.gemworks.item;

import com.nyghtwolf.gemworks.creativetab.CreativeTabGemworks;
import com.nyghtwolf.gemworks.reference.Reference;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.relauncher.SideOnly;
import javafx.geometry.Side;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemGemArmorT1 extends ItemArmor{

    public ItemGemArmorT1(ArmorMaterial material, int renderindex, int type){
        super(material, renderindex, type);

        this.setMaxStackSize(1);
        this.setCreativeTab(CreativeTabGemworks.Gemworks_Tab);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase()+ ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }


    @SideOnly(cpw.mods.fml.relauncher.Side.CLIENT)
    public void registerIcon(IIconRegister iconRegister){
        this.itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    @Override

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer){

        String name = this.getUnwrappedUnlocalizedName(super.getUnlocalizedName());
        name = name.substring(0, name.indexOf("_"));

        return String.format("%s:textures/models/armor/%s_layer_%d.png", Reference.MOD_ID, name, slot == 2 ? 2 : 1);
    }
}