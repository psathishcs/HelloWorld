package org.hello.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SimpleListArrayList {
	public static void main(String[] args){
		List list = new ArrayList();
		list.add(4567);
		list.add(3027);
		list.add(5179);
		Iterator iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
			
		}
		Collections.sort(list);
		
		iterator = list.iterator();
		System.out.println("After Sorting...");
		while(iterator.hasNext()){
			System.out.println(iterator.next());
			
		}
	}
}
