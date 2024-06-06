package net.quiltmc.users.grape.grapegalore.Item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.quiltmc.users.grape.grapegalore.GrapeGalore;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class Items {
	public static final Item GRAPE = new Item(new QuiltItemSettings().group(CustomTab.GRAPE_GROUP).food(
		new FoodComponent.Builder()
			.hunger(3)
			.saturationModifier(0.4F)
			.build()
	));
	public static final Item COOKED_GRAPE = new Item(new QuiltItemSettings().group(CustomTab.GRAPE_GROUP).food(
		new FoodComponent.Builder()
			.hunger(5)
			.saturationModifier(0.9F)
			.build()
	));
	public static final Item WINE = new WineDrinkingHandler(new QuiltItemSettings().group(CustomTab.GRAPE_GROUP).food(
		new FoodComponent.Builder()
			.hunger(5)
			.saturationModifier(0.9F)
			.alwaysEdible()
			.statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 115, 0), 1.0F)
			.statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 133, 0), 1.0F)
			.statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 0), 1.0F)
			.statusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 300, 0), 1.0F)
			.statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 80, 0), 1.0F)
			.build()
	));

	public static void register(ModContainer mod) {
		Registry.register(Registry.ITEM, new Identifier(GrapeGalore.MOD_ID, "grape"), GRAPE);
		Registry.register(Registry.ITEM, new Identifier(GrapeGalore.MOD_ID, "cooked_grape"), COOKED_GRAPE);
		Registry.register(Registry.ITEM, new Identifier(GrapeGalore.MOD_ID, "wine"), WINE);
	}
}
