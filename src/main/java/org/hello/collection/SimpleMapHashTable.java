package org.hello.collection;

import java.util.Hashtable;
import java.util.Map;

public class SimpleMapHashTable {
	public static void main(String[] args){
		Map map = new Hashtable();
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
