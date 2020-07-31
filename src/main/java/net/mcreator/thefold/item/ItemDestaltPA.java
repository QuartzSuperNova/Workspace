
package net.mcreator.thefold.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.thefold.creativetab.TabTheFold;
import net.mcreator.thefold.ElementsTheFold;

import java.util.Set;
import java.util.HashMap;

@ElementsTheFold.ModElement.Tag
public class ItemDestaltPA extends ElementsTheFold.ModElement {
	@GameRegistry.ObjectHolder("thefold:destaltpa")
	public static final Item block = null;
	public ItemDestaltPA(ElementsTheFold instance) {
		super(instance, 27);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemPickaxe(EnumHelper.addToolMaterial("DESTALTPA", 6, 3120, 15f, 2f, 6)) {
			{
				this.attackSpeed = -2.5f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("pickaxe", 6);
				return ret.keySet();
			}
		}.setUnlocalizedName("destaltpa").setRegistryName("destaltpa").setCreativeTab(TabTheFold.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("thefold:destaltpa", "inventory"));
	}
}
