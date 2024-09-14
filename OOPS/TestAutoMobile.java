package co.in.OOPS;

public class TestAutoMobile { 
	
	public static void main(String[] args) {
		
		AutoMobile m=new AutoMobile();
	
		m.setColor("red");
		m.setMake("samdeep");
		m.setSpeed(0);
		m.changegear(3);
		
		
		System.out.println("color="+ m.getColor());
		System.out.println("speed="+ m.getSpeed());
		System.out.println("make="+ m.getMake());
		
		
		
	}
	
	

}
