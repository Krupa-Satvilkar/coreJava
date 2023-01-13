package programs;

import java.util.Scanner;

public class switchgrading {
	public static void main(String[] args) {
		int percent;
		int pointer;
		Scanner scanner;
		scanner = new Scanner(System.in);
		System.out.println("Enter Percentage of Student");
		percent = scanner.nextInt();
		pointer = percent/10;
		
		switch(pointer){
		case 10:
		case 9:
			System.out.format("O grade");
			break;
		case 8:
			System.out.format("A grade");
			break;
		case 7:
			System.out.format("B grade");
			break;
		case 6:
			System.out.format("C grade");
			break;
		case 5:
			System.out.format("D grade");
			break;
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			System.out.println("Fail");
			break;
		default:
			System.out.println("Invalid percentage");
			break;
		}
}
}