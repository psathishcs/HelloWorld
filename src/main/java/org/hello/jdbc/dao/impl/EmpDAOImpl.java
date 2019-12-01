package org.hello.jdbc.dao.impl;

import org.hello.jdbc.dao.DeptDAO;
import org.hello.jdbc.dao.EmpDAO;
import org.hello.jdbc.model.Emp;
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
public class EmpDAOImpl implements EmpDAO{

	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private DeptDAO deptDAO;
	
	private Connection connection = null;
	private PreparedStatement statement = null;
	

	@Override
	public void save(Emp emp) throws SQLException {
		String insertQuery = "Insert into Emp (EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,COMM,DEPTNO) values (?,?,?,?,?,?,?,?)";
		connection = dataSource.getConnection();
		statement = connection.prepareStatement(insertQuery);
		statement.setInt(1, emp.getEmpNo());
		statement.setString(2, emp.geteName());
		statement.setString(3, emp.getJob());
		statement.setInt(4, emp.getMgr().getEmpNo());
		statement.setDate(5, emp.getHireDate());
		statement.setDouble(6, emp.getSal());
		statement.setDouble(7, emp.getComm());
		statement.setDouble(8, emp.getDept().getDeptNo());

		statement.close();
	}

	@Override
	public void deleteById(int id)  throws SQLException{
		String deleteQuery = "DELETE FROM EMP WHERE EMPNO=?";
		connection = dataSource.getConnection();
		statement = connection.prepareStatement(deleteQuery);
		statement.setInt(1, id);
		int result = statement.executeUpdate();
		if (result != 0){
			System.out.println("Employee deleted with id : "  + id);
		}else 
			System.out.println("Employee with id : "  + id + " not found");
		statement.close();
	}

	@Override
	public Emp getById(int id) throws SQLException{
		String selectQuery = "SELECT * FROM EMP WHERE EMPNO=?";
		connection = dataSource.getConnection();
		statement = connection.prepareStatement(selectQuery);
		statement.setInt(1, id);
		ResultSet rs = statement.executeQuery();
		Emp emp = null;
		if (rs.next()){
			emp = new Emp();
			emp.setEmpNo(rs.getInt("empno"));
			emp.seteName(rs.getString("ename"));
			emp.setJob(rs.getString("job"));
			emp.setHireDate(rs.getDate("hiredate"));
			emp.setSal(rs.getDouble("sal"));
			emp.setComm(rs.getDouble("comm"));
			Integer mgrID  = rs.getInt("mgr");
			if (mgrID != 0 && mgrID != null) {
				emp.setMgr(this.getById(mgrID));
			}
			emp.setDept(deptDAO.getById(rs.getInt("deptNo")));
		}else {
			System.out.println("No Employee found with id : " + id);
		}
		rs.close();
		statement.close();
		return emp;
	}

	@Override
	public List<Emp> getAll() throws SQLException {
		String selectQuery = "SELECT * FROM EMP";
		connection = dataSource.getConnection();
		statement = connection.prepareStatement(selectQuery);
		List<Emp> emps = new ArrayList<Emp>();
		Emp emp = null;
		ResultSet rs = statement.executeQuery();
		while(rs.next()){
			emp = new Emp();
			emp.setEmpNo(rs.getInt("empno"));
			emp.seteName(rs.getString("ename"));
			emp.setJob(rs.getString("job"));
			emp.setHireDate(rs.getDate("hiredate"));
			emp.setSal(rs.getDouble("sal"));
			emp.setComm(rs.getDouble("comm"));
			Integer mgrID  = rs.getInt("mgr");
			if (mgrID != 0 && mgrID != null) {
				emp.setMgr(this.getById(mgrID));
			}
			
			emp.setDept(deptDAO.getById(rs.getInt("deptNo")));
			emps.add(emp);
		}
		rs.close();
		statement.close();
		return emps;
	}

}
