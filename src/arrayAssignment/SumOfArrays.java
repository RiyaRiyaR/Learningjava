package arrayAssignment;

public class SumOfArrays {

	int[] numbers = { -40, -5, 1, 3, 6, 7, 8, 20 };
	int sum;

	/*You are given a array of integer. You need to find all numbers whose sum is 15
	array[]={ -40, -5, 1, 3, 6, 7, 8, 20 };
	Pair of elements whose sum is equal to 15 :  7, 8 and -5, 20*/

	void pairOfArrays() {
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {

				if (numbers[i] + numbers[j] == sum) {
					System.out.println("the sum of elements (" + numbers[i] + "," + numbers[j] + ") is 15");
				}

			}
		}
	}
}
