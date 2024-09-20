package PolymorphismArray;

public class Test { 
	public static void main(String[] args) {
		
	

	
	Shape [] a=new Shape[3];
	
	a[0] =  new Rectangle (10,20);
	
	a[1] = new Circle(10);
	
	a[2] = new Triangle(10,20);
	
	
	double totalarea=calarea(a);
	System.out.println("total area= "+ totalarea);
}

   private static double calarea(Shape[] a) {
	   
	   double totalarea=0;
	   for (int i = 0; i < a.length; i++) {
		totalarea +=a[i].area();
	}
	   return totalarea;
   }



}
