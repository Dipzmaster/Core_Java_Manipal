
class Animal
{
	Animal()
	{
		System.out.println("  Animal...");
	}
}

class Monkey extends Animal
{
	String eatingStyle="Enjoying";	
	Monkey()
	{
		System.out.println(eatingStyle);
	}
}
class Man extends Monkey
{
	String intelligence;
	Man()
	{
		intelligence="Very High";
		System.out.println(" Intellegent Man");		
	}		
}
public class MainClas {
	public static void main(String[] args) {		
		Man m=new Man();
	}
	
}
