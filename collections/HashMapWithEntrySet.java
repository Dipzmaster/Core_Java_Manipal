package com.mage.collectionsdemo;
import java.util.*;
import java.util.Map.Entry;

interface Behaviour
{
	interface Flyer
	{
		public void fly();
	}
	interface Swimmer
	{
		public void swim();
	}
	
	interface Rotation
	{
		public void rotate();
	}
	
	public void behave();
}

class Student1 implements Behaviour.Flyer
{


	public void behave() {
		// define behave for Parent interface
		
	}


	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
	
}

/****
 * Map : (Interface)
 * HashMap , TreeMap,   LinkedHashMap
 *  
 *  HashTable ( Legacy Class)
 *  Properties ( Only string values )
 *  
 *  Map stores list of key value pairs
 *  
 *  ex : Operating system properies and values
 *      JVM properties and value
 *      JDBC properties and values
 *      
 *      Ex: database property
 *          
 *          key =driver  value=oracle.jdbc.driver.OracleDriver
 *          key=username  value=sarbananda
 *          key=password  values=hello@123
 *          key=dburl      value="oracle@10.32.34.44:XE";
 *          
 *          
 *           Ex : store all empid and empdetails in a collection
 *           
 *           
 *            key=empid    value=whole employee object
 *            
 *   *   
 * @author sarbanandab
 *
 *****************************/

// Ex : store  telephone number and person name  in a map
// tel no is the key and name is hte value
public class HashMapWithEntrySet {

	public static void main(String[] args) {
		
		
		Behaviour.Flyer st=new Student1();
		
		
	Map<Long,String>telMap =new HashMap<Long,String>(); // random order
	
	telMap.put(9988866654L,"Sarba"); // usually telno is taken as a string .but in this example taken as long
	telMap.put(9947474722L, "Anand");
	telMap.put(8988877363L, "Ravi");
	telMap.put(9382863626L, "Ashu");
	telMap.put(9988866654L, "Xottle"); // Duplicate key if entered in a map , then the old value of the key is replaced with the new value
	telMap.put(9988866654L, "Mobile");
	telMap.put(9988866654L, "laptop");

	Set<Map.Entry<Long,String>> es=telMap.entrySet();
	
	Iterator<Entry<Long, String>> it=es.iterator();
	
	
	while(it.hasNext())
	{
		Map.Entry<Long,String> e=(Map.Entry<Long,String>) it.next();		
		System.out.print(e.getKey());
		System.out.println(e.getValue());
	}
	

	
	
	
	
	
	}
}
