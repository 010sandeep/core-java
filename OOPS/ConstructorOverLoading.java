package co.in.OOPS;

public class ConstructorOverLoading {
	
	public  ConstructorOverLoading () {
		System.out.println("i am a default constructor");
		
	}
		
	public ConstructorOverLoading(int a) {
		this ();		
		System.out.println("i an one");
	}
	public ConstructorOverLoading(int a,int b) {
		this (a);
		System.out.println("i am second");
	}
	public ConstructorOverLoading(int a,int b,int c) {
		this (a,b);
		System.out.println("i am third");
	}
	public ConstructorOverLoading(int a,int b,int c,int d) {
		this(a,b,c);
	System.out.println("i am  fourth");

	}
	public static void main(String[] args) {
		
		ConstructorOverLoading c=new ConstructorOverLoading(10,50,70);
		
	}
	
	
	
	
	
	}
	
	


