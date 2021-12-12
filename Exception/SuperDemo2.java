/* this() calls one constructor from another in same class
 * super() calls constructor of base class from derived calss constructor
 */
class Base
{
	Base()
	{
		System.out.println("base");
	}
	
	
	void myMethod()
	{
		System.out.println(" Base class method");
	}
}

class Derived extends Base
{
     Derived()
     { 
    	 super(); // must be first line in constructor
    	 System.out.println(" Derived");
     }
     
     void myMethod()
     {
    	 super.myMethod(); // to call base class method
    	 System.out.println(" Child class method");
     }
     
     
     
}

public class SuperDemo2
{
public static void main(String[] args) {
	
	Derived d=new Derived();
	d.myMethod();
}
}
