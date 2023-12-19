package inheritenceAssignment;

public class PersonalAccountDetails{

	private String accountNumber;
	private int pin;
	private String nameOfAccountHolder;
	private String onlineBankingPassword;
	private double fundsAvailable;
	
	public PersonalAccountDetails(String accountNumber, int Pin , String nameOfAccountHolder,
			String onlineBankingPassword, double fundsAvailable) {
		super();
		this.accountNumber = accountNumber;
		Pin = pin;
		this.nameOfAccountHolder = nameOfAccountHolder;
		this.onlineBankingPassword = onlineBankingPassword;
		this.fundsAvailable = fundsAvailable;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public int getPin() {
		
		return pin;
	}

	private String getNameOfAccountHolder() {
		return nameOfAccountHolder;
	}

	
	private String getOnlineBankingPassword() {
		return onlineBankingPassword;
	}
	public double getFundsAvailable() {
		return fundsAvailable; 
	}

	public void setPin(int pin) {
		this.pin=pin;
	}
	
	public boolean validateUser(String name, String Password ) {
		if (nameOfAccountHolder.equals(getNameOfAccountHolder())&& Password == getOnlineBankingPassword()) {
			return true;
		}
		else {
			
		System.out.println("invalid usrname/passwors");
		return false;}
}
	public boolean  validateUser( String acctNo, int pinEnter) {
		if (acctNo .equals(getAccountNumber())&& pinEnter == this.pin) {
			return true;
		}else {
			System.out.println("invalid AcctNo./pin");
		
		return false ; }
}
}
