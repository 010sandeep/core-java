package Abstract;

public class Rectangle extends Shape {

	int lenght;
	int width;

	public Rectangle(int lenght, int width) {
		super();
		this.lenght = lenght;
		this.width = width;
	}

	@Override
	public double area() {
		double area = lenght * width;
		System.out.println("Area of rectangle =" + area);
		return area;
	}

	public static void main(String[] args) {

		Rectangle r = new Rectangle(10, 20);
		r.area();

	}

}
