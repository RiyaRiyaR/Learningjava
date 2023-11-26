package arrayAssignment;

import java.util.Scanner;

public class ProductLists {

	String[] samsung = { "S20", "S21", "Flip3", "Fold3" };
	String[] google = { "GooglePixel6", "GooglePixel6Pro ", "GooglePixelPro", "GooglePixel5" };
	String[] apple = { "Iphone12", "Iphone SE", "Iphone15", "Iphone13" };

	Scanner sc = new Scanner(System.in);

	void findProduct() {

		System.out.println("enter a product which you want to display:");
		String product = sc.next();
		boolean findProduct = false;
		for (int i = 0; i < samsung.length; i++) {
			if (samsung[i].equals(product)) {
				System.out.println("product selected is : " + product);
				findProduct = true;
				break;
			}
		}

		for (int j = 0; j < google.length; j++) {
			if (google[j].equals(product)) {
				System.out.println("product selected is : " + product);
				findProduct = true;
				break;
			}
		}
		for (int k = 0; k < apple.length; k++) {
			if (apple[k].equals(product)) {
				System.out.println("product selected is : " + product);
				findProduct = true;
				break;
			}
		}
		if (!findProduct) {
			System.out.println("Please select a product from the list");
		}
	}

}
