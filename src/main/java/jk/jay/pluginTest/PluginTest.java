package jk.jay.pluginTest;

import org.bukkit.plugin.java.JavaPlugin;

public final class PluginTest extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("PluginTest - Ver.0.000001");

        new CommandManager(this).resisterCommands();
    }
}