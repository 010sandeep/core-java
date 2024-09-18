package co.in.OOPS;

public class RectangleShape extends ShapeParent { 
	private int length;
	private int width;
	
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void area() {
		
		System.out.println("rectangle="+length*width);
	}

}
