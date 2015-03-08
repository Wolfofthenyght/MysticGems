package com.nyghtwolf.gemworks.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.nyghtwolf.gemworks.gemworks;
import com.nyghtwolf.gemworks.creativetab.CreativeTabGemworks;

import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockGemFuser extends BlockContainer
{
	Random rand = new Random();
	
	public BlockGemFuser()
	{
		super(Material.iron);

		this.setHardness(2.0F);
		this.setResistance(8.0F);
		setHarvestLevel("pickaxe", 2);
		this.setBlockName("GemFuser");
		this.setBlockTextureName("GemFuser");
		this.setCreativeTab(CreativeTabGemworks.Gemworks_Tab);
		//.setRenderBounds(minX, minY, minZ, maxX, maxY, maxZ)
		this.setBlockBounds(0.05F, 0F, 0.15F, 0.95F, 0.94F, 0.85F);
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


		FMLNetworkHandler.openGui(player, gemworks.instance, gemworks.GuiGemfuser, world, x, y, z);
		//player.openGui(gemworks.instance, gemworks.GuiGemfuser, world, x, y, z);
		return true;

	}

	public void breakBlock(World p_149749_1_, int p_149749_2_, int p_149749_3_, int p_149749_4_, Block p_149749_5_, int p_149749_6_)
	{
		TileEntityGemFuser tileentityGemFuser = (TileEntityGemFuser)p_149749_1_.getTileEntity(p_149749_2_, p_149749_3_, p_149749_4_);

		if (tileentityGemFuser != null)
		{
			for (int i1 = 0; i1 < tileentityGemFuser.getSizeInventory(); ++i1)
			{
				ItemStack itemstack = tileentityGemFuser.getStackInSlot(i1);

				if (itemstack != null)
				{
					float f = this.rand.nextFloat() * 0.8F + 0.1F;
					float f1 = this.rand.nextFloat() * 0.8F + 0.1F;
					float f2 = this.rand.nextFloat() * 0.8F + 0.1F;

					while (itemstack.stackSize > 0)
					{
						int j1 = this.rand.nextInt(21) + 10;

						if (j1 > itemstack.stackSize)
						{
							j1 = itemstack.stackSize;
						}

						itemstack.stackSize -= j1;
						EntityItem entityitem = new EntityItem(p_149749_1_, (double)((float)p_149749_2_ + f), (double)((float)p_149749_3_ + f1), (double)((float)p_149749_4_ + f2), new ItemStack(itemstack.getItem(), j1, itemstack.getItemDamage()));

						if (itemstack.hasTagCompound())
						{
							entityitem.getEntityItem().setTagCompound((NBTTagCompound)itemstack.getTagCompound().copy());
						}

						float f3 = 0.05F;
						entityitem.motionX = (double)((float)this.rand.nextGaussian() * f3);
						entityitem.motionY = (double)((float)this.rand.nextGaussian() * f3 + 0.2F);
						entityitem.motionZ = (double)((float)this.rand.nextGaussian() * f3);
						p_149749_1_.spawnEntityInWorld(entityitem);
					}
				}
			}

			p_149749_1_.func_147453_f(p_149749_2_, p_149749_3_, p_149749_4_, p_149749_5_);
		}

		super.breakBlock(p_149749_1_, p_149749_2_, p_149749_3_, p_149749_4_, p_149749_5_, p_149749_6_);
	}

}