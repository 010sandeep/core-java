package Polymorphism;

public class Rectangle extends Shape {
	
	double lenght;
	double widht;
	
	public Rectangle (double lenght, double widht) {
		
	
	this.lenght=lenght;
	this.widht=widht;
	
	}

public double area() {
	return lenght*widht;
}
}
