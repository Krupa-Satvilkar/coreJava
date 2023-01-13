package programs;

class Static1 {
	static int a,b;
	static String n;
	static void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(n);
	}
}
public class Static {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static1.a=10;
		Static1.b=20;
		Static1.n="abc";
		Static1.display();
	}

}
