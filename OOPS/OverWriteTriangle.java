package co.in.OOPS;

public class OverWriteTriangle extends OverWriteParent {

	private int base;
	private int hight;

	
	public OverWriteTriangle(int base,int hight,String color,int number) {
		
		super (color,number);
		this.base=base;
		this.hight=hight;
		
	}


	public int getBase() {
		return base;
	}


	public int getHight() {
		return hight;
	}


	@Override
	public double area() {
		double area=(base*hight)/2;
		return super.area();
	}
	
	
}
