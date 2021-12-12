package mypack;

/* 
 * Forces classes to implement certain behaviour
 * All the methods are by default public and abstract in interface
 * contract based programming 
 * interface can contian constants and not variables
 * */

public interface Laptop {

	public void acceptInput();
	abstract void displayOutput();
	public abstract void executePrograms();
	void instalSoftwares();
	
}

class HpLaptop implements Laptop
{

	public void acceptInput() {
		// TODO Auto-generated method stub
		System.out.println(" input for hp laptop");
		
	}

	public void displayOutput() {
		// TODO Auto-generated method stub
		
	}

	public void executePrograms() {
		// TODO Auto-generated method stub
		
	}

	public void instalSoftwares() {
		// TODO Auto-generated method stub
		
	}
	
	
}


class LenovoLaptop implements Laptop
{

	public void acceptInput() {
		System.out.println(" accept input for lenovo laptop");
		
	}

	public void displayOutput() {
		// TODO Auto-generated method stub
		
	}

	public void executePrograms() {
		// TODO Auto-generated method stub
		
	}

	public void instalSoftwares() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}