package kg.learning.collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortingDemo {
	public static void main(String... args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> aList = new ArrayList<Employee>();
		aList.add(new Employee(108,"Ram"));
		aList.add(new Employee(102,"Tara"));
		aList.add(new Employee(100,"Shyam"));

	
		
		//Collections.sort(aList);
		//System.out.println(aList);


		
		Collections.sort(aList, new NameComparator());
		
		
		System.out.println(aList);

		
	}

}
