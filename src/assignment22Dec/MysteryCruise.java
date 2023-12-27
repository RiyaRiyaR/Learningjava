package assignment22Dec;

public class MysteryCruise extends Cruise {

	@Override
	public double priceForAdults() {
		return 45.99;
			
	}
	@Override
	public double priceForChildren() {
		return 12.99;
			
	}
	@Override
	public int cruiseDays() {
		
		return 2;
		
	}
}
