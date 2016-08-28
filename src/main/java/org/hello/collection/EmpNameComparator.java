package org.hello.collection;

import java.util.Comparator;

import org.hello.model.Emp;

public class EmpNameComparator implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
		return o1.geteName().compareTo(o2.geteName());
	}
}
