package com.nyghtwolf.gemworks.block;

import com.nyghtwolf.gemworks.creativetab.CreativeTabGemworks;
import com.nyghtwolf.gemworks.gemworks;
import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockGemFuser extends BlockContainer
{
    public BlockGemFuser()
    {
        super(Material.iron);

        this.setHardness(4.0F);
        this.setResistance(10);
        this.setBlockName("GemFuser");
        this.setBlockTextureName("GemFuser");
        this.setCreativeTab(CreativeTabGemworks.Gemworks_Tab);
    }

    @Override
    public TileEntity createNewTileEntity(World var1, int var2) {

        return new TileEntityGemFuser();
    }

    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ){

        if (world.isRemote||player.isSneaking()){
            return false;
        }

        else{
            FMLNetworkHandler.openGui(player, gemworks.instance, gemworks.GuiGemfuser, world, x,y,z);
            return true;
        }

    }
    //This will tell minecraft not to render any side of our cube.
 //   public boolean shouldSideBeRendered(IBlockAccess iblockaccess, int i, int j, int k, int l)

    //And this tell it that you can see through this block, and neighbor blocks should be rendered.
 //   public boolean isOpaqueCube()

}