package com.chat.repository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.chat.dto.Channel;

@Repository
public class ChannelRepository {
	
	private Map<Long, Channel> channelMap = new HashMap<>();
	
	@Autowired
	UserRepository userRepo;

	public Map<Long, Channel> getChannels() {
		Map<Long, Channel> channels = new HashMap<>();
		channels = userRepo.getChannels();
		return channels;
		
	}
	public Map<Long, Channel> populateChannels(Long channelId, Channel channel) {
		
		 channelMap.put(channelId, channel);
		 return channelMap;
		
	}

}
