package org.hello.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
/**
 * 
 * @author SathishParthasarathy
 *
 *A LinkedHashSet is an ordered version of HashSet that maintains a doubly-linked 
 *List across all elements. Use this class instead of HashSet when you care about the iteration order.
 *When you iterate through a HashSet the order is unpredictable, while a LinkedHashSet lets you
 *iterate through the elements in the order in which they were inserted. 
 */
public class SimpleSetLinkedHashSet {
	public static void main(String[] args){
		Set set = new LinkedHashSet();
		set.add(4567);
		set.add(3027);
		set.add(5175);
		set.add(5176);
		set.add(5178);
		set.add(5173);
		set.add(5172);
		set.add(51711);
		
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
