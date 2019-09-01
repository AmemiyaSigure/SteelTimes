package moe.sigure.fabricmod.steeltimes;

import net.fabricmc.api.ClientModInitializer;

public class SteelTimesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        SteelTimes.getInstance().getLogger().info(SteelTimes.getModNamePrefix() + "Client is initializing.");
    }
}
