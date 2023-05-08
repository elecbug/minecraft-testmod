package com.elecbug.testmod.init;

import com.elecbug.testmod.TestMod;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    
    public static class ModCreativeTab extends CreativeModeTab {
        private ModCreativeTab(int index, String label) {
            super(index, label);
        }

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(SMILE.get());
        }

        public static final ModCreativeTab instance 
            = new ModCreativeTab(CreativeModeTab.TABS.length, "testmod");
    }
    
    public static final DeferredRegister<Item> ITEMS 
        = DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MOD_ID);

    public static final RegistryObject<Item> SMILE
        = ITEMS.register("smile", () -> new Item(new Item.Properties().tab(ModCreativeTab.instance)));

    public static final RegistryObject<Item> FRUIT 
        = ITEMS.register("fruit", () -> new Item(new Item.Properties().tab(ModCreativeTab.instance)
            .food(new FoodProperties.Builder().nutrition(4).saturationMod(2).build())));

    public static final RegistryObject<Item> FUEL 
        = ITEMS.register("fuel", () -> new FuelItem(new Item.Properties().tab(ModCreativeTab.instance), 3200));

    public static final RegistryObject<Item> TELEPORT_STAFF 
        = ITEMS.register("teleport_staff", () -> new TeleportStaff(new Item.Properties().tab(ModCreativeTab.instance)));
}