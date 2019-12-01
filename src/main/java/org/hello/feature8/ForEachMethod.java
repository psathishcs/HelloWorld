package org.hello.feature8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachMethod {
	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		strList.add("a");
		strList.add("b");
		strList.add("c");
		strList.add("d");
		strList.forEach(x->System.out.println(x));
		
		Map<String, Integer> items = new HashMap<>();
		items.put("a", 1);
		items.put("b", 2);
		items.put("c", 3);
		items.put("d", 4);
		items.put("e", 5);
		items.forEach((x,y)-> System.out.println(x + ", " + y));
	}
}
