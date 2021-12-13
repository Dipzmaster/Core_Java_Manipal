package kg.com.jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class PropertiesDBDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties props = new Properties();
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("dbdata.properties");
			props.load(fis);
			Class.forName(props.getProperty("DBDRIVER"));
			Connection connection =DriverManager.getConnection(props.getProperty("DBURL"), 
					props.getProperty("DBUSER"),props.getProperty("DBPASS"));
			Statement statement = connection.createStatement();
			String query = "SELECT * FROM USERS";
			ResultSet resultSet = statement.executeQuery(query);
			while(resultSet.next()){
				System.out.println(resultSet.getString(2));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
