package org.hello.collection;

import org.hello.model.Emp;

import java.util.Comparator;

public class MultiFieldComparator implements Comparator<Emp>{
	
	@Override
	public int compare(Emp o1, Emp o2) {
		int c;
		c = o1.geteName().compareTo(o2.geteName());
		if (c==0){
			c=o1.getJob().compareTo(o2.getJob());
		}
		return c;
	}
}
