package co.in.corejava;

import java.util.Random;

public class RandomNumber { 
	

	  public static void main(String[] args) {
	        Random num = new Random  ();

	        // Generate 5 random numbers between 0 and 100
	        for (int i = 0; i < 5; i++) {
	            int randomNum = num.nextInt(101); // Generates a random number between 0 and 100
	            System.out.println(randomNum);
	        }
	    }

}