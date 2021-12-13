package kg.com.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Properties;

public class ScrollableResultSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dbUrl = "jdbc:oracle:thin:@localhost:1521:XE";
		//String userId = "SYSTEM";
		//String password ="kgking";
		try {
		        Properties prop = new Properties();
		        prop.put("user", "SYSTEM");
		        prop.put("password", "kgking");
			
			
			Class.forName("oracle.jdbc.OracleDriver");
			Connection connection =DriverManager.getConnection(dbUrl, prop);

			Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			String query = "SELECT * FROM USERS";
			ResultSet resultSet = statement.executeQuery(query);
			resultSet.next();
			System.out.println(resultSet.getString(2));
			resultSet.next();
			System.out.println(resultSet.getString(2));
			resultSet.previous();
			System.out.println(resultSet.getString(2));
			
			resultSet.absolute(3);
			System.out.println("3 rd " +resultSet.getString(2));
			resultSet.relative(1);
			System.out.println(resultSet.getString(2));
			
			resultSet.absolute(-4);
			System.out.println("4th from last " +resultSet.getString(2));
			
			
			/*resultSet.absolute(-6);  // will throw SQLException : Exausted ResultSet :-> since no such element exist 
			System.out.println("6th from last " +resultSet.getString(2));
			*/ 
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
