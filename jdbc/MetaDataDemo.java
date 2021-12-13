package kg.com.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class MetaDataDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dbUrl = "jdbc:oracle:thin:@localhost:1521:XE";
		Connection connection = null;
		//String userId = "SYSTEM";
		//String password ="kgking";
		try {
		        Properties prop = new Properties();
		        prop.put("user", "SYSTEM");
		        prop.put("password", "kgking");
			
			
			Class.forName("oracle.jdbc.OracleDriver");
			connection =DriverManager.getConnection(dbUrl, prop);
			
			System.out.println("Using DatabaseMetaData.......");

			DatabaseMetaData dMetadata = connection.getMetaData();
			System.out.println("Driver Name : " + dMetadata.getDriverName() + "\nDatabase : " + dMetadata.getDatabaseProductName());
			System.out.println("User Name : " +dMetadata.getUserName() + "\nDatabase Version : " + dMetadata.getDatabaseMajorVersion() +"." + dMetadata.getDatabaseMinorVersion());
			
			System.out.println("\nUsing ResultMetaData.......");
			Statement statement = connection.createStatement();
			String query = "SELECT USER_NAME FROM USERS";
			ResultSet resultSet = statement.executeQuery(query);
			ResultSetMetaData rMetadata = resultSet.getMetaData();
			System.out.println("Total columns : " + rMetadata.getColumnCount() + "\nFirst Column : " + rMetadata.getColumnName(1));
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
		
			
			
			
			
			
			
			
			
			
			
			//Connection connection =DriverManager.getConnection(dbUrl, userId, password);
			/*CallableStatement cs = connection.prepareCall("{call SHOW_USERS(?,?)}");
			cs.setInt(1, 102);
			cs.registerOutParameter(2, Types.VARCHAR);
			cs.execute();
			System.out.println(cs.getString(2));
			
		
	*/

		}
	}
}

