package BajsBot;


import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Commands extends ListenerAdapter {


    public void onGuildMessageReceived(GuildMessageReceivedEvent event){
        String msg = event.getMessage().getContentRaw();
        User author = event.getAuthor();
        boolean bot = author.isBot();


        if (msg.equalsIgnoreCase(Bajs.prefix + "help") && !bot){
            event.getChannel().sendMessage("hi").queue();
        }
    }
}
