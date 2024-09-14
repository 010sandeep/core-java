package co.in.corejava;

import java.time.LocalDateTime;

public class DateClass {

	public static void main(String[] args) {
		
		LocalDateTime now=LocalDateTime.now();
		System.out.println("year;"+now.getYear());
		System.out.println("month:"+now.getMonthValue());
		System.out.println("day:"+now.getDayOfMonth());
		System.out.println("minute:"+now.getMinute());
	}
	
}