
package net.mcreator.thefold.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.world.IBlockAccess;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.Minecraft;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import net.mcreator.thefold.creativetab.TabTheFold;
import net.mcreator.thefold.ElementsTheFold;

import java.util.Random;

@ElementsTheFold.ModElement.Tag
public class BlockDastaltBlock extends ElementsTheFold.ModElement {
	@GameRegistry.ObjectHolder("thefold:dastaltblock")
	public static final Block block = null;
	public BlockDastaltBlock(ElementsTheFold instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("dastaltblock"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("thefold:dastaltblock", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.ROCK);
			setUnlocalizedName("dastaltblock");
			setSoundType(SoundType.METAL);
			setHarvestLevel("pickaxe", 1);
			setHardness(50F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabTheFold.tab);
		}

		@Override
		public boolean isBeaconBase(IBlockAccess worldObj, BlockPos pos, BlockPos beacon) {
			return true;
		}

		@Override
		public boolean canSilkHarvest(World world, BlockPos pos, IBlockState state, EntityPlayer player) {
			return false;
		}

		@SideOnly(Side.CLIENT)
		@Override
		public void randomDisplayTick(IBlockState state, World world, BlockPos pos, Random random) {
			super.randomDisplayTick(state, world, pos, random);
			EntityPlayer entity = Minecraft.getMinecraft().player;
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			int i = x;
			int j = y;
			int k = z;
			if (true)
				for (int l = 0; l < 1; ++l) {
					double d0 = (i + random.nextFloat());
					double d1 = (j + random.nextFloat());
					double d2 = (k + random.nextFloat());
					int i1 = random.nextInt(2) * 2 - 1;
					double d3 = (random.nextFloat() - 0.5D) * 0.5D;
					double d4 = (random.nextFloat() - 0.5D) * 0.5D;
					double d5 = (random.nextFloat() - 0.5D) * 0.5D;
					world.spawnParticle(EnumParticleTypes.PORTAL, d0, d1, d2, d3, d4, d5);
				}
		}
	}
}
