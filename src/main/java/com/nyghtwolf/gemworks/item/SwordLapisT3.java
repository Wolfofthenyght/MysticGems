package com.nyghtwolf.gemworks.item;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

//Define Specific Items
public class SwordLapisT3 extends ItemSwordBaseTier3
{
    public SwordLapisT3()
    {
        super(GemT3Material.GemT3Material);
        this.setUnlocalizedName("SwordLapisT3");
    }
    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entity){
        float var4 = 1.0F;
        int i = (int)(entity.prevPosX + (entity.posX - entity.prevPosX) * (double)var4);
        int j = (int)(entity.prevPosY + (entity.posY - entity.prevPosY) * (double)var4 + 1.62D - (double)entity.yOffset);
        int k = (int)(entity.prevPosZ + (entity.posZ - entity.prevPosZ) * (double)var4);

        if(true){
            entity.addPotionEffect(new PotionEffect(11,500, 3));
        }

        if(true){
            itemstack.damageItem(2, entity);
        }

        return itemstack;
    }
    public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLiving, EntityLivingBase par3EntityLiving)
    {

        par1ItemStack.damageItem(1, par3EntityLiving);

        par2EntityLiving.addPotionEffect(new PotionEffect(19,500,3));

        return true;

    }
}