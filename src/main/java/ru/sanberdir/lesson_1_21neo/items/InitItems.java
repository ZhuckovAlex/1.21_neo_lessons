package ru.sanberdir.lesson_1_21neo.items;

import net.minecraft.world.item.Item;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import ru.sanberdir.lesson_1_21neo.Lesson1_21Neo;

import java.util.function.Supplier;

public class InitItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Lesson1_21Neo.MODID);

    public static final Supplier<Item> BALL = ITEMS.registerItem(
            "ball", Item::new,
            new Item.Properties()
    );

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
