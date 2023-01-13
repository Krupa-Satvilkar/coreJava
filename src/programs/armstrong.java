package programs;

import java.util.Scanner;

public class armstrong {
	public static void main(String[] args)
    {	
		Scanner scanner;
		scanner = new Scanner(System.in);
		int num;
		
		System.out.println("Enter the number: ");
		num = scanner.nextInt();
        //int n = 153;
        int temp = num;
        int p = 0;
 
        while (num > 0) {
 
            int rem = num % 10;
            p = (p) + (rem * rem * rem);
            num = num / 10;
        }
 
        if (temp == p) {
            System.out.println("Yes. It is Armstrong No.");
        }
        else {
            System.out.println(
                "No. It is not an Armstrong No.");
        }
    }
}

