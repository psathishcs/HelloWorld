package org.hello.collection;

import java.util.Hashtable;
import java.util.Properties;
/**
 * 
 * @author SathishParthasarathy
 *
 * Properties class is a subclass of Hashtable and represents a persistent set of properties. 
 * The Properties are key/value pairs that can be saved to a stream or loaded from a stream. 
 * Each key and its corresponding value in the property list is a string. 
 * The Properties class offers you the capability to specify a default property that will be 
 * returned if no value is associated with a certain key.
 *
 */
public class SimpleMapProperties {
	public static void main(String[] args){
		Hashtable map = new Properties();
		//map.put(null,52276); Error value
		map.put("key1",53636);
		map.put("key4",53236);
		map.put("key3",53276);
		map.put("key2",53947);
		for (Object key :map.keySet()){
			System.out.println(key + " : " + map.get(key));
		}
		
	}
}
