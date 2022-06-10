package com.chat.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chat.dto.Message;
import com.chat.dto.User;
import com.chat.repository.UserRepository;


@RestController
@RequestMapping("api")
public class ApiController {

	@Autowired
	UserRepository userRepo;
	
	
	@GetMapping("/send-message")
	public Message getAllMessages (String info) {
		Map<Long, Message> allMessages = userRepo.getAllMessages();
		Message chat = new Message(1L, "Hi There Everyone!");
		return chat;
	}
	
	@PostMapping("/send-message")
	public User addUser (@RequestBody User user) {
			userRepo.getExistingUser(user);
				userRepo.setUserId(user);
		
		System.out.println("In ApiController: " + user.getUserName() + "" + user.getUserId() + "" + user.getChannels());
		return user;
	}
}