package abstractionAssignment;

public class Cruise extends MyBookings {
	double priceForChildren, priceForAdults;
	double mealPriceForAdult, mealPriceForChildren;
	double tax;

	public Cruise(double priceForChildren, double priceForAdults, double buffetPriceForAdult,
			double buffetPriceForChildren, double tax) {
		super();
		this.priceForChildren = priceForChildren;
		this.priceForAdults = priceForAdults;
		this.mealPriceForAdult = buffetPriceForAdult;
		this.mealPriceForChildren = buffetPriceForChildren;
		this.tax = tax;
	}

	@Override
	public double calculateTotalPrice() {
		double totalPrice = noOfDays * (priceForAdults + priceForChildren)
				+ noOfDays * (mealPriceForAdult + mealPriceForChildren);
		totalPrice += totalPrice * tax / 100;
		return totalPrice;
	}

}
