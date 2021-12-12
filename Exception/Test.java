import java.text.*;
import java.util.*;
class Test{
 public static void main(String [] args){
	 
Date d=new Date();
DateFormat df=
new SimpleDateFormat("dd/MM/yyyy hh:mm:ss z");

String result=df.format(d);
System.out.println(result);

	 
 }
}
