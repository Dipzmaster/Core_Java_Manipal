package mypack;
/* Abstract class can contain abstract method
 * as well as concrete method
 * Abstract class can have constructor
 * Abstract class can have private,public
 * protected members
 * Abstract class object cannot be created
 * 
 */
public abstract  class Bird {

	
	public void fly()
	{
		System.out.println(" Flying through wings");
	}
	public void layEgg()
	{
		System.out.println(" Bird Laying Egg ");
	}
	
	abstract void buildNest();	
}
