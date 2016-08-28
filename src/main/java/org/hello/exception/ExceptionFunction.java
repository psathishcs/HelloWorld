package org.hello.exception;

public class ExceptionFunction {
	public static void ThrowException() throws NewCheckedException {
		System.out.println("inside the ThrowException");
	}
	
	public static void ThrowRuntimeException() throws NewRunTimeException {
		System.out.println("inside the ThrowRuntimeException");
	}
}
