package org.hello.comparable;

import java.util.Comparator;

public class DepartmentComparator implements Comparator<Department> {

	@Override
	public int compare(Department o1, Department o2) {
		if (o1.dept > o2.dept)
			return 1;
		else if (o1.dept < o2.dept)
			return -1;
		else return 0;
	}
}
