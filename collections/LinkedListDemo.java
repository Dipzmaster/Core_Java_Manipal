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
public class LinkedListDemo {

	public static void main(String[] args) {
//List <String> studentList=new Vector<String>();
//List <String> studentList=new LinkedList<String>();
		
List <String> studentList=new ArrayList<String>();
	studentList.add("Ajay");
	studentList.add("Vinod");
	studentList.add("Sarba");
	studentList.add("Prakash");
	studentList.add("Prakash");
	studentList.add("Sarba");
	
	//System.out.println(studentList);
	
		
  Iterator i=studentList.iterator();
  
  while(i.hasNext())
  {
	  String str=(String)i.next();
	  System.out.println(str);
  }
  
  
		
	}
}
