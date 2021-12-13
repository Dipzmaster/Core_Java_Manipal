package com.kg.demo.exception;

public class UserDefinedExceptionDemo {
	
	public void methodA() throws MyException{
		int i = 100;
		int j = 200;
		if(j>i)
			throw new MyException("j can't be greater than i --");
	}
	
	public void methodB() throws MyException{
		methodA();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			new UserDefinedExceptionDemo().methodB();

		}catch(Exception me){
			System.out.println(me.getMessage());
		}
		
	}

}
