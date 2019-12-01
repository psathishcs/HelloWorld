package org.hello.dao;

import org.hello.model.Emp;

import java.util.List;

public interface EmpDAO {
	
	public void save(Emp emp);
	public void deleteById(int id);
	public Emp getById(int id);
	public List<Emp> getAll();
	
}
