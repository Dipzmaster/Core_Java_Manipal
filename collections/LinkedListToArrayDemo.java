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
public class LinkedListToArrayDemo {

	public static void main(String[] args) {
List <String> studentList=new LinkedList<String>();
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
	
				
	Object nameArray[]=studentList.toArray();
	for(int i=0;i<nameArray.length;i++)
	{
		System.out.println((String)nameArray[i]);
	}
	
	
	
	
	
	
	}
}
