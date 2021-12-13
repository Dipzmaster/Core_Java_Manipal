package kg.learning.collections;

import java.util.Comparator;

public class NameComparator implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		Employee emp1 = (Employee) obj1;
		Employee emp2 = (Employee) obj2;
		return (emp1.name.compareTo(emp2.name));
		
	}

}
