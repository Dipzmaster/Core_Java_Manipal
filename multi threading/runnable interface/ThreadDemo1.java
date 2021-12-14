package threadproject;

class  IBMThread implements Runnable
{	
	public void run()
	{
		for(int i=0;i<10;i++)
		{
		try
		{
		
		System.out.println(" child thread executing "+i);
		Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			
		}
		}		
	}	
}

public class ThreadDemo1 {
	
	public static void main(String[] args) {
		IBMThread obj=new IBMThread(); // create runnable object
		Thread t=new Thread(obj); // create a thread using runnable object
		t.start();		
		for(int i=0;i<10;i++)
		{
		try
		{
		
		System.out.println(" Main thread executing"+i);
		Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			
		}
		}
		
	}

}
