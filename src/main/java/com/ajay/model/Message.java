package com.ajay.model;

public class Message {

	private String text;

	public Message() {
		super();
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Message [text=" + text + "]";
	}
	
	
}
