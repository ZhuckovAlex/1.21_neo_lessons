package ru.sanberdir.lesson_1_21neo.items;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import ru.sanberdir.lesson_1_21neo.Lesson1_21Neo;
import ru.sanberdir.lesson_1_21neo.blocks.InitBlocks;
import ru.sanberdir.lesson_1_21neo.items.custom.FireItem;

import java.util.function.Supplier;

public class InitItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Lesson1_21Neo.MODID);

    public static final Supplier<Item> BALL = ITEMS.registerItem(
            "ball", FireItem::new,
            new Item.Properties().food(new FoodProperties.Builder()
                    //Насыщение
                    .nutrition(8)
                    //Сытость - процент от насыщения
                    .saturationModifier(0.8f)
                    //Эффект: тип, длительность в тиках, уровень - пишем на 1 меньше, шанс эффекта
                    .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 3600, 0), 0.8F)
                    .effect(new MobEffectInstance(MobEffects.CONFUSION, 60, 0), 0.05F)
                    .build())
    );
    public static final Supplier<BlockItem> EXAMPLE_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("example_block", InitBlocks.EXAMPLE_BLOCK, new Item.Properties());


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
