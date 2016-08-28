package org.hello.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.hello.model.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmpDAOImpl implements EmpDAO {
	@Autowired
	private DataSource dataSource;
	@Override
	public void save(Emp emp) {
		String query = "Insert into Emp (EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,COMM,DEPTNO) values (?,?,?,?,?,?,?,?);";
		
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(query);
			ps.setInt(1, emp.getEmpNo());
			ps.setString(2, emp.geteName());
			ps.setString(3, emp.getJob());
			ps.setInt(4, emp.getMgr().getEmpNo());
			ps.setDate(5, emp.getHireDate());
			ps.setDouble(6, emp.getSal());
			ps.setDouble(7, emp.getComm());
			ps.setDouble(8, emp.getDept().getDept());
			
		}catch(SQLException exp){
			exp.printStackTrace();
		}finally{
			try {
				ps.close();
				conn.close();
			}catch(SQLException exp){
				exp.printStackTrace();
			}
		}
	}
	@Override
	public void deleteById(int id){
		String query = "delete from Emp where empno=?";
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			int out = ps.executeUpdate();
			if (out != 0){
				System.out.println("Employee deleted with id = " + id);
			}else {
				System.out.println("No Employee found with id = " + id);
			}
		}catch(SQLException exp){
			exp.printStackTrace();
		}finally{
			try {
				ps.close();
				conn.close();
			}catch(SQLException exp){
				exp.printStackTrace();
			}
		}
		
	}
	@Override
	public Emp getById(int id){
		String query = "select * from Emp where empno=?";
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Emp emp = null;
		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if (rs.next()){
				emp = new Emp();
				 emp.setEmpNo(rs.getInt("empno"));
				 emp.seteName(rs.getString("ename"));
				 emp.setJob(rs.getString("job"));
				 emp.setHireDate(rs.getDate("hiredate"));
				 emp.setSal(rs.getDouble("sal"));
				 emp.setComm(rs.getDouble("comm"));
			}else {
				System.out.println("No Employee found with id = " + id);
			}
		}catch(SQLException exp){
			exp.printStackTrace();
		}finally{
			try {
				ps.close();
				conn.close();
			}catch(SQLException exp){
				exp.printStackTrace();
			}
		}
		return emp;
	}
	@Override
	public List<Emp> getAll(){
		String query = "select * from Emp";
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Emp> emps = new ArrayList<Emp>();
		Emp emp = null;
		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				emp = new Emp();
				 emp.setEmpNo(rs.getInt("empno"));
				 emp.seteName(rs.getString("ename"));
				 emp.setJob(rs.getString("job"));
				 emp.setHireDate(rs.getDate("hiredate"));
				 emp.setSal(rs.getDouble("sal"));
				 emp.setComm(rs.getDouble("comm"));
				 emps.add(emp);
			}
			
		}catch(SQLException exp){
			exp.printStackTrace();
		}finally{
			try {
				ps.close();
				conn.close();
			}catch(SQLException exp){
				exp.printStackTrace();
			}
		}
		return emps;
	}
}
