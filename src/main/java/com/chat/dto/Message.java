package com.chat.dto;

public class Message {

	private Long messageId;
	private String messageStatement;
	private String userName;
	
	
	public Message () {};

	public Message (Long chatId, String chatStatement) {
		this.messageId = chatId;
		this.messageStatement = chatStatement;
	}
	
	public Long getMessageId() {
		return messageId;
	}

	public void setMessageId(Long chatId) {
		this.messageId = chatId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMessageStatement() {
		return messageStatement;
	}

	public void setMessageStatement(String chatStatement) {
		this.messageStatement = chatStatement;
	}
}
