package com.maccam1234.banana.registry;

import com.maccam1234.banana.BananaMod;
import com.maccam1234.banana.entity.ModEntities;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

//This is the items class, where all mod items are located and edited
public class ModItems {

    //banana item has settings food(can be eaten), rarity(pink item name), group(shows up in the food group tab in creative)
    public static final Item BANANA = new Item(new Item.Settings().group(ItemGroup.FOOD).rarity(Rarity.EPIC).food(new FoodComponent.Builder().hunger(20).saturationModifier(20f).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 20*120, 255), 1f).build()));
    
    //sword item parameters (tool material, additional attack damage, attack speed, settings)
    public static final Item BANANA_SWORD = new SwordItem(ToolMaterials.NETHERITE, 195, 11f, new Item.Settings().group(ItemGroup.COMBAT).rarity(Rarity.EPIC));

    public static final Item GORILLA_SPAWN_EGG = new SpawnEggItem(ModEntities.GORILLA, 0xff9855, 0xdefffe, new Item.Settings().group(ItemGroup.MISC));

    //minecraft item id (modid:itemName)
    //the purpose of this method is to register all items at once
    public static void registerItems(){
        Registry.register(Registry.ITEM, new Identifier(BananaMod.MOD_ID, "banana"), BANANA);
        Registry.register(Registry.ITEM, new Identifier(BananaMod.MOD_ID, "banana_sword"), BANANA_SWORD);
        Registry.register(Registry.ITEM, new Identifier(BananaMod.MOD_ID, "gorilla_spawn_egg"), GORILLA_SPAWN_EGG);
    }
}
