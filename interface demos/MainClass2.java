interface LivingBeing
{
	public void born();
	public void die();
}

abstract class Plant implements LivingBeing
{
	
	void photoSynthesis()
	{
		
		System.out.println(" Co2+sunlight+water+nutrient");
	}
}


class RosePlant extends Plant
{

	public void born() {
		// TODO Auto-generated method stub
		System.out.println(" through stem cutting");
		
	}

	public void die() {
		// TODO Auto-generated method stub
		
	}
	
	
}

class Ginger extends Plant
{

	public void born() {
		// TODO Auto-generated method stub
		System.out.println(" reproduction by modified stem");
		
	}

	public void die() {
		// TODO Auto-generated method stub
		
	}	
	
}


public class MainClass2 {

}
