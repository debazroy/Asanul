package SuperKeyword;

public class B extends A {
	
	int x = 5;
	
	
	@Override
	void display() {
		super.display();
		System.out.println("im from B class "+super.x);
	}
	

}
 