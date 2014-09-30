package com.nyghtwolf.gemworks.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

//Define Specific Items
public class SwordMysticCoreT2 extends ItemSwordBaseTier2
{
    public SwordMysticCoreT2()
    {
        super(GemT2Material.GemT2Material);
        this.setUnlocalizedName("SwordMysticCoreT2");
    }
    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entity){
        float var4 = 1.0F;
        int i = (int)(entity.prevPosX + (entity.posX - entity.prevPosX) * (double)var4);
        int j = (int)(entity.prevPosY + (entity.posY - entity.prevPosY) * (double)var4 + 1.62D - (double)entity.yOffset);
        int k = (int)(entity.prevPosZ + (entity.posZ - entity.prevPosZ) * (double)var4);

        if(true){
            entity.addPotionEffect(new PotionEffect(22,400, 2));
            entity.addPotionEffect(new PotionEffect(11,400, 2));
            entity.addPotionEffect(new PotionEffect(1,400, 2));
            entity.addPotionEffect(new PotionEffect(5,400, 2));
        }

        if(true){
            itemstack.damageItem(4, entity);
        }

        return itemstack;
    }
}