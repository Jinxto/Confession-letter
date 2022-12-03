package com.secret;



import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

import net.dv8tion.jda.api.requests.GatewayIntent;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	JDA jda = JDABuilder.createDefault("ODc5Mjc3OTYyMzgwMzEyNjA3.GxxqZp.aHtXs7T-bjVf08u7oK-SfIfTpd35c3H3ridZlA")
                .enableIntents(GatewayIntent.MESSAGE_CONTENT).addEventListeners(new asyncMessage())
               // enables explicit access to message.getContentDisplay()
                .build();
    	jda.getPresence().setActivity(Activity.playing("a zero sum game."));
    	
        
        	
    		
    		

        }
    }
    

