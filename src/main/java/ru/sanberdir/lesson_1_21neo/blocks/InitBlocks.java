package ru.sanberdir.lesson_1_21neo.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class InitBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks("lesson_1_21neo");


    public static final DeferredBlock<Block> EXAMPLE_BLOCK = BLOCKS.registerBlock(
            "example_block",
            Block::new, // The factory that the properties will be passed into.
            BlockBehaviour.Properties.of().destroyTime(0.3f).explosionResistance(10.0f).sound(SoundType.AMETHYST));
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
