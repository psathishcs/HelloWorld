package org.hello.collection;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class SimpleSetTreeSet {
	public static void main(String[] args){
		@SuppressWarnings("rawtypes")
		Set set = new TreeSet();
		set.add(4567);
		set.add(3027);
		set.add(5175);
		set.add(5176);
		set.add(51711);
		set.add(5178);
		set.add(5173);
		set.add(5172);
		Iterator iterator = set.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
			
		}
	}
}
