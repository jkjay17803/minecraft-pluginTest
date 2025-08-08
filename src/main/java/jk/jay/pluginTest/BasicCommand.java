package jk.jay.pluginTest;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BasicCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)) {
            sender.sendMessage("이 명령어는 플레이어만 사용가능합니다.");
            return true;
        }

        Player player = (Player) sender;

        player.setDisplayName("test");


        return true;
    }
}