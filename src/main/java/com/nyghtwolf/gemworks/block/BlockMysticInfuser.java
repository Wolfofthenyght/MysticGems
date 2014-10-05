package com.nyghtwolf.gemworks.block;

import com.nyghtwolf.gemworks.creativetab.CreativeTabGemworks;
import com.nyghtwolf.gemworks.gemworks;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockMysticInfuser extends BlockGemworks
{
    public BlockMysticInfuser()
    {
        super(Material.rock);
        this.setStepSound(soundTypeStone);
        this.setBlockName("MysticInfuser");
        this.setBlockTextureName("MysticInfuser");
        this.setHardness(2.0F);
        this.setResistance(8.0F);
        this.setCreativeTab(CreativeTabGemworks.Gemworks_Tab);
    }

    @SideOnly(cpw.mods.fml.relauncher.Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister){
        this.blockIcon = iconRegister.registerIcon(gemworks.modid + ":" + this.getUnlocalizedName().substring(5));
    }
}