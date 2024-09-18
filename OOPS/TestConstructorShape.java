package co.in.OOPS;

public class TestConstructorShape {
	
	public static void main(String[] args) {
	
		ChildShape c=new ChildShape(1,2,"red",4);
		
		System.out.println("legth=" + c.getLenght());
		System.out.println("width=" + c.getWidth());
		System.out.println("colour=" + c.getColour());
        System.out.println("bodarwidth=" + c.getBorderwidth());	
	    c.area();
	    
	    
	    ChildCircle r=new ChildCircle(2,"red",44);
	    
	    System.out.println("radius=" + r.getRadius());
	    System.out.println("colour=" + r.getColour());
	    System.out.println("bodarwidth=" + r.getBorderwidth());
	    r.area();
	    
	    
	    ChildTriangle t=new ChildTriangle(3,56,"red",22);
	    
	    System.out.println("hight=" + t.getHight());
	    System.out.println("base=" + t.getBase());
	    System.out.println("colour=" + t.getColour());
	    System.out.println("bodarwidth=" + t.getBorderwidth());
	    t.area();
	
	}
	
}