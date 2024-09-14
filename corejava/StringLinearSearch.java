package co.in.corejava;

public class StringLinearSearch {


public static int search(String[] str,String key) {
	
	for (int i = 0; i < str.length; i++) {
		if(str[i]==key) {
			return i;	
		}
		
	}
	return -1;
	}
	
	
	public static void main(String[] args) {
		
		String[] str= {"samosa","pizza","kachori"};
		String key="burger";
		
		int index=search(str,key);
		if(index==-1) {
			
			System.out.println("string is not found="+key);
			
		}else {
			System.out.println("string is found="+key);
		}
		
		
		
		
	}
	
}


	

