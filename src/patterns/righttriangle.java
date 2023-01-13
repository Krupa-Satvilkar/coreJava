package patterns;

import java.util.Scanner;

public class righttriangle {
	public static void mai(String[] args) {
		
//		****
//		 ***
//		  **
//		   *
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int n = sc.nextInt();
		for (int i=0; i<n; i++)   
		{  
			for (int j=2*(n-i); j>=0; j--)
			{
				System.out.print(" "); 
			}
			for (int k=0; k<=i; k++ )   
			{      
				System.out.print("* ");   
			}   
			System.out.println();   
		}   

	}
}
