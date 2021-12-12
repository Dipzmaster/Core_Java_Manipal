interface RotatingObject
{
	public void rotate();
}


interface Atom
{
	public void calculateMass();

}


class Planet
{
	public void revolve()
	{
		
	}
}

class Earth extends Planet implements RotatingObject,Atom
{

	public void rotate() {
		// TODO Auto-generated method stub
		
	}

	public void calculateMass() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
 


class SolarSystem
{
	
	
	Earth e;
	
	
}

