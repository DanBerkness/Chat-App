package com.chat.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chat.dto.Channel;
import com.chat.repository.ChannelRepository;


@Service
public class ChannelService {

	@Autowired
	private ChannelRepository channelRepo;
	
	public Map<Long, Channel> getChannels() {
	return channelRepo.getChannels();	
	}

	public List<Channel> getChannelNames() {
		List<Channel> channels = new ArrayList<Channel>(channelRepo.getChannels().values());
		return channels;
	}

	public List<Long> getChannelById() {
		List<Long> channelIds = new ArrayList<Long>(channelRepo.getChannels().keySet());
		return null;
	}

	
}
