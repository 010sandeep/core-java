package Polymorphism;

public class Test {
	public static void main(String[] args) {
		
		Shape s=new Rectangle (20,33);
		
		Shape s1=new Circle(20);
		
		Shape s2= new Triangle (20,30);
		
		System.out.println("Rectangle area=" + s.area());
		
		System.out.println("Circle area=" + s1.area());
		
	    System.out.println("Triangle area=" + s2.area());
	
	}

}
