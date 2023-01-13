package oops;

public class methodOverloading {
	int add(int a, int b) {
		return(a+b);
	}
	int add(int a) {
		return (a++);
	}
	int add(int a , int b, int c) {
		return (a+b+c);
	}
	void sub(int a , int b)
	{
		System.out.println(a-b);
	}
	public static void main(String[] args) {
		methodOverloading m = new methodOverloading();
		
		int a = m.add(5,5);
		System.out.println(a);
		System.out.println(m.add(5,5));
		
		m.sub(5, 2);
		System.out.println("one parameter : "+m.add(5));
		System.out.println("two parameter : "+m.add(5,6));
		System.out.println("three parameter : "+m.add(5,6,7));
		
	}

}
