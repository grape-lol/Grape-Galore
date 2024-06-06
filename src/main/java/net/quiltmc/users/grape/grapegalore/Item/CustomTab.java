package net.quiltmc.users.grape.grapegalore.Item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.quiltmc.users.grape.grapegalore.GrapeGalore;
import org.quiltmc.qsl.item.group.api.QuiltItemGroup;

public class CustomTab {
	public static final ItemGroup GRAPE_GROUP = QuiltItemGroup.createWithIcon(
		new Identifier(GrapeGalore.MOD_ID, "grape"), () -> new ItemStack(Items.GRAPE));

	public static void registerTab(){
		GrapeGalore.LOGGER.info("Hi" +GrapeGalore.MOD_ID);
	}
}
