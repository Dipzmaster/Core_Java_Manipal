package kg.com.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Properties;

public class JdbcDemo {

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

			//Connection connection =DriverManager.getConnection(dbUrl, userId, password);
			/*CallableStatement cs = connection.prepareCall("{call SHOW_USERS(?,?)}");
			cs.setInt(1, 102);
			cs.registerOutParameter(2, Types.VARCHAR);
			cs.execute();
			System.out.println(cs.getString(2));
			*/
			Statement statement = connection.createStatement();
			String query = "SELECT * FROM USERS";
			ResultSet resultSet = statement.executeQuery(query);
			resultSet.next();
			System.out.println(resultSet.getString(2));
			resultSet.next();
			System.out.println(resultSet.getString(2));
			resultSet.previous();
			System.out.println(resultSet.getString(2));
			
			/*while(resultSet.next()){
				System.out.println(resultSet.getString(2));
			}*/
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
