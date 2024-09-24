package CustomException;

public class TestInsufficentFund {

	public static void main(String[] args) throws InsufficientFundException{
		
	   int balance = 64;	
	
		if (balance>=3000) {
			throw new InsufficientFundException();
		}else {
			
			System.out.println(" Widroll sucessfully");
		}
	}
}
