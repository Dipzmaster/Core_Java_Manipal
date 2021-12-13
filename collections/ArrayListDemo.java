package kg.learning.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class ArrayListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp1 = new Employee(100, "Prasad");
		Employee emp2 = new Employee(101, "Sai");
		Employee emp3 = new Employee(102, "Raman");
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		
		
		/*empList.add(100);
		empList.add(321);
		empList.add("welcome");
		*/
		Employee e = new Employee();
		
		for(Object emp : empList){			
			e = (Employee)emp;
			System.out.println(e.getName());
		}
		
		
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("Size ...." + al.size());
		al.add("Sai");
		al.add("Prasad");
		al.add("Kumaresh");
		//al.add(12);
		System.out.println("Size ...." + al.size());
		
		System.out.println(al);
			
	/*
		for(int i = 0; i<al.size(); i++){
			System.out.println(al.get(i));
		}
		
		for(Object name : al){
			System.out.println(name);			
		}
		*/
		System.out.println("By Using Iterator.............");
		
		Iterator iterator = al.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		System.out.println("By Using ListIterator.............");
		
		ListIterator listIterator = al.listIterator();
		while(listIterator.hasNext()){
			System.out.println(listIterator.next());
		}
		
		//listIterator.previous();
		System.out.println(listIterator.previous());
		
		Vector<String> fruitBasket = new Vector<>(5,2); // java 8
		System.out.println(fruitBasket.capacity() + "\t" + fruitBasket.size());
		fruitBasket.add("Mango");
		fruitBasket.add("Pineapple");
		fruitBasket.add("Strawberry");
		fruitBasket.add("Apple");
		fruitBasket.add("Banana");
		System.out.println(fruitBasket.capacity() + "\t" + fruitBasket.size());
		fruitBasket.add("Banana");
		System.out.println(fruitBasket.capacity() + "\t" + fruitBasket.size());

		fruitBasket.addAll(al);
		System.out.println(fruitBasket);
		
		fruitBasket.retainAll(al);
		System.out.println(fruitBasket);
		
		fruitBasket.removeAll(al);
		System.out.println(fruitBasket);
		
		





		
	
		
		
	}

}
