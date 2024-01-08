package abstractionAssignment;

public class HotelBooking extends MyBookings {

	int noOfAdults;
	int noOfChildren;
	double tax = 0.18;
	double additionalMealsPrice = 0;
	double deluxeSuitePrice = 180;
	double familySuitePrice = 230;
	String roomType;

	HotelBooking(int noOfAdults, int noOfChildren, String roomType) {
		this.noOfAdults = noOfAdults;
		this.noOfChildren = noOfChildren;
		this.roomType = roomType;
	}

	public double calculateTotalPrice() {
		if (roomType.equalsIgnoreCase("Deluxe Suite")) {
			totalPriceOfStay = noOfDays * deluxeSuitePrice;
		} else if (roomType.equalsIgnoreCase("Family Suite")) {
			totalPriceOfStay = noOfDays * familySuitePrice;
		}
		totalPriceOfStay += additionalMealsPrice;
		totalPriceOfStay += totalPriceOfStay * tax;
		return totalPriceOfStay;
	}
}
