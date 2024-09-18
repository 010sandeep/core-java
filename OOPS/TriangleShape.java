package co.in.OOPS;

public class TriangleShape extends ShapeParent{
	
	private int base;
	private int hight;
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHight() {
		return hight;
	}
	public void setHight(int hight) {
		this.hight = hight;
	}
	public void area () {
		
		System.out.println("triangle="+ (base*hight)/2);
	}

}
