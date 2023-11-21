package forLoop;

import java.util.Scanner;

public class ParkRides {

	int height;
	Scanner sc = new Scanner(System.in);

	void allowedToGetRides() {
		// i= current capacity;
		for (int i = 0; i < 10; i++) {
			System.out.println("enter the height");
			height = sc.nextInt();
			if (height >= 90 && height <= 200) {

				System.out.println("person allowed inside");

				System.out.println(" total no. persons entered inside:" + i);
			} else {
				System.out.println("person not allowed");
				i--;
			}
		}
		System.out.println("park is full");
	}
}
