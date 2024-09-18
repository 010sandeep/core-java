package co.in.OOPS;

public class ChildTriangle extends ConstructorShape {
     private int base;
	 private int hight;
	 
	 
	public ChildTriangle(int base,int hight,String colour,int bodarwidth) {
		super(colour,bodarwidth);
		this.base=base;
		this.hight=hight;
	}


	public int getBase() {
		return base;
	}


	public int getHight() {
		return hight;
	}
	public void area() {
		System.out.println("Triangle area=" + (base*hight)/2);
		
	}
	
}
