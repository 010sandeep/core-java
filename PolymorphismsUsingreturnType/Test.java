package PolymorphismsUsingreturnType;

public class Test {
	public static void main(String[] args) {
		
		Shape s1=Shape.getShape(1);
		Shape s2=Shape.getShape(2);
		Shape s3=Shape.getShape(3);
		
		
		System.out.println("Rectangle area=" + s1.area());
		System.out.println("Circle area=" + s2.area());
		System.out.println("triangle area=" + s3.area());
	}

}
