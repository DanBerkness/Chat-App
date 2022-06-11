package com.chat.repository;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.springframework.stereotype.Repository;
import com.chat.dto.Channel;
import com.chat.dto.Message;
import com.chat.dto.User;
import com.chat.dto.MessageDto;

@Repository
public class UserRepository {

	private List<MessageDto> messages = new ArrayList<>();
	private long userId = 4;

	private List<User> allUsers = new ArrayList<>();
	public Map<Long, User> userData = new HashMap<>();
	public Map<Long, Channel> allChannelMap = new HashMap<>();
	public Map<Long, Message> allChatMap = new HashMap<>();

	private void populateUsers(User user) {
		Message dansChat = new Message(1L, null);
		Message twosChat = new Message(2L, null);
		Message garysChat = new Message(3L, null);

		user = new User();
//		user.channels
		Message usersChat = new Message(user.getUserId(), null);

		Map<Long, Message> dansChatMap = new HashMap<>();
		Map<Long, Message> twosChatMap = new HashMap<>();
		Map<Long, Message> garysChatMap = new HashMap<>();

		dansChatMap.put(dansChat.getMessageId(), dansChat);

		twosChatMap.put(twosChat.getMessageId(), twosChat);
		twosChatMap.put(dansChat.getMessageId(), dansChat);

		garysChatMap.put(dansChat.getMessageId(), dansChat);
		garysChatMap.put(twosChat.getMessageId(), twosChat);
		garysChatMap.put(garysChat.getMessageId(), garysChat);
		Map<Long, Message> placeHolderChat = new HashMap<>();
		placeHolderChat.put(1L, garysChat);

		allChatMap.put(dansChat.getMessageId(), dansChat);
		allChatMap.put(twosChat.getMessageId(), twosChat);
		allChatMap.put(garysChat.getMessageId(), garysChat);

		Channel dansChan = new Channel("Default", 1L, placeHolderChat, userData);
		Channel twosChan = new Channel("Channel2", 2L, placeHolderChat, userData);
		Channel garysChan = new Channel("Gary", 3L, placeHolderChat, userData);

		Map<Long, Channel> dansChannelMap = new HashMap<>();
		dansChannelMap.put(1L, dansChan);

		Map<Long, Channel> twosChannelMap = new HashMap<>();
		twosChannelMap.put(2L, twosChan);

		Map<Long, Channel> garysChannelMap = new HashMap<>();
		garysChannelMap.put(3L, garysChan);

		allChannelMap.put(1L, dansChan);
		allChannelMap.put(2L, twosChan);
		allChannelMap.put(3L, garysChan);

		dansChan.setChats(dansChatMap);
		twosChan.setChats(twosChatMap);
		garysChan.setChats(garysChatMap);

		User dan = new User("Dan", 1L, dansChannelMap);
		User two = new User("two", 2L, twosChannelMap);
		User gary = new User("Gary", 3L, garysChannelMap);
		
		
		allUsers.add(dan);
		allUsers.add(two);
		allUsers.add(gary);
		allUsers.add(user);

		userData.put(dan.getUserId(), dan);
		userData.put(gary.getUserId(), gary);
		userData.put(two.getUserId(), two);
	}

	public User save(User user) {
		return userData.put(user.getUserId(), user);
	}

	public User findById(Long userId) {
		return userData.get(userId);
	}

	public Set<User> getUsers() {
		return null;
	}

	public Map<Long, Channel> getChannels() {
		populateUsers(null);
		return allChannelMap;

	}

	public List<MessageDto> listMessages(Long channelId) {
		return messages.stream().filter((m) -> m.getChannelId().equals(channelId))
				.toList();
	
	}

	public User addUser(User user) {
		populateUsers(user);

		return user;
	}

	public void setUserId(User newUser) {
		newUser.setUserId(userId++);

	}

	public void getExistingUser(User user) {
		populateUsers(user);
		
	}

	public void addMessage(MessageDto message) {
		messages.add(message);
		
	}

}
