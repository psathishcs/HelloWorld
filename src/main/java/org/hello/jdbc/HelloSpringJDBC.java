package org.hello.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HelloSpringJDBC {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_OracleDB.xml");
		String getEmpQuery = "SELECT * FROM EMP";
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		DataSource source = (DataSource) context.getBean("dataSource");
		try {
			connection = source.getConnection();
			statement = connection.prepareStatement(getEmpQuery);
			resultSet = statement.executeQuery();
			while(resultSet.next()){
				System.out.print(resultSet.getString(1) + "\t");
				System.out.print(resultSet.getString(2) + "\t");
				System.out.print(resultSet.getString(3) + "\t");
				System.out.print(resultSet.getString(4) + "\t");
				System.out.print(resultSet.getString(5) + "\t");
				System.out.print(resultSet.getString(6) + "\t");
				System.out.print(resultSet.getString(7) + "\t");
				System.out.print(resultSet.getString(8) + "\n");
			}
			resultSet.close();
			statement.close();
			connection.close();
			
		}catch(SQLException exp){
			exp.printStackTrace();
		}
	}
}
