package org.hello.jdbc.dao;

import org.hello.jdbc.model.Dept;

import java.sql.SQLException;
import java.util.List;

public interface DeptDAO {
	public void save(Dept dep) throws SQLException;
	public void deleteById(int id) throws SQLException;
	public Dept getById(int id) throws SQLException;
	public List<Dept> getAll() throws SQLException;
}
