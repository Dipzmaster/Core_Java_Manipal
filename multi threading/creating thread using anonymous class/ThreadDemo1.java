package threadproject;
// Create a class implements Runnable inerface
// implement run method
// create object of runnable class

// pass it to thread class constructor
// create object of thread class
// call thread class start method

public class ThreadDemo1 {
	
	public static void main(String[] args) {
		
System.out.println(" this is main thread");



// created anonymous class implementing runnable interface
		new Thread(		new Runnable()
		{
			public void run()
			{
				System.out.println(" Thread 1");
			}
			
		}).start();

		
				
		
	}

}
