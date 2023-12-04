package assignmentArray2;

import java.util.ArrayList;

public class RepeatedNumbers {

	int[] numbers = { 12, 11, 40, 12, 5, 6, 5, 12, 11 };

	boolean ifPresent = false;

	ArrayList<Integer> al = new ArrayList<Integer>();

	void findDuplicates() {
		System.out.print("Repeating Elements are ");
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] == numbers[j]) {
					if (al.contains(numbers[i])) {
						break;
					} else {
						al.add(numbers[i]);
						ifPresent = true;
					}
				}
			}
		}
		if (ifPresent == true) {
			System.out.print(al + " ");
		} else {
			System.out.println("no duplicates present");
		}
	}
}
