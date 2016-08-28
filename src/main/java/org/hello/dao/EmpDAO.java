package org.hello.dao;

import java.util.List;

import org.hello.model.Emp;

public interface EmpDAO {
	
	public void save(Emp emp);
	public void deleteById(int id);
	public Emp getById(int id);
	public List<Emp> getAll();
	
}
