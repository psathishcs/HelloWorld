package org.hello.dao;

import org.hello.model.Dept;

import java.util.List;


public interface DeptDAO {
	public void save(Dept dep);
	public void deleteById(int id);
	public Dept getById(int id);
	public List<Dept> getAll();
}
