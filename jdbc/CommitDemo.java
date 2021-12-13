package kg.com.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CommitDemo {
    public static void main(String args[]) {

        Connection conn = null;
        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521/XE", "SYSTEM", "kgking");
            conn.setAutoCommit(false);
            PreparedStatement updateSal = conn
                    .prepareStatement("UPDATE EMPLOYEES SET SALARY = ? "
                            + "WHERE EMPLOYEE_ID =?");
            updateSal.setInt(1, 45000);
            updateSal.setInt(2, 103);
            updateSal.executeUpdate();

            PreparedStatement updateDes = conn
                    .prepareStatement("UPDATEE EMPLOYEES MANAGER_ID=? "
                            + "WHERE EMPLOYEE_ID = ?");
            updateDes.setInt(1, 102);
            updateDes.setInt(2, 103);
            updateDes.executeUpdate();
            conn.commit();
            // committed after both update statements are executed
            conn.setAutoCommit(true);
            Statement st = conn.createStatement();
            ResultSet rs = st
                    .executeQuery("select employee_id,salary,MANAGER_ID from employees "
                            + "where employee_id=103");
            while (rs.next()) {
                int id = rs.getInt("employee_id");
                String sal = rs.getString("salary");
                int job = rs.getInt("MANAGER_ID");
                System.out.println(id + "  " + sal + " " + job + "  ");
            }
        } catch (SQLException se) {
            System.out.println("test");
            try {
                conn.rollback();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println(se);
        } catch (ClassNotFoundException ce) {
            System.out.println(ce);
        }
    }
}
// Output
// The employees table gets updated with the following values only if both
// updates are successful
