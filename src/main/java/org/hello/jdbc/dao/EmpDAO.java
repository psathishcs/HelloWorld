package org.hello.jdbc.dao;

import org.hello.jdbc.model.Emp;

import java.sql.SQLException;
import java.util.List;

public interface EmpDAO {
	public void save(Emp emp) throws SQLException ;
	public void deleteById(int id) throws SQLException ;
	public Emp getById(int id) throws SQLException ;
	public List<Emp> getAll() throws SQLException ;
}
