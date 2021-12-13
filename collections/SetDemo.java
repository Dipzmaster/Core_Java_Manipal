package kg.learning.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> names = new HashSet<>();
		
		names.add("Sai");
		names.add("Prasad");
		names.add("Kumaresh");
		names.add("Sai");
		
		System.out.println(names);
		
		
		Iterator iterator = names.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		
	TreeSet ts = new TreeSet();
	ts.add("Banana");
	ts.add("Apple");
	ts.add("Strawberry");
	ts.addAll(names);
	
	System.out.println(ts);

	
	LinkedHashSet<String> hSet = new LinkedHashSet<>();
	hSet.add("Sai");
	hSet.add("Prasad");
	hSet.add("Kumaresh");
	
	System.out.println(hSet);

		
		
	}

}
