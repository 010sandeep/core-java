package CustomException;

public class InsufficientFundException extends Exception{
	
	public InsufficientFundException() {
		System.out.println("Insufficient balance");
	}

}
