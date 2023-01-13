package programs;

public class ifelsemaxof3 {
	public static void main(String[] args) {
		int a= 5, b = 1, c = 4;
		if(c>=a && c>=b) {
			System.out.println(c+" is the largest");
		}
		else if(b>=a && b>=c) {
			System.out.println(b+" is the largest");
		}
		else {
			System.out.println(a+" is the largest");
		}
	}
}
