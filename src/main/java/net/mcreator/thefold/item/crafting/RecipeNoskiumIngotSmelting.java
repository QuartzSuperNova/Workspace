
package net.mcreator.thefold.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.thefold.item.ItemNoskiumGem;
import net.mcreator.thefold.block.BlockNoskiumOre;
import net.mcreator.thefold.ElementsTheFold;

@ElementsTheFold.ModElement.Tag
public class RecipeNoskiumIngotSmelting extends ElementsTheFold.ModElement {
	public RecipeNoskiumIngotSmelting(ElementsTheFold instance) {
		super(instance, 19);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockNoskiumOre.block, (int) (1)), new ItemStack(ItemNoskiumGem.block, (int) (1)), 1F);
	}
}
