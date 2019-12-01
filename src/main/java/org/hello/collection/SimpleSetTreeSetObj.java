package org.hello.collection;

import org.hello.model.Dept;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
/*
 * Will throws error when not using the object that is not implementing Comparable.
 * Exception in thread "main" java.lang.ClassCastException: org.hello.model.Dept cannot be cast to java.lang.Comparable
	at java.util.TreeMap.compare(TreeMap.java:1188)
	at java.util.TreeMap.put(TreeMap.java:531)
	at java.util.TreeSet.add(TreeSet.java:255)
	at org.hello.collection.SimpleSetTreeSetObj.main(SimpleSetTreeSetObj.java:15)

 */
public class SimpleSetTreeSetObj {
	public static void main(String[] args){
		Set<Dept> set = new TreeSet<>();
		
		Dept dept = new Dept();
		dept.setDept(74003);
		dept.setdName("IT");
		set.add(dept);

		dept = new Dept();
		dept.setDept(74002);
		dept.setdName("Finance");
		set.add(dept);
		
	
		dept = new Dept();
		dept.setDept(74004);
		dept.setdName("Human Resource");
		set.add(dept);

		dept = new Dept();
		dept.setDept(74001);
		dept.setdName("Marketing");
		set.add(dept);
		
		@SuppressWarnings("rawtypes")
		Iterator iterator = set.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
			
		}
	}
}
