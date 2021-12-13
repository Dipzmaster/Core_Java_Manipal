package kg.learning.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> myQueue = new LinkedList<String>();
		myQueue.offer("first");

		myQueue.add("One");
		myQueue.add("Two");

		System.out.println(myQueue);
	}

}
