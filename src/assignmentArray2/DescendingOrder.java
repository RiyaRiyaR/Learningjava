package assignmentArray2;

import java.util.Arrays;

public class DescendingOrder {

	long[] number = { 5, 2, 23, 14, 85, 99, 53, 20, 1 };

	void checkOrder() {

		long temp = 0; // Temporary variable to store the element
		for (int i = 0; i < number.length; i++) {

			for (int j = i + 1; j < number.length; j++) {

				if (number[i] < number[j]) {
					temp = number[i];
					number[i] = number[j];
					number[j] = temp;

				}
			}

		}
		System.out.println("Elements of array sorted in descending order: \n" + Arrays.toString(number));

	}

}