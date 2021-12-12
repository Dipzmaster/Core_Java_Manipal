
class Job
{
	
}

class Man
{
	Job job;
	
	public void setJob(Job j)
	{
		job=j;	
	}	
		
	Heart h;
	Man()
	{		
		h=new Heart();
		
	}
	void run()
	{
		h.beat();
	}
}
class Heart
{
	
	void beat()
	{
		System.out.println("heart beat");
	}
}

public class MainClass3 {

	public static void main(String[] args) {
		
		
		// Composition  (Man and Heart )
		Man m=new Man();
		m.run();
	
		
		// agreegation (job and Man)
		Man m3=new Man();
		//---------------------
		Job j=new Job();
		
		m3.setJob(j);
		
		
		
	}
}
