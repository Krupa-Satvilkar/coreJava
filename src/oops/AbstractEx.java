package oops;

 abstract class Bike{
	abstract void speed();
	void display() {
		System.out.println("Bike Class");
	}
}

class Motorbike extends Bike{
	
	@Override
	void speed() {
		System.out.println("Motor Bike");
	}
}

public class AbstractEx extends Bike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractEx a = new AbstractEx();
		a.display();
		a.speed();
		Motorbike m = new Motorbike();
		m.speed();
		
	}
	@Override
	void speed() {
		System.out.println("Nice Bike");
	}
}
