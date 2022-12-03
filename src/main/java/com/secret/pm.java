package com.secret;

import net.dv8tion.jda.api.entities.User;

public class pm {
	User user;
	
	public pm() {
	 
 }
 public void sendMessage(User user, String content) {
	    user.openPrivateChannel()
	        .flatMap(channel -> channel.sendMessage(content))
	        .queue();
	}

}
