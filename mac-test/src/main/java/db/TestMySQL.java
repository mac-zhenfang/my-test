package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestMySQL {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://10.224.195.121:3306/cmf";
		String user = "cmf2";
		String password = "cmf2";
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, user, password);
		if (!conn.isClosed())
		System.out.println("Succeeded connecting to the Database!");
	}

}
