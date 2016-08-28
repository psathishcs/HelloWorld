package org.hello.jdbc.dao;

import java.sql.SQLException;
import java.util.List;

import org.hello.jdbc.model.Dept;

public interface DeptDAO {
	public void save(Dept dep) throws SQLException;
	public void deleteById(int id) throws SQLException;
	public Dept getById(int id) throws SQLException;
	public List<Dept> getAll() throws SQLException;
}
