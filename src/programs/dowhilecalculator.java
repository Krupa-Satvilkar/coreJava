package programs;

import java.util.Scanner;

public class dowhilecalculator {
	public static void main(String[] args) {
		float a, b, res;
		char choice, ch;
		
		Scanner scanner;
		scanner = new Scanner(System.in);
//		System.out.println("Enter two integers");
//		a = scanner.nextInt();
//		b = scanner.nextInt();
		
		do
		{
			System.out.println("\n\nMain Menu: \n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit\n");
			System.out.println("Enter your choice: ");
			choice = scanner.next().charAt(0);
		
		
			switch(choice){
			case '1':
				System.out.println("Enter two number");
				a = scanner.nextFloat();
				b = scanner.nextFloat();
				res = a+b;
				
				System.out.format("Result: "+res);
				break;
			case '2':
				System.out.println("Enter two number");
				a = scanner.nextFloat();
				b = scanner.nextFloat();
				res = a-b;
				
				System.out.format("Result: "+res);
				break;
			case '3':
				System.out.println("Enter two number");
				a = scanner.nextFloat();
				b = scanner.nextFloat();
				res = a*b;
				
				System.out.format("Result: "+res);
				break;
			case '4':
				System.out.println("Enter two number");
				a = scanner.nextFloat();
				b = scanner.nextFloat();
				res = a/b;
				
				System.out.format("Result: "+res);
				break;
			case '5':
				System.exit(0);
				break;
			default:
				System.out.println("wrong choice\n");
				break;
			}
		}
		while(choice!=5);
	
	}
}
