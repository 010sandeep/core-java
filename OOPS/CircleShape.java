package co.in.OOPS;

public class CircleShape extends ShapeParent {
    
	private int radius;
//	public static final float pi=3.14f;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void area() {
		System.out.println("radius=" + PI*radius*radius);
	}
}