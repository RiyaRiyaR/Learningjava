package assignment22Dec;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cruise cruise = new Cruise();
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"We offer 4 different packages as displayed below. please enter the cruise that you want to select: "
						+ "\n" + " Scenic Cruise " + "\n" + " Sunset Cruise" + "\n" + " Discovery Cruise" + "\n"
						+ " Mystery Cruise");
		String selectedCruise = sc.next();
		cruise = new ScenicCruise();
		String enteredAlphabet = "Y";
		switch (selectedCruise) {

		case "ScenicCruise":
			System.out.println(" the cruise you have selected is Scenic cruise which is a " + cruise.cruiseDays()
					+ " day cruise.");

			System.out.println("price for Adults:" + cruise.priceForAdults());
			System.out.println("price for children:" + cruise.priceForChildren());

			System.out.println(
					"please press Y if you want to continue with the selection or press any other alphabet to select another. ");
			String enteredAlphabet1 = sc.next();

			if (enteredAlphabet1.equals(enteredAlphabet)) {

				System.out.println("enter the number of adults");
				cruise.noOfAdults = sc.nextInt();
				System.out.println("enter the number of children");
				cruise.noOfChildren = sc.nextInt();
				while (!(cruise.noOfChildren == 0)) {
					System.out.println("enter a age");
					cruise.age = sc.nextInt();
					cruise.checkAge();
					System.out.println();

					cruise.noOfChildren--;
				}
			} else {
				System.out.println("choose another cruise option from menu");
				break;
			}
			System.out.println(
					"All our cruise have food service on board. Do you want to pre-book for dinner buffet meals at 20.99 per day for adults and 4.99 per day for kids?");
			enteredAlphabet1 = sc.next();
			if (enteredAlphabet1.equals(enteredAlphabet)) {
				System.out.println("your package includes:");

				double totalPriceForadults = cruise.noOfAdults * cruise.priceForAdults();

				System.out.println("scenic ruise adults" + cruise.noOfAdults + ":   " + totalPriceForadults);

			}

		}

	}
}
