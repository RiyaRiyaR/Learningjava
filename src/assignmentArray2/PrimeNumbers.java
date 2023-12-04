package assignmentArray2;

import java.util.Scanner;

public class PrimeNumbers {
	
	int num;
	Scanner sc= new Scanner(System.in);
    boolean isNumberPrime = false;
    void checkPrimeNumber() {
    	System.out.println("enter a number");
    	num= sc.nextInt();
    for (int i = 2; i <= num / 2; i++) {
      // condition for non prime number
      if (num % i == 0) {
        isNumberPrime = true;
       break;
      }
    }

    if (!isNumberPrime) {
      System.out.println(num + " is a prime number.");}
    else {
      System.out.println(num + " is not a prime number.");
  
}
		
		
	}

}
