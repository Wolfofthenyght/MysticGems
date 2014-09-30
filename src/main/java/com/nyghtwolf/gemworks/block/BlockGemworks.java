package com.nyghtwolf.gemworks.block;

import com.nyghtwolf.gemworks.creativetab.CreativeTabGemworks;
import com.nyghtwolf.gemworks.reference.Reference;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

//Define Generic Block
public class BlockGemworks extends Block
{

    public BlockGemworks(Material material)

    {
        super(material);
        this.setCreativeTab(CreativeTabGemworks.Gemworks_Tab);
    }

    public BlockGemworks()
    {

        this(Material.iron);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase()+ ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
        //tile.modid:blockname.name
    }

    @Override
    @SideOnly(cpw.mods.fml.relauncher.Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

}

