package inheritenceAssignment;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner sc= new Scanner(System.in);
		ATM atm= new ATM();
		OnlineBanking online= new OnlineBanking();
		BankOperations bo= new BankOperations();
		PersonalAccountDetails person= new PersonalAccountDetails("345665465",1234,"Riya","dwe234",2345.7);
	
		System.out.println("Select a mode of transaction- ATM or OnlineBanking");
		String mode= sc.next();
		while((!mode.equals("ATM"))&& (!mode.equals("OnlineBanking"))) {
			System.out.println("invalid: try again");
			mode= sc.next();
		}
		switch(mode) {
		case "ATM":
			System.out.println("enter a account no.");
			String acctNo= sc.next();
			System.out.println("enter pin:");
			int pinEnter= sc.nextInt();
			
			if(person.validateUser(acctNo, pinEnter)== true) {
				System.out.println("select withdraw or deposit:");
				String selectedTransaction= sc.next();
				
				switch(selectedTransaction) {
				case "withdrawl":
					System.out.println("enter a withdrawn amount");
					double amountWithdrawn= sc.nextDouble();
					atm.withdrawl(person.getFundsAvailable(), amountWithdrawn);
					break;
				default:
					System.out.println("enter a deposit amount");
					double amountDeposit= sc.nextDouble();
					atm.withdrawl(person.getFundsAvailable(), amountDeposit);
					break;
				}
				
			}
			break;
		 case "OnlineBanking":
			System.out.println("enter a userName.");
			String name= sc.next();
			System.out.println("enter password:");
			int Password= sc.nextInt();
			
			if(person.validateUser(name, Password)== true) {
				System.out.println("select withdraw or deposit:");
				String selectedTransaction= sc.next();
				
				switch(selectedTransaction) {
				case "withdrawl":
					System.out.println("enter a withdrawn amount");
					double amountWithdrawn= sc.nextDouble();
					atm.withdrawl(person.getFundsAvailable(), amountWithdrawn);
					break;
				default:
					System.out.println("enter a deposit amount");
					double amountDeposit= sc.nextDouble();
					atm.withdrawl(person.getFundsAvailable(), amountDeposit);
					break;

}
}}}}