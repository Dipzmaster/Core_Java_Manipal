package pack.inherit;

public class A {
	protected String text;
	public int i = 10;
	public A(){
		System.out.println("I am ");
	}
	public A(int i){
		System.out.println("I am A " + i);
	}
	
	public  void someMethod(){
		System.out.println("I am someone from planet A. Okay!!" + text);
	}
	
}
