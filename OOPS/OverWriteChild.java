package co.in.OOPS;

public class OverWriteChild extends OverWriteParent {

	
	private int lenght;
	private int width;
	
	
	public OverWriteChild(int lenght,int width,String color,int number) {
		
	    super (color,number);
		this.lenght=lenght;
		this.width=lenght;
	} 


	public int getLenght() {
		return lenght;
	}


	public int getWidth() {
		return width;
	}


	@Override
	public double area() {
		 double area=lenght*width;
		return area;
	}
	
	
	
}
