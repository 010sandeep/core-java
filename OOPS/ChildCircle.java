package co.in.OOPS;

public class ChildCircle extends ConstructorShape{
	
	private int radius;
	
public ChildCircle (int radius,String colour,int bodarwidth) {
	super(colour, bodarwidth);
	this.radius=radius;
	
}

public int getRadius() {
	return radius;
}
	
public void area() {
	System.out.println("circle area=" + pi*radius*radius);
	
}

}
