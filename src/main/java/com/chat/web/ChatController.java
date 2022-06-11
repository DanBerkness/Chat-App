package com.chat.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.chat.dto.Channel;
import com.chat.dto.User;
import com.chat.service.ChannelService;
import com.chat.service.UserService;

@Controller
public class ChatController {
	@Autowired
	public UserService userService;
	@Autowired
	public ChannelService channelService;

	

	@GetMapping("/welcome")
	public String getWelcome(ModelMap model) {

		List<Channel> channels = channelService.getChannelNames();
		model.put("channels", channels);
		
		return "welcome";
	}

	@GetMapping("/channel/{channelId}")
	public String getChannel( ModelMap model, @PathVariable Long channelId) {

		return "/channel";
	}
}
	

	

