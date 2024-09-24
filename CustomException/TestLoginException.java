package CustomException;

public class TestLoginException {
	
	public static void main(String[] args) throws LoginException {
		
		String login = "abc111";
		
		if (login!="abc") {
			
			throw new LoginException();
		
		}else {
			
			System.out.println("User Login Successfully");
		}
		
		
		
	}

}
