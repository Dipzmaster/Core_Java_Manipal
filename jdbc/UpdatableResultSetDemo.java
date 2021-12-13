package kg.com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class UpdatableResultSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dbUrl = "jdbc:oracle:thin:@localhost:1521:XE";
		String userId = "SYSTEM";
		String password ="kgking";
		try {
		       
			Class.forName("oracle.jdbc.OracleDriver");
			Connection connection =DriverManager.getConnection(dbUrl, userId,password);

			Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, 
					ResultSet.CONCUR_UPDATABLE);
			String query = "SELECT USER_ID, USER_NAME, SALARY FROM USERS"; // "SELECT * ... "makes ResultSet READ ONLY
			ResultSet resultSet = statement.executeQuery(query);
			
			resultSet.absolute(2);			
			//System.out.println(resultSet.getInt(3));
			//int sal = resultSet.getInt("SALARY");
			resultSet.updateInt("SALARY", 90000);
			resultSet.updateRow();
			System.out.println(resultSet.getInt(3));
			
			
			
		}catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
