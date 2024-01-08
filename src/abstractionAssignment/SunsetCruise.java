package abstractionAssignment;

public class SunsetCruise extends Cruise {
	public double dinnerPrice;

	public SunsetCruise(double priceForChildren, double priceForAdults, double buffetPriceForChildren,
			double buffetPriceForAdults, double tax, double dinnerPrice) {
		super(priceForAdults, priceForChildren, buffetPriceForAdults, buffetPriceForChildren, tax);
		this.dinnerPrice = dinnerPrice;
	}

	@Override
	public double calculateTotalPrice() {
		double totalPrice = super.calculateTotalPrice();
		totalPrice += dinnerPrice;
		return totalPrice;
	}

}
