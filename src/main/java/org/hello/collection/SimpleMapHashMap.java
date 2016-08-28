package org.hello.collection;

import java.util.HashMap;
import java.util.Map;

/*
 * 
╔══════════════╦═════════════════════╦═══════════════════╦══════════════════════╗
║   Property   ║       HashMap       ║      TreeMap      ║     LinkedHashMap    ║
╠══════════════╬═════════════════════╬═══════════════════╬══════════════════════╣
║              ║  no guarantee order ║ sorted according  ║                      ║
║   Order      ║ will remain constant║ to the natural    ║    insertion-order   ║
║              ║      over time      ║    ordering       ║                      ║
╠══════════════╬═════════════════════╬═══════════════════╬══════════════════════╣
║  Get/put     ║                     ║                   ║                      ║
║   remove     ║         O(1)        ║      O(log(n))    ║         O(1)         ║
║ containsKey  ║                     ║                   ║                      ║
╠══════════════╬═════════════════════╬═══════════════════╬══════════════════════╣
║              ║                     ║   NavigableMap    ║                      ║
║  Interfaces  ║         Map         ║       Map         ║         Map          ║
║              ║                     ║    SortedMap      ║                      ║
╠══════════════╬═════════════════════╬═══════════════════╬══════════════════════╣
║              ║                     ║                   ║                      ║
║     Null     ║       allowed       ║    only values    ║       allowed        ║
║ values/keys  ║                     ║                   ║                      ║
╠══════════════╬═════════════════════╩═══════════════════╩══════════════════════╣
║              ║   Fail-fast behavior of an iterator cannot be guaranteed       ║
║   Fail-fast  ║ impossible to make any hard guarantees in the presence of      ║
║   behavior   ║           unsynchronized concurrent modification               ║
╠══════════════╬═════════════════════╦═══════════════════╦══════════════════════╣
║              ║                     ║                   ║                      ║
║Implementation║      buckets        ║   Red-Black Tree  ║    double-linked     ║
║              ║                     ║                   ║       buckets        ║
╠══════════════╬═════════════════════╩═══════════════════╩══════════════════════╣
║      Is      ║                                                                ║
║ synchronized ║              implementation is not synchronized                ║
╚══════════════╩════════════════════════════════════════════════════════════════╝
 * 
 */
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
