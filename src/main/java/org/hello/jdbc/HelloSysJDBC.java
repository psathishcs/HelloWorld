package org.hello.jdbc;
import java.sql.*;
public class HelloSysJDBC {
    private static String url = "jdbc:oracle:thin:@localhost:1521:orcl";
    private static String userName ="system";
    private static String password = "Dec#2019";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        System.out.println("===============HelloSysJDBC===============");
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection = DriverManager.getConnection(url, userName, password);
        System.out.println("Connected!");
    }
}
