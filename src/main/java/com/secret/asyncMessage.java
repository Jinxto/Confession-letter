package com.secret;

import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.entities.channel.ChannelType;
import net.dv8tion.jda.api.entities.channel.middleman.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class asyncMessage extends ListenerAdapter {
	String status;
	String attack;
	String victim1;
	String mes;
	User victim;
	User attacker;
	int firstattacker;
	int firstvictim;
	String status1;
	public asyncMessage() {
		
	}
	
	
	
	@Override
    public void onMessageReceived(MessageReceivedEvent event)
    {
		if(event.isFromType(ChannelType.PRIVATE)&&!event.getAuthor().equals(event.getJDA().getSelfUser()) ){

		System.out.println(firstattacker);
		System.out.println(firstvictim);
		MessageChannel messi = event.getChannel();
		String userID = Long.toString(event.getAuthor().getIdLong());
		if(userID.equals("363575526385778698") && firstattacker<=0) {
			System.out.println("true");
			attacker = event.getAuthor();
			System.out.println("true");
			messi.sendMessage("Hello there you are successfully registered as the attacker").queue();
			firstattacker++;
			return;

			
		}
		if(userID.equals("746682690782232598") && firstvictim<=0) {
			System.out.println("ture1");
			victim = event.getAuthor();
			messi.sendMessage("Hi").queue();
			firstvictim++;
			return;
			//return user code;
			
		}
		String message = event.getMessage().getContentRaw();
		
		if(userID.equals("363575526385778698") && firstattacker>0) {
			mes = event.getMessage().getContentRaw();
			pm v1ctim =  new pm();
			v1ctim.sendMessage(victim, message);
			return;
		}

     if(userID.equals("746682690782232598") && firstvictim>0) {
    	 pm attacker1 = new pm();
         attacker1.sendMessage(attacker, message);
         return;
     }
     if(firstattacker<=0 || firstvictim<=0) {
    	 if(firstattacker>=0) {
    		 messi.sendMessage("victim havent sent verification");
    		 return;
    	 }
    	 if(firstvictim>=0) {
    		 messi.sendMessage("Please wait our system is registering and please send any message again");
    		 return;
    	 }
     }
    
    }
	    	
	    
	   
		}
}
        
		
		
    

