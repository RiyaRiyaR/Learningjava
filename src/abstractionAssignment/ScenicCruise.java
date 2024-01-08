package abstractionAssignment;

public class ScenicCruise extends Cruise {
	public double spaPrice;

    public ScenicCruise(double priceForChildren,double priceForAdults, double buffetPriceForChildren,double buffetPriceForAdults, double tax, double spaPrice) {
		super(priceForAdults, priceForChildren, buffetPriceForAdults, buffetPriceForChildren,tax);
        this.spaPrice = spaPrice;
    }

    @Override
    public double calculateTotalPrice() {
        double totalPrice = super.calculateTotalPrice();
        totalPrice += spaPrice;
        return totalPrice;
    }

}
