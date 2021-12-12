package object;
import java.io.*;

/*
 * ObjectOutputStream : is used to store the state of an object
 * into secondary storage 
 * 
 * Student object needs to be persisted 
 * 
 * Persistent object must implement from Serializatible interface
 * 
 *   Serializable interface does not have any method to implement
 *   It is called s marker interface
 *   
 *   Just by making the class implement Serializable does not persist
 *   the object into secondary storage. Object needs to be persisted
 *   by using ObjectOutputStream.
 */

class Student implements Serializable
{
	private int roll;
	private String name;
	private double marks;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	
}
public class ObjectSerializationDemo {

	public static void main(String[] args) {				
		
		Student s=new Student();
		s.setRoll(89);
		s.setName("Subhash");
		s.setMarks(99.999); // student object state is ready 
		
		FileOutputStream fos=null;
		try
		{
		 fos=new FileOutputStream("d:/myfolder/student.obj");
		 ObjectOutputStream oos=new ObjectOutputStream(fos);
		 oos.writeObject(s);
		 System.out.println(" --- Object written to file-----");
		 
		 
		}
		catch(FileNotFoundException e)
		{
			
		}
		catch(IOException e)
		{
			
		}
		finally
		{
			try{
			fos.close();
			}
			catch(IOException e)
			{
				
			}
		}
		
		
	}
}
