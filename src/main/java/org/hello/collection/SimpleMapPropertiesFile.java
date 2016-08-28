package org.hello.collection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class SimpleMapPropertiesFile {
	public static void main(String[] args) throws IOException{
		  Properties grades = new Properties();
          grades.setProperty("Geometry", "20");
          grades.setProperty("Algebra", "20");
          grades.setProperty("Physics", "18");
          grades.setProperty("Chemistry", "17");
          grades.setProperty("Biology", "19");
          FileOutputStream fileOutputStream = new FileOutputStream("schoolGrades.properties");
          grades.store(fileOutputStream, "schoolGrades Properties");
          
          Properties gradesIn = new Properties();
          
          FileInputStream fileInputStream = new FileInputStream("schoolGrades.properties");
          gradesIn.load(fileInputStream);
          fileInputStream.close();
          System.out.println("Read schoolGrades.properties");
      	  for (Object key :gradesIn.keySet()){
      		System.out.println(key + " : " + gradesIn.get(key));
      	  }
		
		
	}
}
