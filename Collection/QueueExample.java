package Collection;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueExample {
	
	public static void main(String[] args) {
		
		Queue q = new ArrayDeque();
		
		q.offer(12);
		q.offer(11);
		q.offer("sandeep");
		q.offer(10);
		
		System.out.println(q);
		 
		System.out.println(q.peek());
		System.out.println(q);
		
		System.out.println(q.poll());
		System.out.println(q);
		
	}

}
