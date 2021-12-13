package kg.com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class JDBCTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection = null;
		try {
			
			ResourceBundle bundle = ResourceBundle.getBundle("dbdata.properties");
			
			Class.forName(bundle.getString("DBDRIVER"));
			String dbUrl = bundle.getString("DBURL");
			String user = bundle.getString("DBUSER");
			String password = bundle.getString("DBPASS");

			connection = DriverManager.getConnection(dbUrl,user,password);
			Statement statement = connection.createStatement();
			String query = "SELECT * FROM USERS WHERE USER_ID>102";
			ResultSet resultSet = statement.executeQuery(query);
			while(resultSet.next()){
				System.out.println(resultSet.getInt("USER_ID") + "\t" + resultSet.getString("USER_NAME"));
			}
			/*String query = "UPDATE USERS SET SALARY = SALARY +5000 WHERE USER_NAME LIKE 'S%'";
			int rowsAffected = statement.executeUpdate(query);
			System.out.println(rowsAffected + " rows affected.."); */
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
