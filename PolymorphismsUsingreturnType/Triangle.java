package PolymorphismsUsingreturnType;

public class Triangle extends Shape {

	
	public int base;
	public int hight;
	
	public Triangle(int base,int hight) {
		this.base=base;
		this.hight =base;
		
	}
public double area() {
	return base*hight;
}

}
