package co.in.OOPS;

public class TestAccount {

	public static void main(String[] args) {

		Account a = new Account();

		a.setnumber(4095);
		a.setbalance(1244);
		a.setaccounttype("saving");
		a.deposit(100);
		a.withdraw(4);
        a.fundtransfer(12);
		a.paybill(100);
        
        
        
		System.out.println("number=" + a.getnumber());
		System.out.println("balance=" + a.getbalance());
		System.out.println("accounttype=" + a.getaccounttype());

	}

}