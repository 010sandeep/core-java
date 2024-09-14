package co.in.corejava;

public class LinearSearch {

	public static int search(int []numbers,int key) {
	
	for (int i = 0; i < numbers.length; i++) {
		
		return i;
		
	}

	 return-1;}
			 
			 public static void main(String[]agrs) {
				 
				 int [] numbers = {1,2,3,4,5,6};
				 int key=4;
				 
				 int index=search (numbers,key);
				  if (index==-1) {
					  
					  
					  System.out.println("key is not found at index:"+key);
				  }else {
				 System.out.println("key is found at index:"+key);
				 
				 
			 }
	}
}