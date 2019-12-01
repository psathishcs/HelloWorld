package org.hello.collection;

import java.util.HashMap;
import java.util.Map;


public class SimpleMapHashMap {
	public static void main(String[] args){
		Map map = new HashMap();
	//	map.put(null,52276);
		map.put("key1",53636);
		map.put("key3",53276);
		map.put("key4",null);
		map.put("key2",53947);
		for (Object key :map.keySet()){
			System.out.println(key + " : " + map.get(key));
		}
		
	}
}
