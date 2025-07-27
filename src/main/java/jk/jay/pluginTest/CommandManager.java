package jk.jay.pluginTest;

import org.bukkit.plugin.java.JavaPlugin;

public class CommandManager {
    private final JavaPlugin plugin;

    public CommandManager(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    public void resisterCommands() {
        plugin.getCommand("jk").setExecutor(new BasicCommand());
    }
}