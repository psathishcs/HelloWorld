package org.hello;

import org.hello.dao.EmpDAO;
import org.hello.dao.EmpDAOImpl;
import org.hello.model.Emp;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class HelloWorldSpringJDBC { //NOSONAR
	
	private static EmpDAO empDAOImpl;
	public static void main(String[] args){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		empDAOImpl = (EmpDAOImpl)context.getBean("empDAOImpl");
		String beansName[] = context.getBeanDefinitionNames();
		int size = beansName.length;
		System.out.println(size);
		System.out.println("Bean Factory----------------");
		//pring all the bean name in the bean factory
		for(int i = 0;i < size; i++){
			System.out.println(beansName[i]);
		}
		System.out.println("------------------------------");
		//pring all the bean name in the bean factory
		System.out.println("getEmpById--------------------");
		Emp emp = getEmpById(7788);
		if (emp != null) {
		System.out.print(emp.getEmpNo() + "\t");
		System.out.print(emp.geteName()+ "\t");
		System.out.print(emp.getJob()+ "\t");
		System.out.print(emp.getHireDate()+ "\t");
		System.out.print(emp.getSal()+ "\t");
		System.out.println(emp.getComm()); } 
		System.out.println("------------------------------");
		System.out.println("getAllEmp--------------------");
		List<Emp> emps = getAllEmp();
		for (Emp empI:emps){
			System.out.print(empI.getEmpNo() + "\t");
			System.out.print(empI.geteName()+ "\t");
			System.out.print(empI.getJob()+ "\t");
			System.out.print(empI.getHireDate()+ "\t");
			System.out.print(empI.getSal()+ "\t");
			System.out.println(empI.getComm());
		}
		System.out.println("------------------------------");
		context.close();
	}
	
	private static Emp getEmpById(int id){
		Emp emp = empDAOImpl.getById(id);
		return emp;
	}
	
	private static List<Emp> getAllEmp(){
		List<Emp>emps = null;
		if(empDAOImpl != null) {
		emps = empDAOImpl.getAll();}
		return emps;
	}
	
	
}
