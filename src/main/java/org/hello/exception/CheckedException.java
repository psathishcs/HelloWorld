package org.hello.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
/**
 * 
 * @author Sathish Parthasarath
 * 
 * Checked exceptions: A checked exception is an exception that occurs at the compile time, 
 * these are also called as compile time exceptions. These exceptions cannot simply be ignored at the time of compilation,
 * the Programmer should take care of (handle) these exceptions.
 *  
 * For example, if you use FileReader class in your program to read data from a file, if the file specified 
 * in its constructor doesn't exist, then an FileNotFoundException occurs, and compiler prompts the programmer
 * to handle the exception.
 *
 */
public class CheckedException {
	public static void main(String[] args) throws FileNotFoundException{
		File file = new File("C:/Workspace/HelloWorld/src/test/resources/City.txt");
		FileReader fileReader = new FileReader(file);
	}
}
