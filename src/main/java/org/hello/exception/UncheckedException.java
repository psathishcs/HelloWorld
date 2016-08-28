package org.hello.exception;

/**
 * 
 * @author Sathish Parthasarath
 * 
 *   Unchecked exceptions: An Unchecked exception is an exception that occurs at the time of execution, 
 *   these are also called as Runtime Exceptions, these include programming bugs, such as logic errors or improper
 *   use of an API. runtime exceptions are ignored at the time of compilation.
 *
 *   For example, if you have declared an array of size 5 in your program, and trying to call the 6th element
 *   of the array then an ArrayIndexOutOfBoundsExceptionexception occurs.

 */
public class UncheckedException {
	public static void main(String[] args){
		int num[] = {1,2,3,4};
		System.out.print(num[5]);
	}

}
