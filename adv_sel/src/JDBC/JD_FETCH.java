package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;



public class JD_FETCH {

	@Test 
	public void fetch_jdbc() throws SQLException{
		String url ="jdbc:mysql://localhost:3306/test?user=root&password=root";
		//jdbc:mysql://localhost:3306/test
		String un ="root";
		String pwd ="root";
		
		Connection connection = DriverManager.getConnection(url, un, pwd);
		Statement stat = connection.createStatement();
		ResultSet result = stat.executeQuery("select * from data");
		
		while (result.next()) {
			String username = result.getString(2);
			String password = result.getString(1);
			System.out.println( password);
			
		}
	}
	

	

}
