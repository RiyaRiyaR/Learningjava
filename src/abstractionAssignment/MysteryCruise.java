package abstractionAssignment;

public class MysteryCruise extends Cruise {

	public double casinoPrice;

	public MysteryCruise(double priceForChildren, double priceForAdults, double buffetPriceForChildren,
			double buffetPriceForAdults, double tax, double casinoPrice) {
		super(priceForAdults, priceForChildren, buffetPriceForAdults, buffetPriceForChildren, tax);
		this.casinoPrice = casinoPrice;
	}

	public double calculateTotalPrice() {
		double totalPrice = super.calculateTotalPrice();
		totalPrice += casinoPrice;
		return totalPrice;
	}
}
