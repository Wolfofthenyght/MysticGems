package com.nyghtwolf.gemworks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.nyghtwolf.gemworks.init.ModItems;

import net.minecraft.item.ItemStack;

public class GemFuserRecipes
{
    private static final GemFuserRecipes gemfuseBase = new GemFuserRecipes();
    private Map gemfuseList = new HashMap<ItemStack, Collection>();

    public static GemFuserRecipes fusing()
    {
        return gemfuseBase;
    }

    private GemFuserRecipes()
    {
        //Some random recipe, idk?
        this.addRecipe(new ItemStack(ModItems.EnergizedMysticGem), new ItemStack(ModItems.EnergizedMysticGem), new ItemStack(ModItems.MysticCoreGem));
    }

    /**
     * Adds a recipe to be used with the gem fuser.
     * @param a = Output
     * @param b = Top input
     * @param c = Bottom input
     */
    public void addRecipe(ItemStack a, ItemStack b, ItemStack c)
    {
        Collection<ItemStack> list = new ArrayList<ItemStack>();
        list.add(b);
        list.add(c);
        this.gemfuseList.put(a, list);
    }

    /**
     * Returns the output of any recipe that has those two input items.
     */
    public ItemStack getGemfuseResult(ItemStack par0ItemStack, ItemStack par1ItemStack)
    {

        Iterator iterator = this.gemfuseList.entrySet().iterator();
        Entry entry;
        ArrayList<ItemStack> list = new ArrayList<ItemStack>();
        do
        {
            if (!iterator.hasNext())
            {
                return null;
            }

            entry = (Entry)iterator.next();

            list.add(par0ItemStack);
            list.add(par1ItemStack);
        }
        while (!matches(list, (ArrayList) entry.getValue()));

        return (ItemStack)entry.getKey();
    }

    private boolean matches(ArrayList<ItemStack> listA, ArrayList<ItemStack> listB)//Does the two ingredient items fit with any recipe's two ingredients in the list?
    {
        if (listA.get(0) != null && listA.get(1) != null)
        {
            boolean b0 = listA.get(0).getItem() == listB.get(0).getItem() && listA.get(0).getItemDamage() == listB.get(0).getItemDamage();
            boolean b1 = listA.get(1).getItem() == listB.get(1).getItem() && listA.get(1).getItemDamage() == listB.get(1).getItemDamage();
            boolean b2 = listA.get(0).getItem() == listB.get(1).getItem() && listA.get(0).getItemDamage() == listB.get(1).getItemDamage();
            boolean b3 = listA.get(1).getItem() == listB.get(0).getItem() && listA.get(1).getItemDamage() == listB.get(0).getItemDamage();
            return (b0 && b1) || (b2 && b3);
        }
        return false;
    }

    public Map getSmeltingList()
    {
        return this.gemfuseList;
    }
}