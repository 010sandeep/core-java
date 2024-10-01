package Collection.Compertor;

public class Marksheet {
	
	public String RollNo;
	 public String name ;
	 public int marks ;
	 
	 public Marksheet(String R,String n,int m) {
		  this.RollNo = R;
		  this.marks = m;
		  this.name = n ;
		  
	

}
	
	
	public String toString() {
		return RollNo + "," + name + "," + marks;
	}
}