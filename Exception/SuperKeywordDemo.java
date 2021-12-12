

class Parent
{
	String name;
	
	Parent()
	{
		
	}
	Parent(String name)
	{
		this.name=name;
	}
		
}

class Child extends Parent
{
	int id;
	
	Child()
	{
		
		
	}
	Child(int id,String name)
	{
		super(name);
		this.id=id;
	}
				
	
	void showChild()
	{
		System.out.println("id="+id+" name="+name);
	}
}



public class SuperKeywordDemo {

	
	public static void main(String[] args) {
		
Child c=new Child(12,"mohan");		
c.showChild();		
	}
}
