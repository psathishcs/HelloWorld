package org.hello.collection;

import java.util.Map;
import java.util.TreeMap;

public class SimpleMapTreeMap {
	public static void main(String[] args){
		Map map = new TreeMap();
	
		map.put("key1",53636);
		map.put("key3",53276);
		map.put("key2",53947);
		for (Object key :map.keySet()){
			System.out.println(key + " : " + map.get(key));
		}
	}
}
