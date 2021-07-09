package fr.alex6.lyceegt;

import fr.alex6.lyceegt.listeners.CommandListener;
import fr.alex6.lyceegt.listeners.RoleListener;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;
import java.util.Timer;

public class Main {
    public static void main(String[] args) throws LoginException {
        System.out.println(System.getProperty("bot.token"));
        JDA jda = JDABuilder.createDefault(System.getProperty("bot.token")).addEventListeners(new CommandListener(), new RoleListener()).build();
        Timer timer = new Timer();

    }
}
