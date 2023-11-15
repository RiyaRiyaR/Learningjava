package assignment;

public class CalculateDiscount {

	// declare variables
	int itemPrice;
	String promoCode;
	double discountedValue;
	double discountPercentage = 0.5;// 50% discount that applied to all products

	void calculateDiscount() {

		if (promoCode.equals("promo5")) {
			double discountedValue = (itemPrice * 0.5) * 0.95;
			System.out.println("discount value is:" +discountedValue);
		} else if (promoCode.equals("promo10")) {
			double discountedValue = (itemPrice * 0.5) * 0.90;
			System.out.println("discount value is:" +discountedValue);
		} else if (promoCode.equals("promo20")) {
			double discountedValue = (itemPrice * 0.5) * 0.80;
			System.out.println("discount value is:" +discountedValue);
		} else {
			double discountedValue = itemPrice * 0.5;
			System.out.println("discount value is:" +discountedValue);
		}
	}
}
