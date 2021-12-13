package drivers;

import pack.inherit.A;
import pack.inherit.B;

public class ABDriver {

	public void methodAB(){
		//System.out.println(text);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A a = new A();
		//a.someMethod();
		
		//B b = new B();
		//b.someMethod();
		
		A aObj = new B();
		aObj.someMethod(); 
		//aObj.methodB(); //  not recognized by super class hence compile time error
		
		
		new B(); //anonymous object
		
		B b = new B();
		//b.someMethod();
		
		System.out.println(aObj.i);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}












