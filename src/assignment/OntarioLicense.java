package assignment;

public class OntarioLicense {

	int age;
	String level;

	void OntarioLicense() {

		if (age>=16) {
			System.out.println("eligible to apply for license");
		}
	
		else if (age >= 16 && level == "G1") {
			System.out.println("G2 license will be issued");
		} else if (age >= 16 && level == "G2") {
			System.out.println("G license will be issued");
		} else if (age >= 16 && level == "G") {
			System.out.println("license already issued");
		}
		else {
			System.out.println("Not eligible for license");

		}
	}
}
