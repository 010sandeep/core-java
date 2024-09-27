package Collection;

import java.util.Stack;

public class StackExampleExe8 {

	public static void main(String[] args) {
		
		Stack s = new Stack();
		
//		s.push(12);
//		s.push(133);
//		s.push(1);
		
//		System.out.println(s);
		
//		System.out.println(s.peek());
//		System.out.println(s.pop());
		
//		System.out.println(s);
		
		for (char ch  = 'A'; ch <= 'Z'; ch++) {
			s.push(ch);
			
		}
		System.out.println(s);
		
	  Stack s2 = new Stack();	
	
	while (!s.isEmpty()) {
		s2.push(s.pop());
	}
	
	System.out.println(s2);
	System.out.println(s);
	}
	
	
}
