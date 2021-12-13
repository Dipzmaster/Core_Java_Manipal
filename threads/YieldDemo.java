package threads;

public class YieldDemo implements Runnable {

	Thread thread;
	public YieldDemo(String str){
		thread = new Thread(this, str);
		thread.start();
	}
	@Override
	public void run() {
		for(int i = 0; i < 5; i++){
			//if(i%5 == 0){
				System.out.println(Thread.currentThread().getName() + "......YIELDING Control...." + i);				
				Thread.yield(); // pausing currently executing thread
			//}
			
		}
		
	System.out.println(Thread.currentThread().getName() + " has finished executing..");	

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new YieldDemo("Thread1");
		new YieldDemo("Thread2");
		new YieldDemo("Thread3");
	}

}
