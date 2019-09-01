package moe.sigure.fabricmod.steeltimes;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SteelTimes implements ModInitializer {
    public static String MODID = "steeltimes";
    public static String NAME = "Steel Times";
    public static String VERSION = "1.0.0";

    private static SteelTimes INSTANCE;
    private Logger log = LogManager.getLogger("SteelTimes");

    @Override
    public void onInitialize() {
        log.info(getModNamePrefix() + "Mod is initializing.");
        INSTANCE = this;
    }

    public static String getModNamePrefix() {
        return "[" + NAME + "] ";
    }

    public static SteelTimes getInstance() {
        return INSTANCE;
    }

    public Logger getLogger() {
        return log;
    }
}
