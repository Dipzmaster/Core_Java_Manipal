package kg.learning.collections;

import kg.learning.inher.Student;

public class GenericsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator<Employee, String> cal = new Calculator<>();
		//cal.show("I am Happy!! Are you?");
		
		Calculator<Student,Integer> cal1 = new Calculator<>();
		cal1.show(new Student("Man", 100),108);
		
		Employee emp1 = new Employee(100, "Prasad");

		Calculator<Employee, String> cal2 = new Calculator<>();
		cal2.show(emp1, "Wow Its working");
		
		
		
		
		
		
	}

}
