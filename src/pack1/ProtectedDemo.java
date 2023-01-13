package pack1;
class ProtectClass{
	int a = 10;
	protected void display() {
		System.out.println("ProtectedClass "+a);
	}
}
public class ProtectedDemo {
	public static void main(String[] args) {
		ProtectClass p = new ProtectClass();
		p.display();
	}
}
