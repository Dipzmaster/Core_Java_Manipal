package kg.com.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetMetaDataDemo {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            System.out.println("Getting Connection");
            Connection conn = DriverManager.getConnection(
                    "jdbc:oracle:thin:@//localhost:1521/XE", "hr", "hr");
            Statement st = conn.createStatement();
            ResultSet rs = st
                    .executeQuery("SELECT EMPLOYEE_ID, FIRST_NAME, EMAIL FROM EMPLOYEES WHERE DEPARTMENT_ID=90");

            ResultSetMetaData metadata = rs.getMetaData();
 
            int colCount = metadata.getColumnCount();
            System.out.println(metadata.getTableName(1));
            System.out.println("Number of Column : " + colCount);
            System.out.println("Columns Name: ");
            for (int i = 1; i <= colCount; i++) {
                System.out.println(metadata.getColumnName(i) + " "
                        + metadata.getColumnTypeName(i));
            }
        } catch (SQLException s) {
            System.out.println("SQL statement is not executed!");
            s.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
