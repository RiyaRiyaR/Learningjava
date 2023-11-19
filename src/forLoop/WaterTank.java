package forLoop;

public class WaterTank {
	
	void waterTankFilled() {
		int WaterInsideTank = 0 ;
		for(int i=0; i<10;i++) {
			System.out.println("no. of buckets filled inside"+i);
		WaterInsideTank+=10l;
		System.out.println("total water inside: " +WaterInsideTank +"litres");
		if(WaterInsideTank>100l) {
			System.out.println("tank is overflowing");
			break;
		}
		}
	}

}
