package co.in.OOPS;

public class OverWriteCircle extends OverWriteParent {

	private int radius;
	
	public OverWriteCircle(int radius,String color,int number) {
		super (color,number);
		this.radius=number;
	}

	public int getRadius() {
		return radius;
	}

	@Override
	public double area() {
		double area=3.14*radius*radius;
		return super.area();
	}
	
	
}
