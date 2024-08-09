package ru.sanberdir.lesson_1_21neo.tab;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import ru.sanberdir.lesson_1_21neo.blocks.InitBlocks;
import ru.sanberdir.lesson_1_21neo.items.InitItems;

import java.util.function.Supplier;

import static ru.sanberdir.lesson_1_21neo.Lesson1_21Neo.MODID;


public class CreativeTabNeo extends CreativeModeTab {

    protected CreativeTabNeo(Builder builder) {
        super(builder);
    }
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);


    //CREATIVE_MODE_TABS is a DeferredRegister<CreativeModeTab>
    public static final Supplier<CreativeModeTab> LESSON21 = CREATIVE_MODE_TABS.register("lesson21", () -> CreativeModeTab.builder()
            //Set the title of the tab. Don't forget to add a translation!
            .title(Component.translatable("itemGroup." + MODID + ".lesson21"))
            //Добавить иконку в ТАБ
            .icon(() -> new ItemStack(InitItems.BALL.get()))
            //Добавить предметы в ТАБ
            .displayItems((params, output) -> {
                // Тут отображаются предметы
                output.accept(InitItems.BALL.get());
                // Тут отображаются блоки
                output.accept(InitItems.EXAMPLE_BLOCK_ITEM.get());
            })

            .build()
    );




    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}