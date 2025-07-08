package jk.jay.pluginTest;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class BasicCommand implements CommandExecutor {
    @Override public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage("안녕하세요! 커스텀 명령어가 작동합니다.");
        return true;
    }
}