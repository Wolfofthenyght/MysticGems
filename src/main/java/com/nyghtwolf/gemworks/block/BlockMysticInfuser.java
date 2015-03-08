package com.nyghtwolf.gemworks.block;

import com.nyghtwolf.gemworks.creativetab.CreativeTabGemworks;
import com.nyghtwolf.gemworks.gemworks;

import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockMysticInfuser extends BlockContainer {

    public BlockMysticInfuser(){
        super(Material.rock);
        this.setStepSound(soundTypeStone);
        this.setBlockName("MysticInfuser");
        this.setBlockTextureName("MysticInfuser");
        this.setHardness(2.0F);
        this.setResistance(8.0F);
        this.setCreativeTab(CreativeTabGemworks.Gemworks_Tab);
        //.setRenderBounds(minX, minY, minZ, maxX, maxY, maxZ)
        //maxY = Moves select area down from the top with the smaller the number
        this.setBlockBounds(0.10F, 0F, 0.05F, 0.90F, 0.60F, 0.95F);
    }

    @SideOnly(cpw.mods.fml.relauncher.Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister){
        this.blockIcon = iconRegister.registerIcon(gemworks.modid + ":" + this.getUnlocalizedName().substring(5));
    }

    public int getRenderType(){
        return -1;
    }

    public boolean isOpaqueCube(){
        return false;
    }

    public boolean renderAsNormalBlock(){
        return false;
    }

    @Override
    public TileEntity createNewTileEntity(World var1, int var2){
        return new TileEntityMysticInfuser();
    }
    
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ){

        FMLNetworkHandler.openGui(player, gemworks.instance, gemworks.GuiMysticfuser, world, x, y, z);
        return true;
    }
}