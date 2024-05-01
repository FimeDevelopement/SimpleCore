package ru.don1x.managers;

import ru.don1x.commands.FeedCommand;
import ru.don1x.commands.HealCommand;

import static ru.don1x.Main.getPlugin;

public class CommandManager {
    public HealCommand healCommand = new HealCommand();
    public FeedCommand feedCommand = new FeedCommand();

    public void initializeCommands() {
        getPlugin().getCommand("heal").setExecutor(healCommand);
        getPlugin().getCommand("feed").setExecutor(feedCommand);
    }
}
