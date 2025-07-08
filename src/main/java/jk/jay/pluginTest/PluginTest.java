package jk.jay.pluginTest;

import org.bukkit.plugin.java.JavaPlugin;

public final class PluginTest extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("pluginTest is Loaded! - Ver.1.0004");

        //명령어 관리자
        new CommandManager(this).resisterCommands();
    }
}