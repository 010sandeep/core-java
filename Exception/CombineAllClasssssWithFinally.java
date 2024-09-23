package Exception;

public class CombineAllClasssssWithFinally {

	public static void main(String[] args) {

		String name = null;

		try {
			System.out.println(name.charAt(7));

		} catch (  StringIndexOutOfBoundsException e) {
			System.out.println("String chota hai");
			
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
			
		} finally {
			System.out.println("i am always excuted");
		}

	}

}
