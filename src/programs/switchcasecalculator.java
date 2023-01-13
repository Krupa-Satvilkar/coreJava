package programs;

import java.util.Scanner;

public class switchcasecalculator {
	public static void main(String[] args) {
		int a, b;
		Scanner scanner;
		scanner = new Scanner(System.in);
		System.out.println("Enter two integers");
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		System.out.println("enter the operator");
		char op = scanner.next().charAt(0);
		switch(op){
		case '+':
			System.out.format("%d + %d = %d \n",a,b,a+b);
			break;
		case '-':
			System.out.format("%d - %d = %d \n",a,b,a-b);
			break;
		case '*':
			System.out.format("%d * %d = %d \n",a,b,a*b);
			break;
		case '/':
			System.out.format("%d / %d = %d \n",a,b,a/b);
			break;
		default:
			System.out.println("Invalid operator");
			break;
		}
	}
}
