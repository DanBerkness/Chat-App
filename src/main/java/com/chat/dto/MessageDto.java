package com.chat.dto;

public class MessageDto {
	
	private Long channelId;
	private String messageContent;
	private String userName;
	
	
	
	public MessageDto(Long channelId, String messageContent, String userName) {
		super();
		this.channelId = channelId;
		this.messageContent = messageContent;
		this.userName = userName;
	}
	
	public Long getChannelId() {
		return channelId;
	}
	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}
	public String getMessageContent() {
		return messageContent;
	}
	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
