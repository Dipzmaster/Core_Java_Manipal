package kg.learning.inher;

public class Person {
	String name;
	int age;
	
	public Person(){
		System.out.println("Person......Constructor..........");
	}
	
	public Person(String name){
		this.name = name;
		System.out.println("Person.........Parameterized..............Constructor.....");
	}
	
	public void show(){
		System.out.println("Name : " + name +"\nAge : " + age);
	}
	
	
	//final method
	
	public final void info(){
		System.out.println("info....final method...............");
	}

}
