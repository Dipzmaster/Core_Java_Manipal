package com.mage.collectionsdemo;

/*************
 *  Program to explain working of HashSet
 * @author sarbanandab
 *
 * HashSet,TreeSet,LinkedHashSet all implements from Set interface
 * 
 * All these classes can hold unique elements
 *All collection classes are present in util package
 *
 *You must refer to the java documentation of all these collection 
 *classes discussed in the class
 *
 *inserting multiple null into set accepts only one null
 *null is stored in teh beginning of a set
 ********************************/

import java.util.*;
public class HashSetDemo {
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
	
	
	
	boolean b=s.add(32);
	System.out.println(b);
	
	//System.out.println(set);
	
	Iterator it= s.iterator();
	
	while(it.hasNext()) // returns true if htere is one next element in the collection
	{
	int num=(Integer)it.next(); // retursn the next element from collection
	System.out.println(num);
	
	}	
	
	
	
	
	
	
	
	
	
	
	
	
		
	}

}
