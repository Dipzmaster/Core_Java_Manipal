package threadproject;






//-----------------------------
class  MyThread extends Thread 
{	
	public void run()
	{
		for(int i=0;i<10;i++)
		{
		try
		{
		
		System.out.println(" child thread executing");
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
		
		
		MyThread t=new MyThread();
		t.start();
	
		
		for(int i=0;i<10;i++)
		{
		try
		{
		
		System.out.println(" Main thread executing");
		Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			
		}
		}
		
	}

}
