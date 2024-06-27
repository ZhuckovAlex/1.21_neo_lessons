package ru.sanberdir.lesson_1_21neo.items.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import org.jetbrains.annotations.Nullable;

public class FireItem extends Item {
    public FireItem(Properties pProperties) {
        super(pProperties);
    }
    // 1 сек = 20 тик = > горит 1000 сек
    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return 20000;
    }
}
