package org.hello.exception;

public class ExceoptionMain {
	public static void main(String[] args){
		try {
			ExceptionFunction.ThrowException();
		}catch(NewCheckedException exp){
			exp.printStackTrace();
		}
		ExceptionFunction.ThrowRuntimeException();
	}
}
