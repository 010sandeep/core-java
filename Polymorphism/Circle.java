package Polymorphism;

public class Circle extends Shape {
	
	double radius;
    public final double pi=3.14;

 public Circle(double radius) {
	 this.radius=radius;
 }
 public double area() {
	 return pi*radius*radius;
	 
 }
}
