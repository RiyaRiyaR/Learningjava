package abstractionAssignment;

import java.util.Scanner;

public class MainClassMyBookings {

	public static void main(String[] args) {
		UserDetails user = new UserDetails();
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome, Please sign up to book a service.");
		user.registerUser();
		boolean isService = false;
		while (!(isService)) {
			System.out.println(
					"Please select the service you want to book. Enter 1 to book a cruise, 2 to book a hotel, or 3 to exit:");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println(
						"Enter 1 for Scenic Cruise, 2 for Sunset Cruise, 3 for Discovery Cruise, or 4 for Mystery Cruise:");
				int cruiseChoice = sc.nextInt();
				System.out.println("Enter the number of days:");
				int noOfDays = sc.nextInt();
				MyBookings cruise = null;
				switch (cruiseChoice) {
				case 1:
					System.out.println(
							"Do you want to pre-book spa service for $50 per person? Enter 1 for yes, 0 for no:");
					int spaChoice = sc.nextInt();
					double spaPrice = spaChoice == 1 ? 50 : 0;
					cruise = new ScenicCruise(43.99, 12.99, 20.99, 4.99, 18, spaPrice);
					cruise.calculateTotalPrice();
					break;
				case 2:
					System.out.println(
							"Do you want to pre-book candle light dinner for $45 per person? Enter 1 for yes, 0 for no:");
					int dinnerChoice = sc.nextInt();
					double dinnerPrice = dinnerChoice == 1 ? 45 : 0;
					cruise = new SunsetCruise(52.99, 12.99, 20.99, 4.99, 18, dinnerPrice);
					break;
				case 3:
					System.out.println(
							"Do you want to pre-book adventure games for $50 per person? Enter 1 for yes, 0 for no:");
					int gameChoice = sc.nextInt();
					double gamePrice = gameChoice == 1 ? 50 : 0;
					cruise = new DiscoveryCruise(39.99, 9.99, 20.99, 4.99, 18, gamePrice);
					break;
				case 4:
					System.out.println(
							"Do you want to pre-book adventure games for $20 per person? Enter 1 for yes, 0 for no:");
					int casinoChoice = sc.nextInt();
					double casinoPrice = casinoChoice == 1 ? 20 : 0;
					cruise = new MysteryCruise(45.99, 12.99, 20.99, 4.99, 18, casinoPrice);
					break;
				}
				cruise.calculateTotalPrice();

			} else if (choice == 2) {
				System.out.println("please enter the room you want to select -"
						+ "  + \"\\nDeluxe Suite: accommodates 2 adults and 2 children at the rate \"\r\n"
						+ "							+ \"of $180/ night\\nFamily Suite: accommodates 4 adults and\" + \" 4 children at $230/ night\");");

				String room = sc.next();
				System.out.println("Please enter the number of adults in the group:");
				int adults = sc.nextInt();
				System.out.println("Please enter the number of children in the group:");
				int children = sc.nextInt();
				if (room.equalsIgnoreCase("DeluxeSuite")) {
					DeluxeSuite deluxeSuite = new DeluxeSuite(adults, children);
					System.out.println("enter number of days you want to stay");
					deluxeSuite.noOfDays = sc.nextInt();
					deluxeSuite.additionalMealsPrice = adults * 25 + children * 5;
					System.out.println(
							"You have selected Deluxe Suite which accommodates 2 adults and 2 children at the rate of $180/ night.");
					System.out.println("The total price of your stay is $" + deluxeSuite.calculateTotalPrice());
				} else if (room.equalsIgnoreCase("FamilySuite")) {
					FamilySuite familySuite = new FamilySuite(adults, children);
					familySuite.noOfDays = sc.nextInt();
					familySuite.additionalMealsPrice = adults * 25 + children * 5;
					System.out.println(
							"You have selected Family Suite which accommodates 4 adults and 4 children at the rate of $230/ night.");
					System.out.println("The total price of your stay is $" + familySuite.calculateTotalPrice());

				}

			}
		}
	}
}
