package Exception;

public class TestNullPointer {

	public static void main(String[] args) {

		String name = null;

		try {
			System.out.println(name.charAt(1));

		} catch (NullPointerException e) {
					
		  System.err.println("String khali hai");
	  		}

//		}

	}
}
