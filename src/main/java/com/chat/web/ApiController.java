package com.chat.web;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chat.dto.ListMessagesRequest;
import com.chat.dto.Message;
import com.chat.dto.MessageDto;
import com.chat.dto.User;
import com.chat.repository.UserRepository;


@RestController
@RequestMapping("api")
public class ApiController {

	@Autowired
	UserRepository userRepo;
	
	
	@GetMapping("/list-messages")
	public List<MessageDto> listMessages (ListMessagesRequest request) {
		
		return userRepo.listMessages(request.getChannelId());
		
	}
	
	@PostMapping("/send-message")
	public MessageDto addMessage (@RequestBody MessageDto message) {
			userRepo.addMessage(message);
		return message;
	}
}