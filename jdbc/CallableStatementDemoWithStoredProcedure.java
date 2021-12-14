import java.sql.*;
import java.util.*;

/* Demo on : Calling database stored procedure.
 * 
 *   Create a stored procedure as follows in the database
 *   execute the following command in sql prompt.
 *
 *----------------------------------
create or replace procedure addstudent
(roll in number,name in varchar2,
 marks in number)IS
BEGIN

insert into student values(roll,name,marks);

END;
-----------------------

create a table in teh database named ibmtable with following 
columns 
create table ibmtable(a number,b number, c number);
--------------
The following jdbc code uses CallableStatement to call the stored 
procedure named ibmsum ,passes two numbers into it and 
the procedure creates a record in the database by adding the two numbers

 * 
 */
public class CallableStatementDemoWithStoredProcedure {
	public static void main(String[] args)throws Exception
	{
		Connection con=null;		
		Class.forName("oracle.jdbc.driver.OracleDriver");		
		// to create a connection		
		String url="jdbc:oracle:thin:@localhost:1521:XE";				
		con=DriverManager.getConnection(url,"system","system");		
		Statement st=con.createStatement();
		
		CallableStatement c=
				con.prepareCall("{ call ibmsum(?,?)}");
		
		c.setInt(1,20);
		c.setInt(2,30);
		c.execute();
		System.out.println(" executed");
		
		
		
		
		
	}

}
