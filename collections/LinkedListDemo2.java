package com.mage.collectionsdemo;
import java.util.*;

/****************
 * ArrayList , LinkedList and Vector all implemnet from List interface
 * 
 * Vector is a legacy class which is synchronized and is thread safe.
 * Vector sould be used in multi threaded requirements to have synchronized
 * access to the list collection
 * ArrayList : faster read operation and slower insert,delete operation
 * LinkedList : faster insert,update but slower read operation
 * 
 * 
 * @author sarbanandab
 *
 */
public class LinkedListDemo2 {

	public static void main(String[] args) {
//List <String> studentList=new Vector<String>();
//List <String> studentList=new LinkedList<String>();
		
List <String> studentList=new ArrayList<String>();
	studentList.add("Ajay");
	studentList.add("Vinod");
	studentList.add(null);
	studentList.add("Sarba");	
	studentList.add("Prakash");
	studentList.add("   ");
	studentList.add(null);
	studentList.add("Prakash");
	studentList.add("Sarba");
	studentList.add(null);
	studentList.add(3, "Project"); // inserts at some index.
	
	// New arraylist  object s2 created
	List<String>s2=new ArrayList<String>();
	s2.add("xyz");
	s2.add("abc");
	
	studentList.addAll(s2); // adds a whole collection in the existing collection
	
	studentList.addAll(4, s2); // new List s2 added at the fourth position in the existing list studentList
	
	//studentList.clear(); // clear all the elemtns from list
	
	System.out.println("contains xyz or not "+studentList.contains("xyz")); // returns true if the list contains a particular elements
	
	
	
	
	
	
	
	
	
	
	
	
	//System.out.println(studentList);	
		
  Iterator i=studentList.iterator();
  
  while(i.hasNext())
  {
	  String str=(String)i.next();
	  System.out.println(str);
  }
		
	}
}
