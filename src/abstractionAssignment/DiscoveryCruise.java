package abstractionAssignment;

public class DiscoveryCruise extends Cruise {

	public double adventureGamesPrice;

	public DiscoveryCruise(double priceForChildren, double priceForAdults, double buffetPriceForChildren,
			double buffetPriceForAdults, double tax, double adventureGamesPrice) {
		super(priceForAdults, priceForChildren, buffetPriceForAdults, buffetPriceForChildren, tax);
		this.adventureGamesPrice = adventureGamesPrice;
	}

	public double calculateTotalPrice() {
		double totalPrice = super.calculateTotalPrice();
		totalPrice += adventureGamesPrice;
		return totalPrice;
	}
}
