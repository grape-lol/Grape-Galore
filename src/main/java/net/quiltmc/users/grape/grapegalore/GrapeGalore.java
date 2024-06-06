package net.quiltmc.users.grape.grapegalore;

import net.quiltmc.users.grape.grapegalore.Item.CustomTab;
import net.quiltmc.users.grape.grapegalore.Item.Items;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GrapeGalore implements ModInitializer {
	public static final String MOD_ID = "grapegalore";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize(ModContainer mod) {
		Items.register(mod);
		CustomTab.registerTab();
    }
}
