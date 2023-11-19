package forLoop;

import java.io.InputStream;
import java.util.Scanner;

public class LoginAccount {

	String username;
	String password;
	int count;
	Scanner sc= new Scanner(System.in);
	void accountlogin() {
		
		
		while(count<3) {
			System.out.println("Enter a username"+username);
			username= sc.next();
			System.out.println("enter password"+password);
			password= sc.next();
		if ("pivotAdmin".equals(username) && "Admin123".equals(password)) {
			System.out.println("You are logged in to the application");
		}
		else  {
			System.out.println("Incorrect User id or password.Try again");
			count++;
			
		}
		}
		if (count>=3);
		
			System.out.println("Account locked");
		
	}
}
