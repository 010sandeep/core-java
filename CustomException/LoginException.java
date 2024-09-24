package CustomException;

public class LoginException extends Exception {

	public LoginException() {

		System.out.println("Invalid Login Id");
	}

}
