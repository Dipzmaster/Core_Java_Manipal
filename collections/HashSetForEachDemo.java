package com.mage.collectionsdemo;

/*************
for each loop : easier way for accessing elements of 
a collection without using iterator

difference betweeen iterator and enhanced for each loop

Iterator : bit complex code   forEach :easily readable
Iterator : offers remove() method forEach : remove is not offered in for each\
Iterator : it.next() requires type casting from object to specific type forEach does automatic type casting
Without providing generic type while creating the collection
 	in for each loop shows compilation error showing 
 	object type cannot casted into specific type 

 ********************************/

import java.util.*;
public class HashSetForEachDemo {
	public static void main(String[] args) {
	
		
	Set <Integer>s=new HashSet<Integer>();
	
	
	s.add(10);
	s.add(67);
	s.add(90);
	s.add(23);
	s.add(32);
	s.add(23);
	s.add(32);
	s.add(10);
	
	for(Integer a: s)
	{
		
		System.out.println(a);
	}
	
	
	Iterator i=s.iterator();
	while(i.hasNext())
	{
		Integer num=(Integer)i.next();
		i.remove();
	}
		
	
	
	
	
	
	
	
		
	}

}
