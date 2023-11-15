package assignment;

import java.util.Scanner;

public class MainClassCalculateDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CalculateDiscount DiscountValue= new CalculateDiscount();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the itemPrice");
		DiscountValue.itemPrice= sc.nextInt();
		
		System.out.println("Enter promoCode. Type N if no promo code");
		DiscountValue.promoCode= sc.next();
		 
		DiscountValue.calculateDiscount();
		
		
	}

}
