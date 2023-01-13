package inheritance;

import java.util.Scanner;

class Addition
{
	int a,b ;
	Scanner s = new Scanner(System.in);
	void getValues() {
		System.out.println("Enter two numbers : ");
		a = s.nextInt();
		b = s.nextInt();
	}
	void add()
	{
		System.out.println("Addition is "+(a+b));
	}
}

class Subtract extends Addition
{
	void sub()
	{
		System.out.println("Subtraction is "+(a-b));
	}
}

class Multiply extends Subtract
{
	void mul()
	{
		System.out.println("Multiplication is "+(a*b));
	}
}
class Divide extends Multiply
{
	void div()
	{
		System.out.println("Division is "+(a/b));
	}
}

public class multileveladdsub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Divide d = new Divide();
		d.add();
		d.sub();
		d.mul();
		d.div();
		
	}

}
