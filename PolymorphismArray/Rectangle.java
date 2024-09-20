package PolymorphismArray;

public class Rectangle extends Shape {
	 private int lenght;
	 private int width;

	 public Rectangle(int lenght,int width) {
		 this.lenght=lenght;
		 this.width= width;
	 }
	 public double area() {
			
			double rarea=lenght*width;
			System.out.println("rectangle  area=" + rarea);
	    return rarea;	
		}
}
