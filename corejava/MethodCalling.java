package co.in.corejava;

public class MethodCalling {

	public static void sum() {
	
	int a=90;
	int b=400;
	
	System.out.println("add="+(b+a));
	}
	
	public void sub() {
		
		int a=70;
		int b=25;
		
		System.out.println("sub="+(a-b));	
		
	}
	
	public int multiply() {
		
		int a=10;
		int b=30;
		int c=a*b;
		
		System.out.println( "multiply="+c);
		return c;
	
	}
	
	public int divide(int a,int b) {
		
		return a/b;
		
		
	}
	
public static void main(String[] args) {
	
MethodCalling m=new MethodCalling();

MethodCalling.sum();
 m.sub();
m.sum();
// System.out.println(m.multiply());
 m.multiply();
 
 System.out.println("divide="+m.divide(70,10));
 
}	
}	
	
	
	
	
	
	

