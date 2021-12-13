package com.kg.demo.exception;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Exception Demo in Java");
		try{
			String name = "Krishna";
			System.out.println(name.length());
			
		}catch(NullPointerException ne){
			System.out.println("provide object to reference.... ok!!");
			ne.printStackTrace();
			System.out.println("Me executing without any crime");
		} finally{
			System.out.println("----------I am in Finally!!!!!----------");
		}
		
		
		
		
		try{
			int i = 10;
			int j = 0;
			int result = i / j;
			System.out.println(result);
		}catch(ArithmeticException ae){
			System.out.println("Some exception is occuring... who cares!!" + ae.getMessage());
			ae.printStackTrace();
		}
		
		
		
		System.out.println("Am I getting printed??");
	}

}
