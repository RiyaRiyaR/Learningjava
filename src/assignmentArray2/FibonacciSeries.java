package assignmentArray2;

public class FibonacciSeries {

	int  n = 15, 
			firstTerm = 0, 
			secondTerm = 1;		
	void checkFibonacciSeries() {
		
    System.out.println("Fibonacci Series till " + n + " terms:");

    int i= 1;
    while (i <= n) {
      System.out.print(firstTerm + ", ");

      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;

      i++;
    }
  }
}
	
