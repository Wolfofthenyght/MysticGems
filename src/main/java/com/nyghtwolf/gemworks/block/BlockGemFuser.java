package com.nyghtwolf.gemworks.block;

import com.nyghtwolf.gemworks.creativetab.CreativeTabGemworks;
import com.nyghtwolf.gemworks.gemworks;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockGemFuser extends BlockContainer
{
    public BlockGemFuser()
    {
        super(Material.iron);

        this.setHardness(2.0F);
        this.setResistance(8.0F);
        this.setBlockName("GemFuser");
        this.setBlockTextureName("GemFuser");
        this.setCreativeTab(CreativeTabGemworks.Gemworks_Tab);
        this.setBlockBounds(0F, 0F, 0F, 1F, 0.95F, 1F);
    }

    @Override
    public TileEntity createNewTileEntity(World var1, int var2) {
        return new TileEntityGemFuser();
    }

    public int getRenderType(){
        return -1;
    }

    public boolean isOpaqueCube() {
        return false;
    }

    public boolean renderAsNormalBlock(){
        return false;
    }

    @SideOnly(cpw.mods.fml.relauncher.Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister){
        this.blockIcon = iconRegister.registerIcon(gemworks.modid + ":" + this.getUnlocalizedName().substring(5));
    }

    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ){

        if (world.isRemote){
            return false;
        }

        else{
            //FMLNetworkHandler.openGui(player, gemworks.instance, gemworks.GuiGemfuser, world, x, y, z);
            player.openGui(player, gemworks.GuiGemfuser, world, x, y, z);
            return true;
        }

    }

}