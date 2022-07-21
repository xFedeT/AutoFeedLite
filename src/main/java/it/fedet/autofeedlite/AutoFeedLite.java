package it.fedet.autofeedlite;

import org.bukkit.plugin.java.JavaPlugin;

public final class AutoFeedLite extends JavaPlugin {

    @Override
    public void onEnable() {
        registerEvents();
    }

    @Override
    public void onDisable() {

    }

    private void registerEvents() {
        getServer().getPluginManager().registerEvents(new Events(), this);
    }
}
