package com.gmail.hexragon.gn4rBot.managers.commands;

import com.gmail.hexragon.gn4rBot.managers.CommandManager;
import com.gmail.hexragon.gn4rBot.managers.GuildManager;
import com.gmail.hexragon.gn4rBot.managers.users.PermissionLevel;
import com.gmail.hexragon.gn4rBot.managers.users.UserManager;
import com.gmail.hexragon.gn4rBot.util.GnarMessage;
import net.dv8tion.jda.entities.Guild;

public abstract class CommandExecutor
{
    //injected by CommandManager
    private CommandManager manager;
    
    private String description = "No descriptions provided.";
    private String usage = null;
    private PermissionLevel permission = PermissionLevel.USER;
    private boolean showInHelp = true;
    
    public abstract void execute(GnarMessage message, String[] args);
    
    public String getDescription()
    {
        return description;
    }
    
    public void setDescription(String description)
    {
        this.description = description;
    }
    
    public void setPermission(PermissionLevel permission)
    {
        this.permission = permission;
    }
    
    public PermissionLevel permissionLevel()
    {
        return permission;
    }
    
    public String getUsage()
    {
        return usage;
    }
    
    public void setUsage(String usage)
    {
        this.usage = usage;
    }
    
    public void showInHelp(boolean showInHelp)
    {
        this.showInHelp = showInHelp;
    }
    
    public boolean isShownInHelp()
    {
        return showInHelp;
    }
    
    public GuildManager getGuildManager()
    {
        return getCommandManager().getGuildManager();
    }
    
    public Guild getGuild()
    {
        return getGuildManager().getGuild();
    }
    
    public UserManager getUserManager()
    {
        return getGuildManager().getUserManager();
    }
    
    public CommandManager getCommandManager()
    {
        return manager;
    }
}