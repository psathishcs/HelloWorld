package org.hello.feature7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResourcesStatement {
	public static void main(String[] args) throws FileNotFoundException, IOException{
		try (
				BufferedReader br = new BufferedReader(new FileReader("D:/Workspace/HelloWorld/src/test/resources/file.xml"));
				BufferedWriter bw = new BufferedWriter(new FileWriter("D:/Workspace/HelloWorld/src/test/resources/file2.xml"));
		)
		{
			StringBuilder builder = new StringBuilder();
			String line = br.readLine();
			while (line != null){
				builder.append(line);
				builder.append(System.lineSeparator());
				line = br.readLine();
			}
			String everyThing = builder.toString();
			bw.write(everyThing);
			System.out.println(everyThing);
		}
	}
}
