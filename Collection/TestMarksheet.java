package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestMarksheet {  
	public static void main(String[] args) {
		
		
		ArrayList Mark = new ArrayList();
		
		Mark.add(new Marksheet("A4","sandeep S","89"));
		Mark.add(new Marksheet("A1","goutam","23"));
        Mark.add(new Marksheet("A5", "Mohit", "90"));
        
        System.out.println(Mark);
        
        
        Collections.sort(Mark);
        for(Object o : Mark ) {
        	
        	System.out.println(o);
        	
        	
        	        }
	}

}
