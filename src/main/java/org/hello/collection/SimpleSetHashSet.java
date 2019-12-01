package org.hello.collection;

import java.util.*;

public class SimpleSetHashSet {
	public static void main(String[] args){
		Set set = new HashSet();
		set.add(4567);
		set.add(3027);
		set.add(5179);
		Iterator iterator = set.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
			
		}
		List list = new ArrayList(set);
		Collections.sort(list);
		iterator = list.iterator();
		System.out.println("After Sorting...");
		while(iterator.hasNext()){
			System.out.println(iterator.next());
			
		}
	}
}
