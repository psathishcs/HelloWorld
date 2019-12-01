package org.hello.collection;

import org.hello.model.Emp;

import java.util.Comparator;

public class EmpNoComparator implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
		if (o1.getEmpNo() == o2.getEmpNo())
			return 0;
		else if (o1.getEmpNo() > o2.getEmpNo())
			return 1;
		else 
			return -1;
	}

}
