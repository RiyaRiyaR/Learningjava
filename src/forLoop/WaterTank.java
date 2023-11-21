package forLoop;

public class WaterTank {
	int tankCapacity;
	int bucketCapacity;
	int breakpoint;

	void waterTankFilled() {
		int WaterInsideTank = 0;

		for (tankCapacity = 0; tankCapacity < breakpoint; tankCapacity += bucketCapacity) {
			System.out.println("water filled inside" + tankCapacity);
			if (WaterInsideTank > breakpoint) {
				System.out.println("tank is overflowing");
				break;
			}
		}
	}

}
