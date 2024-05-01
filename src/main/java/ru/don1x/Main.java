package ru.don1x;

import org.bukkit.plugin.java.JavaPlugin;
import ru.don1x.commands.HealCommand;
import ru.don1x.managers.CommandManager;

public final class Main extends JavaPlugin {
    private static Main plugin;

    @Override
    public void onEnable() {
        plugin = this;
        saveDefaultConfig();
        CommandManager commandManager = new CommandManager();
        commandManager.initializeCommands();
    }

    @Override
    public void onDisable() {

    }
    public static Main getInstance() {return plugin;}

    public static Main getPlugin() {return plugin;}
}
