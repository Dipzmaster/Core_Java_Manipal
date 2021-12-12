package com.mage.collectionsdemo;
/*
 * 
 * Sorting object through TreeSet.
 * 
 * Unless comparable logic is provided , the objects cannot 
 * be sorted through TreeSet
 *  Implement from Comparable interface
 *  provide the logic of comparison in compareTo method
 *  
 * 
 */
import java.util.*;

class Student implements Comparable
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

	
	public String toString()
	{
		return "roll: "+roll+" name :"+name+" marks :"+marks;
	}
	
	Student()
	{
		
	}
	Student(int roll,String name,double marks)
	{
		this.roll=roll;
		this.name=name;
		this.marks=marks;
	}
	public int compareTo(Object o) {
		 Student st=(Student)o;
		if(this.roll>st.roll)
			return 1;
		else if(this.roll<st.roll)
			return -1;
		else		
			return 0;
	}
	
}


public class ComparableDemo {
	public static void main(String[] args) {
	
		
	Set <Student>s=new TreeSet<Student>();
	
	Student s1=new Student();
	s1.setRoll(1);
	s1.setName("Mohan");
	s1.setMarks(99.99);
	
	
	s.add(s1) ; // one student object is added to the set
	s.add(new Student(3,"Ajaya",33.99));
	s.add(new Student(4,"Vinod",56.33));
	s.add(new Student(8,"Prakash",82.77));
	s.add(new Student(7,"Suraj",67.0));
	
	Iterator it=s.iterator();
	
	while(it.hasNext())
	{
		Student obj=(Student)it.next();
		System.out.println(obj);
		
	}
		
	
	
	
	
	
	
		
	}

}
