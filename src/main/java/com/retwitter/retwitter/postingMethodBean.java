package com.retwitter.retwitter;

public class postingMethodBean {

	private String message;

	public postingMethodBean(String message) {
		this.setMessage(message);
		
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "postingMethodBean [message=" + message + "]";
	}

}
