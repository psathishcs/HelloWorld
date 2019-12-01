package org.hello.collection;

import org.hello.model.Emp;

import java.util.Comparator;

public class EmpNameComparator implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
		return o1.geteName().compareTo(o2.geteName());
	}
}
