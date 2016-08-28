package org.hello.exception;

public class NewRunTimeException extends RuntimeException{
	public NewRunTimeException(){
		
	}
	public NewRunTimeException(String message){
		super(message, null);
	}
	public NewRunTimeException(String message, Exception cause){
		super(message,cause);
	}
}
