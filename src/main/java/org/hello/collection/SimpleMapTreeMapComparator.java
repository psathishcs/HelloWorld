package org.hello.collection;

import java.util.Map;
import java.util.TreeMap;

import org.hello.model.Emp;

public class SimpleMapTreeMapComparator {
	public static void main(String[] args){
		Map map = new TreeMap<Emp, String>(new EmpNoComparator());
		Emp emp= new Emp();
		emp.setEmpNo(37003);
		emp.seteName("Peter");
		map.put(emp, "value3");
		
		
		emp= new Emp();
		emp.setEmpNo(37004);
		emp.seteName("Jack");
		map.put(emp, "value4");
		
		emp= new Emp();
		emp.setEmpNo(37001);
		emp.seteName("Iron Map");
		map.put(emp, "value1");
		
		emp= new Emp();
		emp.setEmpNo(37005);
		emp.seteName("Allice");
		map.put(emp, "value5");
		
		
		emp= new Emp();
		emp.setEmpNo(37002);
		emp.seteName("Rose");
		map.put(emp, "value2");
		
		System.out.println("EmpNoComparator.................");
		for (Object key :map.keySet()){
			emp = (Emp)key;
			System.out.println(emp.getEmpNo() +  ", " + emp.geteName()+ " : " + map.get(key));
			
		}
		
		
		System.out.println("\nEmpNameComparator.................");
		
		map = new TreeMap<Emp, String>(new EmpNameComparator());
		emp= new Emp();
		emp.setEmpNo(37003);
		emp.seteName("Peter");
		map.put(emp, "value3");
		
		
		emp= new Emp();
		emp.setEmpNo(37004);
		emp.seteName("Jack");
		map.put(emp, "value4");
		
		emp= new Emp();
		emp.setEmpNo(37001);
		emp.seteName("Iron Map");
		map.put(emp, "value1");
		
		emp= new Emp();
		emp.setEmpNo(37005);
		emp.seteName("Allice");
		map.put(emp, "value5");
		
		emp= new Emp();
		emp.setEmpNo(37002);
		emp.seteName("Rose");
		map.put(emp, "value2");
		
		for (Object key :map.keySet()){
			emp = (Emp)key;
			System.out.println(emp.getEmpNo() +  ", " + emp.geteName()+ " : " + map.get(key));
			
		}
	}
}
