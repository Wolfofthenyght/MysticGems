package com.nyghtwolf.gemworks.init;

import com.nyghtwolf.gemworks.block.BlockGemFuser;
import com.nyghtwolf.gemworks.block.BlockGemworks;
import com.nyghtwolf.gemworks.block.BlockMysticInfuser;
import com.nyghtwolf.gemworks.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

@GameRegistry.ObjectHolder(Reference.MOD_ID)

public class ModBlocks
{
    public static final Block GemFuser = new BlockGemFuser();
    public static final BlockGemworks MysticInfuser = new BlockMysticInfuser();


    public static void init(){

        GameRegistry.registerBlock(GemFuser, "ModelGemFuser");
        GameRegistry.registerBlock(MysticInfuser, "MysticInfuser");

    }
}
