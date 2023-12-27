package assignment22Dec;

public class Cruise {

	public double priceForAdults;
	public double priceForChildren;
	public int NoOfDays;
	public String Name;
	public int age;
	public int noOfAdults;
	public int noOfChildren;
	public double mealPrice;

	public double priceForAdults() {

		return priceForAdults;
	}

	public double priceForChildren() {
		return priceForChildren;
	}

	public void checkAge() {
		if (age >= 5 && age <= 12) {
			System.out.println(priceForChildren());
		} else if (age < 5) {
			System.out.println("service is free for children whose age is less than 5");
		}
	}

	public int cruiseDays() {

		return NoOfDays;
	}

	public void noOfAdults() {
		System.out.println("enter the number of members");
	}

	public void mealOPtions() {
		if (age >= 12) {
			mealPrice = 20.99;
		} else {
			mealPrice = 4.99;
		}
	}

}
