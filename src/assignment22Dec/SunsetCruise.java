package assignment22Dec;

public class SunsetCruise extends Cruise {

	@Override
	public double priceForAdults() {
		return 52.99;

	}

	@Override
	public double priceForChildren() {
		return 15.99;

	}

	@Override
	public int cruiseDays() {

		return 1;

	}
}
