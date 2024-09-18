package co.in.OOPS;

public class TestOverWrite { 
	
	public static void main(String[] args) {
		
		OverWriteChild o=new OverWriteChild(2,34,"red",44);
		
		System.out.println("lenght=" + o.getLenght());
		System.out.println("width=" + o.getWidth());
		System.out.println("area of rectangle=" + o.area());
		System.out.println("color=" + o.color);
        System.out.println("number=" + o.number);
        
        
        
        OverWriteCircle c=new OverWriteCircle(23,"red",22);
        
        System.out.println("radius=" + c.getRadius());
        System.out.println("area of circle=" + c.area());
        
        
        OverWriteTriangle t=new OverWriteTriangle(12,55,"red",78);
        
        System.out.println("base=" + t.getBase());
        System.out.println("hight=" + t.getHight());
        System.out.println("area of triangle=" + t.area());
	}

}
