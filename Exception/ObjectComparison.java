// overriding the equals method

class Student
{
	int id;
	
	public boolean equals(Object o)
	{
		Student temp=(Student)o;
		
		if(id==temp.id)
			return true;
		else
			return false;
	}
	
}

public class ObjectComparison {

	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.id=13;
		
		Student s2=new Student();
		s2.id=10;
	
		
		
		
		if(s1.equals(s2)) // s1==s2
			System.out.println("equal");
		else
			System.out.println(" Not equal");
		
	}
}
