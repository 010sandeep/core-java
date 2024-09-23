package Exception;

public class TeatNumberFormate {

	public static void main(String[] args) {

		String name = "sandeep123344";

		try {

			int i = Integer.parseInt(name);

		} catch (NumberFormatException e) {
			System.err.println("input galat hai");
		}

	}

}
