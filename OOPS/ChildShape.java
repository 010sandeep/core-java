package co.in.OOPS;

public class ChildShape extends ConstructorShape {

	private int lenght;
	private int width;

	
	

	public ChildShape(int lenght, int width,String colour,int bodarwidth) {
        super(colour,bodarwidth);
		this.lenght = lenght;
		this.width = width;
	}

	public int getLenght() {
		return lenght;
	}

	public int getWidth() {
		return width;
	}
	
	public void area() {
		
		System.out.println("rectangle=" + lenght*width);
	}
}