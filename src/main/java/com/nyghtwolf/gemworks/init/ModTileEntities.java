package com.nyghtwolf.gemworks.init;

import com.nyghtwolf.gemworks.block.TileEntityGemFuser;
import com.nyghtwolf.gemworks.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)

//Initialize Tile Entities
public class ModTileEntities
{
    public static void init()
    {

    GameRegistry.registerTileEntity(TileEntityGemFuser.class, ModBlocks.GemFuser.getUnlocalizedName());

    }
}