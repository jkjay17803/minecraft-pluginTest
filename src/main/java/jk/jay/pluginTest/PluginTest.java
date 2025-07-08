package jk.jay.pluginTest;

import org.bukkit.plugin.java.JavaPlugin;

public final class PluginTest extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("pluginTest is Loaded! - Ver.0.0001");
    }
}