package BajsBot;


import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import javax.annotation.Nonnull;
import javax.security.auth.login.LoginException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Bajs {

    public static JDA jda;
    public static String prefix = "~";
    public static ArrayList statusMessages;



    public static void main(String[] args) throws LoginException, InterruptedException {
        jda = new JDABuilder(AccountType.BOT).setToken("NjUxNzE1MjQxNjgzNTgyOTc3.Xed7fw.OZDNNC4K-nRYGK1jocbLBNUBPWM").build();
        jda.addEventListener(new Commands());
    }



}
