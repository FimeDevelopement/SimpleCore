package ru.don1x.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static ru.don1x.Main.getPlugin;
import static ru.don1x.utils.Hex.color;

public class HealCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;
            if (player.hasPermission("simplecore.heal")) {
                player.setHealth(player.getMaxHealth());
                player.sendMessage(color(getPlugin().getConfig().getString("messages.heal")).replace("{player_name}", player.getName()));
            } else {
                player.sendMessage(color(getPlugin().getConfig().getString("messages.no-perms")).replace("{need_perm}", "simplecore.heal"));
            }
        }
        return true;
    }
}
