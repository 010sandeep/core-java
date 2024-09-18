package co.in.OOPS;

public class ConstructorShape {
	
	protected String colour;
    protected int borderwidth;
    public static final float pi=3.14f;
    
    
    public ConstructorShape(String colour,int borderwidth) {
    
    	this.colour=colour;
    	this.borderwidth=borderwidth;
    	 
    }


	public String getColour() {
		return colour;
	}


	public int getBorderwidth() {
		return borderwidth;
	} 
    
    
}
