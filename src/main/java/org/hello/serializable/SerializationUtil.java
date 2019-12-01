package org.hello.serializable;

import java.io.*;

public class SerializationUtil {
	public static Object deSerialize(String fileName) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object  obj = ois.readObject();
		ois.close();
		return obj;
	}
	
	public static void serialize(Object obj, String fileName) throws IOException,ClassNotFoundException{
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);
		oos.close();
	}
}
