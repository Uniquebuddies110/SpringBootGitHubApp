package com.ajay.model;

public class Message {

	private String text1;
	private String text2;

	public Message() {
		super();
	}

	public String getText() {
		return text1;
	}

	public void setText(String text1) {
		this.text1 = text1;
	}

	@Override
	public String toString() {
		return "Message [text=" + text1 + "]";
	}
	
	
}
