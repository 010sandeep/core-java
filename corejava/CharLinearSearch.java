package co.in.corejava;

public class CharLinearSearch {

	public static int search(char [] character,char key) {
		
		for (int i = 0; i < character.length; i++) {
			
			if (character[i]==key) {
				return i;
				
				
			}
		
		}
		return -1;
	}
	public static void main(String[] args) {

		char[]character= {'a','b','c'};
		char key='b';
		
		int index=search(character,key);
		
		if(index==-1) {
			
			System.out.println("character is not found="+key);
			
			
		}else {
			
			System.out.println("character is found="+key);
			
		}
		
		
	}
	
	
	
}
