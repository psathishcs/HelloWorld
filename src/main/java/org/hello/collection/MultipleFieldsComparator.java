package org.hello.collection;

import java.util.Comparator;

import org.hello.model.Emp;

public class MultipleFieldsComparator implements Comparator<Emp>{
	
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
