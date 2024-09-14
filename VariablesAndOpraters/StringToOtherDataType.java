package VariablesAndOpraters;

public class StringToOtherDataType {
	
	public static void main(String[] args) {
		
		String str="5";
		
		int i=Integer.parseInt(str);
		
		String str1="8.8";
		
		double d=Double.parseDouble(str1);
		
		String str2="7.9";
		
		float f=Float.parseFloat(str2);
		
		String str3="5000";
		
		long l=Long.parseLong(str3);
		
		String str4="10";
		
		
		String bStr="true";
		boolean b=Boolean.parseBoolean(bStr);
		
		System.out.println(i);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(b);
		
	}
	
	

}
