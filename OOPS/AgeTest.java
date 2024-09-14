package co.in.OOPS;

import java.util.Scanner;

public class AgeTest {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter current year=");
		int currentyear=sc.nextInt();
		
		System.out.println("Enter your birth datre=");
		int birthyear=sc.nextInt();
		int age=currentyear-birthyear;
		
		System.out.println("your age is="+age);
		
	}
	Scanner close;
	
	

}
