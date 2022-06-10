package com.chat.repository;

import org.springframework.stereotype.Repository;

import com.chat.dto.Channel;

@Repository
public class ChannelsRepository {

	private Channel general;
	private Channel channel2;
	private Channel gary;
	
//	I have sendMessage function. it needs to send to controller. Controller recieves as message DTO Obj.
//	send that along to service the endpoint that recieves the dto can be void.
//	In service use msg DTO obj to create a proper messageDTO that saves it to the channel. 
//	 This message will have a channel ID to pass as long as well. 
	
//	 AT end of js sendMessage we need to call getMessages its just a get request, hits getmapping and returns all
//	messages.
	
//	append msgs needs to clear. append.
}
