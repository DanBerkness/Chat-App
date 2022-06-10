package com.chat.dto;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class User {

	public String userName;
	
	public Long userId;

	public Map<Long, Channel> channels = new HashMap<>();
	
	public User () {};
	
	public User (String userName, Long userId, Map<Long, Channel> channels) {
		this.userName = userName;
		this.userId = userId;
		this.channels = channels;
	}
	

	public Map<Long, Channel> getChannels() {
		return channels;
	}

	@Override
	public int hashCode() {
		return Objects.hash(userId);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(userId, other.userId);
	}


	public void setChannels(Map<Long, Channel> channels) {
		this.channels = channels;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
}


