package org.hello.dao;

import java.util.List;

import org.hello.model.Dept;


public interface DeptDAO {
	public void save(Dept dep);
	public void deleteById(int id);
	public Dept getById(int id);
	public List<Dept> getAll();
}
