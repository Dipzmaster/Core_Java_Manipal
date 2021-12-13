package kg.learning.collections;

import kg.learning.inher.Person;

public class Calculator<T extends Person, P> {	
	
	void show(T t, P p){
		System.out.println(t + "\t" + p);
	}
	
}
