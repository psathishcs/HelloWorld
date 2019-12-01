package org.hello.jdbc.dao.impl;

import org.hello.jdbc.dao.DeptDAO;
import org.hello.jdbc.model.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class DeptDAOImpl implements DeptDAO {
	
	@Autowired
	private DataSource dataSource;
	
	private Connection connection = null;
	private PreparedStatement statement = null;

	@Override
	public void save(Dept dept) throws SQLException{
		String insertQuery = "Insert into DEPT (DEPTNO, DNAME, LOC) values (?,?,?);";
		connection = dataSource.getConnection();
		statement = connection.prepareStatement(insertQuery);
		statement.setInt(1, dept.getDeptNo());
		statement.setString(2, dept.getdName());
		statement.setString(3, dept.getLoc());
		statement.executeUpdate();
		statement.close();
		
	}

	@Override
	public void deleteById(int id) throws SQLException{
		String deleteQuery = "DELETE FROM DEPT WHERE DEPTNO=?";
		connection = dataSource.getConnection();
		statement = connection.prepareStatement(deleteQuery);
		statement.setInt(1, id);
		int result = statement.executeUpdate();
		if (result != 0){
			System.out.println("Deleted Department with id : "  + id);
		}else 
			System.out.println("Department with id : "  + id + " not found");
		statement.close();
		
	}

	@Override
	public Dept getById(int id) throws SQLException{
		String selectQuery = "SELECT * FROM DEPT WHERE DEPTNO=?";
		connection = dataSource.getConnection();
		statement = connection.prepareStatement(selectQuery);
		statement.setInt(1, id);
		ResultSet rs = statement.executeQuery();
		Dept dept = null;
		if (rs.next()){
			dept = new Dept();
			dept.setDeptNo(rs.getInt("deptno"));
			dept.setdName(rs.getString("dname"));
			dept.setLoc(rs.getString("loc"));
		} else {
			System.out.println("Department with id : " + id + "not found.");
		}
		return dept;
	}

	@Override
	public List<Dept> getAll() throws SQLException{
		String selectQuery = "SELECT * FROM DEPT";
		connection = dataSource.getConnection();
		statement = connection.prepareStatement(selectQuery);
		ResultSet rs = statement.executeQuery();
		List<Dept> depts = new ArrayList<Dept>();
		Dept dept = null;
		while (rs.next()){
			dept = new Dept();
			dept.setDeptNo(rs.getInt("deptno"));
			dept.setdName(rs.getString("dname"));
			dept.setLoc(rs.getString("loc"));
			depts.add(dept);
		} 
		return depts;
	}

}
