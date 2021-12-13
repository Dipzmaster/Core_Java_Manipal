package threads;

public class RunnableThreads implements Runnable {

	public RunnableThreads() {
		super();
	}

	public RunnableThreads(Thread th) {
		super();
	}

	@Override
	public void run() {

		Thread th = Thread.currentThread();
		
		
		for (int i = 1; i <= 5; i++) {
			
			try {
				
				System.out.println(th.getName() + "------------------" + i);
				Thread.sleep(1000);
				//th.sleep(1000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {

		System.out.println("\n Start of main thread");

		RunnableThreads rthread = new RunnableThreads();
		
		Thread th1 = new Thread(rthread);
		th1.setName("Thread1");
		th1.start();

		Thread th2 = new Thread(rthread);
		th2.setName("Thread2");
		th2.start();

		Thread th3 = new Thread(rthread);
		th3.setName("Thread3");
		th3.start();

		System.out.println("\n End of main thread");
	}

}
