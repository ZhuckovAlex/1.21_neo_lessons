package ru.sanberdir.lesson_1_21neo.blocks.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

// Класс FlameBlock расширяет базовый класс Block и представляет собой блок, который может гореть.
public class FlameBlock extends Block {

    // Конструктор класса, принимающий свойства блока.
    public FlameBlock(Properties pProperties) {
        // Вызов конструктора суперкласса с передачей свойств блока.
        super(pProperties);
    }

    // Метод определяет, является ли блок воспламеняемым.
    @Override
    public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        // Этот блок всегда будет воспламеняемым.
        return true;
    }

    // Метод возвращает уровень воспламеняемости блока.
    @Override
    public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        // Устанавливаем значение воспламеняемости в 60. Это влияет на то, насколько легко блок может загореться.
        return 60;
    }

    // Метод возвращает скорость распространения огня от блока.
    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        // Устанавливаем скорость распространения огня в 30. Это влияет на то, насколько быстро огонь будет распространяться от блока.
        return 30;
    }
}
