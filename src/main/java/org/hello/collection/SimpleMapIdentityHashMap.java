package org.hello.collection;

import java.util.IdentityHashMap;
import java.util.Map;
/**
 * 
 * @author SathishParthasarathy
 * IdentityHashMap uses == to compare the object rather that .equal method.
 */
public class SimpleMapIdentityHashMap {
	public static void main(String[] args){
		Map map = new IdentityHashMap();
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
