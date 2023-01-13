package pack1;
class DefaultClass{
	int a = 12;
	
	void display() {
		System.out.println("Default Class Variable "+a);
	}
}
class DefaultSub extends DefaultClass{
	
	void displaySub() {
		System.out.println("Default sub Class Variable ");
	}
	
}
public class DefaultDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DefaultClass d = new DefaultClass();
		DefaultSub d = new DefaultSub();
		d.display();
		d.displaySub();
	}

}
