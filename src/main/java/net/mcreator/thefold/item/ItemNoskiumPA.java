
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
public class ItemNoskiumPA extends ElementsTheFold.ModElement {
	@GameRegistry.ObjectHolder("thefold:noskiumpa")
	public static final Item block = null;
	public ItemNoskiumPA(ElementsTheFold instance) {
		super(instance, 26);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemPickaxe(EnumHelper.addToolMaterial("NOSKIUMPA", 4, 2156, 10f, 1f, 5)) {
			{
				this.attackSpeed = -2.9f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("pickaxe", 4);
				return ret.keySet();
			}
		}.setUnlocalizedName("noskiumpa").setRegistryName("noskiumpa").setCreativeTab(TabTheFold.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("thefold:noskiumpa", "inventory"));
	}
}
