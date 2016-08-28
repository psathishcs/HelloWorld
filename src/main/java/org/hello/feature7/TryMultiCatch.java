package org.hello.feature7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryMultiCatch {
	public static void main(String[] args){
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader("D:/Workspace/HelloWorld/src/test/resources/City.txt")))
		{
			String city = null;
			while((city = bufferedReader.readLine()) != null){
				System.out.println(city);
			}
		}catch(IOException | NullPointerException   exp){
				exp.printStackTrace();
		}
	}
}
