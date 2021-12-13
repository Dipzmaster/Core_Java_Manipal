package kg.com.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

public class ResultSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dbUrl = "jdbc:oracle:thin:@localhost:1521:XE";
		String userId = "SYSTEM";
		String password ="kgking";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection connection =DriverManager.getConnection(dbUrl, userId, password);
			
			Statement statement = connection.createStatement();//ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);   
			String query = "SELECT * FROM USERS";
			ResultSet resultSet = statement.executeQuery(query);
			
			while(resultSet.next()){
				System.out.println(resultSet.getString(2));
			}
			
			//resultSet.afterLast();
			
			/*while(resultSet.previous()){
				System.out.println(resultSet.getString(2));
			}*/
			
			//System.out.println(resultSet.getString(2));
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
