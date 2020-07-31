
package net.mcreator.thefold.world.biome;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.biome.Biome;

import net.mcreator.thefold.block.BlockFoldGrass;
import net.mcreator.thefold.block.BlockFoldDurt;
import net.mcreator.thefold.ElementsTheFold;

import java.util.Random;

@ElementsTheFold.ModElement.Tag
public class BiomeFoldlands extends ElementsTheFold.ModElement {
	@GameRegistry.ObjectHolder("thefold:foldlands")
	public static final BiomeGenCustom biome = null;
	public BiomeFoldlands(ElementsTheFold instance) {
		super(instance, 19);
	}

	@Override
	public void initElements() {
		elements.biomes.add(() -> new BiomeGenCustom());
	}

	@Override
	public void init(FMLInitializationEvent event) {
	}
	static class BiomeGenCustom extends Biome {
		public BiomeGenCustom() {
			super(new Biome.BiomeProperties("Foldlands").setRainfall(0.5F).setBaseHeight(0.1F).setHeightVariation(0.1F).setTemperature(0.5F));
			setRegistryName("foldlands");
			topBlock = BlockFoldGrass.block.getDefaultState();
			fillerBlock = BlockFoldDurt.block.getDefaultState();
			decorator.generateFalls = true;
			decorator.treesPerChunk = 0;
			decorator.flowersPerChunk = 0;
			decorator.grassPerChunk = 0;
			decorator.deadBushPerChunk = 0;
			decorator.mushroomsPerChunk = 0;
			decorator.bigMushroomsPerChunk = 0;
			decorator.reedsPerChunk = 0;
			decorator.cactiPerChunk = 0;
			decorator.sandPatchesPerChunk = 0;
			decorator.gravelPatchesPerChunk = 0;
			this.spawnableMonsterList.clear();
			this.spawnableCreatureList.clear();
			this.spawnableWaterCreatureList.clear();
			this.spawnableCaveCreatureList.clear();
		}

		@Override
		public WorldGenAbstractTree getRandomTreeFeature(Random rand) {
			return super.getRandomTreeFeature(rand);
		}
	}
}
