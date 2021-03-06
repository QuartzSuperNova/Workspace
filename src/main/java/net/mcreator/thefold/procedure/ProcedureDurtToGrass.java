package net.mcreator.thefold.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;

import net.mcreator.thefold.block.BlockFoldGrass;
import net.mcreator.thefold.block.BlockFoldDurt;
import net.mcreator.thefold.ElementsTheFold;

@ElementsTheFold.ModElement.Tag
public class ProcedureDurtToGrass extends ElementsTheFold.ModElement {
	public ProcedureDurtToGrass(ElementsTheFold instance) {
		super(instance, 21);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure DurtToGrass!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure DurtToGrass!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure DurtToGrass!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure DurtToGrass!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((world.isAirBlock(new BlockPos((int) x, (int) (y + 1), (int) z)))) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockFoldGrass.block.getDefaultState(), 3);
		} else {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockFoldDurt.block.getDefaultState(), 3);
		}
	}
}
