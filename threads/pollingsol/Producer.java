package threads.pollingsol;

public class Producer implements Runnable {
	private Queue q;
	public Producer(Queue q){
		this.q = q;
		new Thread(this, "Producer").start();
	}
	@Override
	public void run() {
		int i = 0;
		while(i<10){
			q.put(i++);
		}
	}
}
