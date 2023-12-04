package assignmentArray2;

import java.util.Arrays;

public class SortingArray {

	int[] numbers = { 8, 2, 7, 3, 1, 5 };

	/*Write a program to sort an array of number.*/
	
	void sortAnArray() {

		System.out.println("Sorted Numbers:");
		for (int i = 0; i < numbers.length; i++) {
			Arrays.sort(numbers);
		}
		System.out.println(Arrays.toString(numbers));
	}
}
