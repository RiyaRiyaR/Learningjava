package DynamicProject;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       //ClassName ObjectName = new ClassName
		CalculateFuelInjection calculateFuelInjection= new CalculateFuelInjection();
		
		//assigning a value
		calculateFuelInjection.xThrottle= 128;
		
		//call for a function
		calculateFuelInjection.calculateFuelInjection();
	}

}
