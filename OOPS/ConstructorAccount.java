package co.in.OOPS;

public class ConstructorAccount {
	
	private String Accounttype;
	private int balance;
	private int number;
//	private int deposit;
	
	public ConstructorAccount() {
		System.out.println("i am a dedault parameter ");
	}

	public ConstructorAccount(String Accounttype,int balance,int number) {
		
		this.Accounttype=Accounttype;
		this.balance=balance;
		this.number=number;
	//	this.deposit=deposit;
	}

	public String getAccounttype() {
		return Accounttype;
	}

	public int getBalance() {
		return balance;
	}

	public int getNumber() {
		return number;
	}
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("deposit successfully new balance=" + balance);
		} else {
			System.out.println("invalid deposit amount");
		}}
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

	
	public static void main(String[] args) {
		
		ConstructorAccount a=new ConstructorAccount("saving",10000, 4095);
	     
		System.out.println("Accounttype=" + a.Accounttype);
		System.out.println("balance="+ a.balance);
		System.out.println("number=" + a.number);
	  // System.out.println("deposit"+a.deposit);
		
		
	a.deposit(230);
	a.withdraw(39);
	a.fundtransfer(50);
	a.paybill(21);
	
	
	
	
	
	
	}
	
}
