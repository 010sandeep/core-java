package PolymorphismArray;

public class Circle extends Shape {
	
	private int radius;
   
	public static final double pi =3.14;
	
	public Circle(int radius ) {
	   this.radius=radius;	
	
	}
	public double area() {
		
		double carea=pi*radius*radius;
		System.out.println("circle area=" + carea);
    return carea;	
	}
}
