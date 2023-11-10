package DynamicProject;

public class CalculateFuelInjection {

	
	int xThrottle, yFuel;
	void calculateFuelInjection() {
		
		if(xThrottle<=127) {
			yFuel = xThrottle*2;
		}
		if(xThrottle>=128) {
			yFuel=xThrottle+127;
		}
		System.out.println("yFuel value is:"+yFuel);
	}
}
