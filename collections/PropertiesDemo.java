package com.mage.collectionsdemo;
import java.util.*;

/*****
 * Properties contains only string
 * @author sarbanandab
 *
 */
public class PropertiesDemo {
	public static void main(String[] args) {
		
		Properties p=new Properties();
		
		p.setProperty("sarba", "B");
		p.setProperty("gopal","krisna");
		
		System.out.println(p.getProperty("gopal"));
		
	}

}
