package net.quiltmc.users.grape.grapegalore.Item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.quiltmc.users.grape.grapegalore.GrapeGalore;

public class CustomTab {
	public static final ItemGroup GRAPE_GROUP = Registry.register(Registries.ITEM_GROUP,
		new Identifier(GrapeGalore.MOD_ID, "grape"),
		FabricItemGroup.builder().name(Text.translatable("itemgroup.grape"))
			.icon(() -> new ItemStack(Items.GRAPE)).entries((displayContext, entries) -> {
				entries.addItem(Items.GRAPE);
				entries.addItem(Items.COOKED_GRAPE);
				entries.addItem(Items.WINE);
			}).build());


	public static void registerTab(){
		GrapeGalore.LOGGER.info("Hi" +GrapeGalore.MOD_ID);
	}
}
