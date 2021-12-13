package pack.inherit;

public class B extends A {
	public int i = 11;
	
	public B(){
		//super(10);
		System.out.println("I am Big B");
	}
	
	public void someMethod(){
		super.someMethod();
		System.out.println("I am someone from planet B. Okay!! " + text);
		super.someMethod();
	}
	
	public void someMethod(String message){
		System.out.println(message);
	}
	
	public void methodB(){
		System.out.println("I am methodB");

	}
}
