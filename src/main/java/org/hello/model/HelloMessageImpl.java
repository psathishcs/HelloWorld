package org.hello.model;

import org.springframework.stereotype.Component;

@Component
public class HelloMessageImpl implements HelloMessage{
	private String message;
	
	@Override
	public String getMessage() {
		return message;
	}
	
	@Override
	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String sayHello() {
		return "Hello, World! " + getMessage();
	}
	
}
