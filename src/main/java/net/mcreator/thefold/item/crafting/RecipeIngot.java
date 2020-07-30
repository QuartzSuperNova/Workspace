
package net.mcreator.thefold.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.thefold.item.ItemDastaltIngot;
import net.mcreator.thefold.block.BlockDreocium;
import net.mcreator.thefold.ElementsTheFold;

@ElementsTheFold.ModElement.Tag
public class RecipeIngot extends ElementsTheFold.ModElement {
	public RecipeIngot(ElementsTheFold instance) {
		super(instance, 17);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockDreocium.block, (int) (1)), new ItemStack(ItemDastaltIngot.block, (int) (1)), 1F);
	}
}
