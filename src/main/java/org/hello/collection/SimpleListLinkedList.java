package org.hello.collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SimpleListLinkedList {
	public static void main(String[] args){
		List list = new LinkedList();
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
