package com.ibm;

public class Student {

	int roll;
	String name;
	double marks;
	
	public Student()
	{
		
	}

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
	
	public String calculateGrade()
	{
		if(marks>80)
			return "A+";
		else if(marks>60)
			return "A";
		else if(marks>50)
			return "B";
		else if (marks >40)
			return "C";
		else
			return "F";
		
	}
	
}
