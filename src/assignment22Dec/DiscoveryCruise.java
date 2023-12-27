package assignment22Dec;

public class DiscoveryCruise extends Cruise {
	@Override
	public double priceForAdults() {
		return 39.99;

	}

	@Override
	public double priceForChildren() {
		return 9.99;

	}

	@Override
	public int cruiseDays() {

		return 4;

	}
}
