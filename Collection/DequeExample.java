package Collection;

import java.util.ArrayDeque;
import java.util.Deque;



public class DequeExample {
	
	public static void main(String[] args) {
		
		Deque e = new ArrayDeque();
		
		e.offerLast(34);
		e.offerFirst(100);
		
		System.out.println(e);
		
		System.out.println(e.peekFirst());
		System.out.println(e);
		
		System.out.println(e.pollLast());
		System.out.println(e);
		
	}

}
