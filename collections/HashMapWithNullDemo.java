package com.mage.collectionsdemo;
/*******
 * Only One null is stored as key.
 * duplicate values are allowed even duplicate values as null are allowed
 * duplicate keys are not allowed ,even duplicate null keys are not allowed
 * 
 */
import java.util.*;
public class HashMapWithNullDemo {
	public static void main(String[] args) {
		
	Map m=new HashMap();
	m.put("hello","world");
	m.put("how", "are you");
	m.put("joy",null);
	m.put(null,null);
	m.put(null,"hello");
	m.put("hello", null);
	m.put(null, null);
	System.out.println(m);
		
		
				
		
	}

}
