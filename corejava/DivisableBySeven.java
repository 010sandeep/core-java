package co.in.corejava;

public class DivisableBySeven {
	
	 public static void main(String[] args) {
	        System.out.println("Numbers between 100 and 200 that are divisible by 7:");

	        int sum=0;
	        
	        // Loop through numbers from 100 to 200
	        for (int i = 100; i <= 200; i++) {
	            // Check if the number is divisible by 7
	            if (i % 7 == 0) {
	                sum+=i;
	            
	            }
	        }
	    	System.out.println(sum );   
	 }
	}


 