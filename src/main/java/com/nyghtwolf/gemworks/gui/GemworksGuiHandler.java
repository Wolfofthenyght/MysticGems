package com.nyghtwolf.gemworks.gui;

import com.nyghtwolf.gemworks.block.TileEntityGemFuser;
import com.nyghtwolf.gemworks.block.TileEntityMysticInfuser;
import com.nyghtwolf.gemworks.inventory.ContainerGemFuser;
import com.nyghtwolf.gemworks.inventory.ContainerMysticInfuser;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GemworksGuiHandler implements IGuiHandler
{
    @Override
    public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
    {
        TileEntity tileEntity = world.getTileEntity(x, y, z);
        Block block = world.getBlock(x, y, z);

        if(tileEntity instanceof TileEntityGemFuser)
        {
            return new ContainerGemFuser(player.inventory, (TileEntityGemFuser) tileEntity);
        }

        else if (tileEntity instanceof TileEntityMysticInfuser)
        {
            return new ContainerMysticInfuser(player.inventory, (TileEntityMysticInfuser) tileEntity);
        }

        return null;
    }

    @Override
    public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
    {
        TileEntity tileEntity = world.getTileEntity(x, y, z);
        Block block = world.getBlock(x, y, z);

        if(tileEntity instanceof TileEntityGemFuser)
        {
            return new GuiGemFuser(player.inventory, (TileEntityGemFuser) tileEntity);
        }

        else if (tileEntity instanceof TileEntityMysticInfuser)
        {
            return new GuiMysticInfuser(player.inventory, (TileEntityMysticInfuser) tileEntity);
        }

        return null;

    }
}