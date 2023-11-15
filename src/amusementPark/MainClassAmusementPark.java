package amusementPark;

import java.util.Scanner;

public class MainClassAmusementPark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AmusementParkRidess parkRides = new AmusementParkRidess();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the height");
		parkRides.height= sc.nextInt();
		
		parkRides.rides();
		
	}

}
