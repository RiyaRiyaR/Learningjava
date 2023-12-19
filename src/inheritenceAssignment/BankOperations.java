package inheritenceAssignment;


public class BankOperations {
	public double withdrawl(double balance, double amountWithdrawn) {

		if (amountWithdrawn> balance) {
		System.out.println(" not enough money in account");
		return balance;
		
	}else {
		balance-= amountWithdrawn;
		System.out.println("available balance:"+balance);
		return balance;
	}
	}
	

	public double deposit( double amountDeposit, double balance) {
		balance+= amountDeposit;
		System.out.println("available balance:"+balance);
		return balance;
	}


}
