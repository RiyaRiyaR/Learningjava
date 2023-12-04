package assignmentArray2;

public class MaxNumber {

	int[] number= {10,6,78,87,676,787,345,65,78};
	
	void maximum() {
	
		int maxValue=0;
		for(int i=0;i<number.length;i++) {
			if(number[i]> maxValue) {
				maxValue= number[i];
				
			}
		}System.out.println("maximum number in given array is"+maxValue);
	
	}
	
}
