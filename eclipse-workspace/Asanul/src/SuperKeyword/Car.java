package SuperKeyword;

public class Car extends Vehicle {
	
	int gear;

	Car(String c, double w, int g) {
		super(c, w);
		gear = g;
	}
	
	@Override
	void atributes() {
		super.atributes();
		System.out.println("this is car class "+gear);
	}

	
}
