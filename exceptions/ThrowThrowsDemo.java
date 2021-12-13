package com.kg.demo.exception;

public class ThrowThrowsDemo {

	public int methodA(int i, int j){
		if(j==0)
			throw new ArithmeticException();
		
		return i/j;
			
	}
	
	public int methodB(){
		return methodA(10,0);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThrowThrowsDemo demo = new ThrowThrowsDemo();
		try{
		int result = demo.methodB();
		System.out.println(result);
		}catch(ArithmeticException ae){
			ae.printStackTrace();
		}
		
		System.out.println("End of program......");
	}

}
