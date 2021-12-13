package threads.pollingsol;

public class Queue {
	private int n;
	boolean flag = false;
	public synchronized int get(){
		
		if(!flag)
		try {
			wait();
		} catch (InterruptedException e) {
			System.out.println("InterruptedException occured....");
		}
		
		System.out.println("Got : " + n);
		flag = false;
		notify();
		return n; //consuming
	}
	
	public synchronized void put(int n){
		if(flag)
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("InterruptedException occured....");
			}
		
		this.n = n;  //producing
		flag = true;
		System.out.println("Put : " + n);
		notify();
	}
	
}
