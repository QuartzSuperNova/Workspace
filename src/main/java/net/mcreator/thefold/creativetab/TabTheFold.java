
package net.mcreator.thefold.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.thefold.block.BlockFoldGrass;
import net.mcreator.thefold.ElementsTheFold;

@ElementsTheFold.ModElement.Tag
public class TabTheFold extends ElementsTheFold.ModElement {
	public TabTheFold(ElementsTheFold instance) {
		super(instance, 16);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabthefold") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(BlockFoldGrass.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
