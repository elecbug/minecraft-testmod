package com.elecbug.testmod.item;

import javax.annotation.Nullable;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;

public class FuelItem extends Item {
            
    private final int burnTicks;
    
    public FuelItem(Properties properties, int burnTimeInTicks) {
        super(properties);
        this.burnTicks = burnTimeInTicks;
    }

    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return this.burnTicks;
    }
}