package inheritance;
class Student{
	int sid= 10;
	void display() {
		System.out.println("Rollno: "+sid);
	}
}
class Engg extends Student{
	String spec = "Comp";
	void displaySpe() {
		System.out.println("Specialiation: "+spec);
	}
}

public class singleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engg e = new Engg();
		e.display();
		e.displaySpe();
		
	}

}
