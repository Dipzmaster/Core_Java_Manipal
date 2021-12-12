package com.mage.collectionsdemo;

import java.util.*;
class Student 
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
	
	
}

// Name comparator in descending order of alphabets

class NameComparator implements Comparator
{
	
	@Override
	public int compare(Object o1,Object o2)
	{
			Student s1=(Student)o1;
			Student s2=(Student)o2;
			
			if(s1.getName().compareTo(s2.getName())<0)
				return 1;
			else if(s1.getName().compareTo(s2.getName())>0)
				return -1;
			else						
				return 0;
	}	
}



class RollComparator implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Student s1=(Student)o1;
		Student s2=(Student)o2;
		if(s1.getRoll()>s2.getRoll())
			return 1;
		else if(s1.getRoll()<s2.getRoll())
			return -1;
		else 
			return 0;
	}
}



class MarksComparator implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Student s1=(Student)o1;
		Student s2=(Student)o2;
		if(s1.getMarks()>s2.getMarks())
			return 1;
		else if(s1.getMarks()<s2.getMarks())
			return -1;
		else 
			return 0;
	}
}

public class ComparatorDemo {
	public static void main(String[] args) {
	
		
	Set <Student>s=new TreeSet(new NameComparator());
	
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
