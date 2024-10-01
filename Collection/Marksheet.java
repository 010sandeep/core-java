package Collection;

public class Marksheet implements Comparable<Marksheet>{

public String rollno ; 
public String name;
public String marks;

public Marksheet(String r,String n,String m) {
   
	this.marks = m ;
	this.name = n ;
	this.rollno = r ;
}
	
	@Override
	public int compareTo(Marksheet m) {
		
		return rollno.compareTo(m.rollno);
	}
   public String toString() {
	   return rollno + "," + name + "," + marks;
	   
   }
}
