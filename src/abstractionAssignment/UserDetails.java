package abstractionAssignment;

import java.util.Scanner;

public class UserDetails {

	private String username;
	private String password;
	private String name;
	private String phoneNumber;
	private String emailAddress;

	public void User(String username, String password, String name, String phoneNumber, String emailAddress) {
		this.username = username;
		this.password = password;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;

	}

	public void registerUser() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your name: ");
		this.name = scanner.nextLine();
		System.out.print("Enter your phone number: ");
		this.phoneNumber = scanner.nextLine();
		System.out.print("Enter your email address: ");
		this.emailAddress = scanner.nextLine();
		System.out.print("Enter your username: ");
		this.username = scanner.nextLine();
		System.out.print("Enter your password: ");
		this.password = scanner.nextLine();
		System.out.println("Registration successful!");
	}

	public boolean validateUser(Scanner sc) {
		return this.username.equals(username) && this.password.equals(password);
	}
}
