package co.in.OOPS;

public class Account {

	private int number;

	private String accounttype;

	private int balance;

	public int getnumber() {
		return number;
	}

	public void setnumber(int number) {
		this.number = number;
	}

	public String getaccounttype() {
		return accounttype;
	}

	public void setaccounttype(String accounttype) {
		this.accounttype = accounttype;
	}

	public int getbalance() {
		return balance;
	}

	public void setbalance(int balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("deposit successfully new balance=" + balance);
		} else {
			System.out.println("invalid deposit amount");

		}
	}

	public void withdraw(double amount) {

		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("withdraw successfully new balance=" + balance);
		} else {
			System.out.println("invalid withdraw amount of insufficient balance=");
		}
	}
    public void fundtransfer(double amount) {
	

   if (amount>0 && amount <=balance) {
	   balance -= amount;
	   System.out.println("fundtransfer successfuly new balance="+balance);
   }else {
	   System.out.println("invalid transfer");
   }


   {}}
    public void paybill(double amount) {
    	
    	if(amount>0 && amount <=balance) {
    		balance -=amount;
    		System.out.println("billpayment successfuly new balance="+balance);
    	}else {
    		System.out.println("invalid payment");
    		
    	}
    	
    }
}
