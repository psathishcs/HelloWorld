package org.hello.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HelloJDBC {
	private static String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	private static String username = "scott";
	private static String password = "tiger";
	private static String sqlQuery = "SELECT * FROM EMP";
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		System.out.println("===========HelloJDBC==========");
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection(url,username, password);
		System.out.println("Connected to Oracle 11g database==========");
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sqlQuery);
		System.out.println("executed the SQL Statment ====> " + sqlQuery);
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
		connection.close();
		System.out.println("Closed the Oracle 11g database connection===============");
	}
}
