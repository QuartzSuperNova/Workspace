package net.mcreator.thefold.procedure;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.thefold.ElementsTheFold;

@ElementsTheFold.ModElement.Tag
public class ProcedureEntityEntersTar extends ElementsTheFold.ModElement {
	public ProcedureEntityEntersTar(ElementsTheFold instance) {
		super(instance, 22);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure EntityEntersTar!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 1);
	}
}
