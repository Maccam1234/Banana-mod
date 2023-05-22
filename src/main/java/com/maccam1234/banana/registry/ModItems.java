package com.maccam1234.banana.registry;

import com.maccam1234.banana.BananaMod;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

//This is the items class, where all mod items are located and edited
public class ModItems {

    //banana item has settings food(can be eaten), rarity(pink item name), group(shows up in the food group tab in creative)
    public static final Item BANANA = new Item(new Item.Settings().group(ItemGroup.FOOD).rarity(Rarity.RARE).food(new FoodComponent.Builder().hunger(5).saturationModifier(6f).build()));

    //minecraft item id (modid:itemName)
    //the purpose of this method is to register all items at once
    public static void registerItems(){
        Registry.register(Registry.ITEM, new Identifier(BananaMod.MOD_ID, "banana"), BANANA);
    }
}
