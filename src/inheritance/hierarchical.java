package inheritance;
class Student1{
	int sid= 10;
	void display() {
		System.out.println("Rollno: "+sid);
	}
}
class Engg1 extends Student1{
	String spec = "Comp";
	void display() {
		System.out.println("Specialiation: "+spec);
	}
}
class Architect extends Student1{
	String spec = "Architecture";
	void display1() {
		System.out.println("Specialiation: "+spec);
	}
}
class Bsc extends Student1{
	String spec = "Bsc";
	void display2() {
		System.out.println("Specialiation: "+spec);
	}
}

public class hierarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engg1 e = new Engg1();
		e.display();
		Architect a = new Architect();
		a.display1();
		Bsc b = new Bsc();
		b.display2();
		e.display();
	}

}
