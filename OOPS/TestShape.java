package co.in.OOPS;

public class TestShape {
  public static void main(String[] args) {
	
	  CircleShape c=new CircleShape();
	  RectangleShape a=new RectangleShape();
	  TriangleShape t=new TriangleShape();
	  a.setColour("red");
	  a.setLength(12);
	  a.setWidth(2);
	  a.setWorderwidth(4);
	  c.setRadius(6);
	  t.setHight(4);
	  t.setBase(3 );
	  
	  System.out.println("color=" + a.getColour());
	  System.out.println("length=" + a.getLength());
	  System.out.println("width=" + a.getWidth());
	  System.out.println("worderwidth=" + a.getWorderwidth());
	  
	  a.area();
	  c.area();
	  t.area();
      	  
}
}
