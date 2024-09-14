package co.in.corejava;

public class TestStringBufferwithout {

	public static void main(String[] args) {
		
		
     StringBuffer sb = new StringBuffer("sandep");
     sb.append("gurjar");
     
		
		System.out.println(sb);
		System.out.println("length"+sb.length());
		System.out.println("capacity"+sb.capacity());
		System.out.println("replece = " + sb.replace(5,5,"s"));
		System.out.println("char="+sb.charAt(2));
		System.out.println("index of="+sb.indexOf("gurjar"));
		System.out.println("reverse ="+sb.reverse());
		System.out.println();
		
		
		
		
		
		
	}
	
	
	
}
