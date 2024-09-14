package co.in.OOPS;

public class MethodOverLoading {
	
	public void sum() {
	
	System.out.println("hellow");
	}

    public int sum(int a) {
    
    	System.out.println("i am parametrized");
		return a;
    	
    }
    
    public void sum(int a,int b) {
    	
    	System.out.println(" i am two parametrized");
    	
    }
    
    public static void main(String[] args) {
		
    	MethodOverLoading m=new MethodOverLoading();
    	
    	m.sum();
    	m.sum(10);
    	m.sum(10, 20);
    	
	}
    
    }