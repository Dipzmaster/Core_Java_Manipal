package threads.pollingsol;

public class Consumer implements Runnable {
	private Queue q;
	public Consumer(Queue q){
		this.q = q;
		new Thread(this, "Consumer").start();
	}
	@Override
	public void run() {
		int i = 0;
		while(true){
			q.get();
		}
	}
}
