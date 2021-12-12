package com.mage.collectionsdemo;
import java.util.*;

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
public class HashMapDemo1 {

	public static void main(String[] args) {
	Map<Long,String>telMap =new HashMap<Long,String>(); // random order
	
	telMap.put(9988866654L,"Sarba"); // usually telno is taken as a string .but in this example taken as long
	telMap.put(9947474722L, "Anand");
	telMap.put(8988877363L, "Ravi");
	telMap.put(9382863626L, "Ashu");

	// getting a value from a key
System.out.println
("Phone number of Ravi is :"+telMap.get(8988877363L));
	

// get all the keys into a collection and print

Set <Long>myKeySet=telMap.keySet(); // returns the set of keys

for(Long key:myKeySet)
{
	System.out.print(key); // prints each  key

	System.out.println(telMap.get(key));
}







	
	
	
	
	
	}
}
