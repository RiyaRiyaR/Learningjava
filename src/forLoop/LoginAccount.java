package forLoop;

import java.util.Scanner;

public class LoginAccount {

	String userId;
	String password;
	int maxattempts;
	Scanner sc = new Scanner(System.in);

	void accountlogin() {

		// count= chancesTologin;
		while (maxattempts < 3) {
			System.out.println("Enter a username" + userId);
			userId = sc.next();

			System.out.println("enter password" + password);
			password = sc.next();

			if ("pivotAdmin".equals(userId) && "Admin123".equals(password)) {
				System.out.println("You are logged in to the application");
			} else {

				System.out.println("Incorrect User id or password.Try again");
				maxattempts++;

			}
		}
		if (maxattempts == 3)
			;

		System.out.println("Account locked");

	}
}
