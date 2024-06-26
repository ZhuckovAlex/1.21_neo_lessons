package ru.sanberdir.lesson_1_21neo.tab;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
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
            //Set the icon of the tab.
            .icon(() -> new ItemStack(InitItems.BALL.get()))
            //Add your items to the tab.
            .displayItems((params, output) -> {
                // Тут отображаются предметы
                output.accept(InitItems.BALL.get());
            })
            .build()
    );




    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}