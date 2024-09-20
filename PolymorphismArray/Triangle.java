package PolymorphismArray;

public class Triangle extends Shape {
	
	private int base;
	private int hight;
	
	public Triangle(int base,int hight) {
		this.base= base;
	    this.hight=hight;
	}

public double area() {
		
		double tarea=base*hight;
		System.out.println("Triangle area=" + tarea);
    return tarea;	
	}
}
