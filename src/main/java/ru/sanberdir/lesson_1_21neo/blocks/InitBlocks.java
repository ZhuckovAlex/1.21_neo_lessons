package ru.sanberdir.lesson_1_21neo.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import ru.sanberdir.lesson_1_21neo.blocks.custom.FlameBlock;

public class InitBlocks {
    // Создает объект DeferredRegister для регистрации блоков, идентифицируемый строкой "lesson_1_21neo".
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks("lesson_1_21neo");

    // Регистрация блока с именем "custom_planks" с использованием конструктора FlameBlock и установки его свойств.
    public static final DeferredBlock<Block> CUSTOM_PLANKS = BLOCKS.registerBlock(
            "custom_planks",
            FlameBlock::new,
            BlockBehaviour.Properties.of().destroyTime(2.0f).explosionResistance(10.0f).sound(SoundType.WOOD));

    // Метод для регистрации блоков в событии инициализации.
    // Вызывается для добавления блоков в систему Minecraft Forge.
    public static void register(IEventBus eventBus){
        // Регистрация DeferredRegister в предоставленном IEventBus.
        BLOCKS.register(eventBus);
    }
}
