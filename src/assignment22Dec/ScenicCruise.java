package assignment22Dec;

public class ScenicCruise extends Cruise {

	@Override
	public double priceForAdults() {
		return 43.99;

	}

	@Override
	public double priceForChildren() {
		return 12.99;

	}

	@Override
	public int cruiseDays() {

		return 3;

	}

}
