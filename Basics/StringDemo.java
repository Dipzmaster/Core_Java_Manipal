package com.kg.demo;

import java.util.StringTokenizer;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Krishna";
		String name1 = "Krishna";
		//name1 = new String("Krishna");

		if(name == name1)
			System.out.println("Same Reference");
		else
			System.out.println("Different Reference");
		
		
		if(name.equals(name1))
			System.out.println("Same Value");
		else
			System.out.println("Different Value");
		
		
		
		String message = "Java runs in, my blood. Okay";
		
		StringTokenizer tokenizer = new StringTokenizer(message,",");
		
		while(tokenizer.hasMoreElements()){
			System.out.println("hi " +tokenizer.nextElement());
		}
		
		
		System.out.println("----------------------------------------------");
		String[] str = message.split("[J][a]");
		
		for(String s : str)
			System.out.println(s);
		
		
		
		StringBuffer sb = new StringBuffer("Learning");
		sb = sb.append(" Java");
		
		System.out.println(sb);
		
		sb.insert(11,"la");
		
		System.out.println(sb);

		
		sb = sb.reverse();
		
		
		
		
		
		
	}

}
