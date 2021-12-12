package com.mage.collectionsdemo;

class Student
{
	String name;
}

public class HashCodeDemo {
public static void main(String[] args) {

	Student st1=new Student();
	Student st2=new Student();
	
	if(st1.equals(st2))
		System.out.println("equal");
	else
		System.out.println("not");
	
	
	System.out.println("hashCode="+st1.hashCode());
	System.out.println("hashCode="+st2.hashCode());
	
	
	
	
	
	
	
}
}
