package assignmentArray2;

public class SecondHighestNumber {

	/* Write a Java Program to find the second-highest number in an array */

	int[] numbers = { 23, 14, 56, 77, 66, 67 };
	int highest = 0;
	int secondHighest = 0;

	void findSecondHighestNumber() {
		for (int i = 0; i < numbers.length; i++) {
			if (highest < numbers[i]) {
				secondHighest = highest;
				highest = numbers[i];
			} else if (secondHighest < numbers[i]) {
				secondHighest = numbers[i];
			}
		}

		System.out.println("the second highest number is " + secondHighest);
	}
}
