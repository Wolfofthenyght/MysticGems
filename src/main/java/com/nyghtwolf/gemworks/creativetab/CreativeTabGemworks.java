package com.nyghtwolf.gemworks.creativetab;

import com.nyghtwolf.gemworks.init.ModItems;
import com.nyghtwolf.gemworks.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabGemworks
{
    public static final CreativeTabs Gemworks_Tab = new CreativeTabs(Reference.MOD_ID)
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.MysticCoreGem;
        }

        @Override
    public String getTranslatedTabLabel()
        {
            return "Mystic Gems";
        }
    };
}
