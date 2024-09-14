package co.in.OOPS;

public class ConstructorAutoMobile {
	
	private String color;
	private String name;
	private String make;
	private int speed;
	
	public ConstructorAutoMobile(String color,String name,String make,int speed) {
		this.color=color;
		this.name=name;
	    this.make=make;
	    this.speed=speed;
	}
     public int getspeed() {
    	 return speed;
     }
	public String getColor() {
		return color;
	}

	public String getName() {
		return name;
	}

	public String getmake() {
		return make;
	}
	  public void changegear(int gear) {
		   
		   if (gear<=5 && gear>0) {
			   int speed = gear*20;
			   System.out.println("gear ="+gear);
		   }else {
			   System.out.println("invalid gear");
			   
		   }}
	
	
	public static void main(String[] args) {
		
		ConstructorAutoMobile c=new ConstructorAutoMobile("black","thar","sandeep",20) ;
			
	System.out.println("color=" + c.getColor());
	System.out.println("name=" + c.getName());
	System.out.println("make=" + c.getmake());
	System.out.println("speed=" + c.getspeed());
	
	c.changegear(3);
	
		}
	
	

}
