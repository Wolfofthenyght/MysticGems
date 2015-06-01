package com.nyghtwolf.gemworks.init;

import com.nyghtwolf.gemworks.block.BlockGemFuser;
import com.nyghtwolf.gemworks.block.BlockGemworks;
import com.nyghtwolf.gemworks.block.BlockMysticInfuser;
import com.nyghtwolf.gemworks.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)

public class ModBlocks
{
    public static final BlockMysticInfuser MysticInfuser = new BlockMysticInfuser();
    public static final BlockGemFuser GemFuser = new BlockGemFuser();

    public static void init(){

        //GameRegistry.registerBlock(GemFuser, "GemFuser");
        GameRegistry.registerBlock(MysticInfuser, "MysticInfuser");
    }
}