package com.maccam1234.banana;

import com.maccam1234.banana.registry.ModItems;

import net.fabricmc.api.ModInitializer;

public class BananaMod implements ModInitializer{
    
    //convenient if mod id were to be edited
    public static final String MOD_ID = "banana";
    
    @Override
    //runs at game launch
    public void onInitialize(){
        //registers the items
        ModItems.registerItems();
    }
}
