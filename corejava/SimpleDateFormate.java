package co.in.corejava;
import java.text.SimpleDateFormat;

import java.util.Date;
public class SimpleDateFormate {

	public static void main(String[] args)  {
		
		Date d=new Date(); 
		
		SimpleDateFormat format=new SimpleDateFormat("dd/mm/yyyy");
		String str=format.format(d);
		System.out.println(str);
		
	}

	
}
