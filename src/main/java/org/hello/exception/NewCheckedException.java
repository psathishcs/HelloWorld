package org.hello.exception;

public class NewCheckedException extends Exception{
	private static final long serialVersionUID=1l;
	
	public NewCheckedException(){

	}
	public NewCheckedException(String message){
		super(message, null);
	}
	
	public NewCheckedException(String message, Exception cause){
		super(message, cause);
	}
}
