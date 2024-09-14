package co.in.OOPS;

public class AutoMobile {

	private String color;

	private int speed;

	private String make;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}
   public void changegear(int gear) {
	   
	   if (gear<=5) {
		   speed+=gear*20;
		   System.out.println("gear ="+gear);
	   }else {
		   System.out.println("invalid gear");
		   
	   }
	   
	   
	   
	   
	   
   }
}
