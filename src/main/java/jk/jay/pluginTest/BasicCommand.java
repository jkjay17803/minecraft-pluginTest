package jk.jay.pluginTest;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class BasicCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.isOp()) {
            sender.sendMessage("Op가 있습니다.\n Op권한을 삭제합니다.");
            sender.setOp(false);
        } else {
            sender.sendMessage("Op가 없습니다. \nOp권한을 지급합니다.");
            sender.setOp(true);
        }
        return true;
    }
}