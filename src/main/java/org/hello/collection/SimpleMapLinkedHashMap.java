package org.hello.collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class SimpleMapLinkedHashMap {
	public static void main(String[] args){
		Map map = new LinkedHashMap();
		map.put(null,52276);
		map.put("key1",53636);
		map.put("key3",53276);
		map.put("key4",null);
		map.put("key2",53947);
		for (Object key :map.keySet()){
			System.out.println(key + " : " + map.get(key));
		}
	}
}
