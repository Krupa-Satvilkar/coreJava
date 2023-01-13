package patterns;

import java.util.Scanner;

public class lefttriangle {
	public static void main(String[] args) {
//		*
//		* *
//		* * *
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++)   
		{   
			for(int j=0; j<=i; j++)   
			{   
				System.out.print("* ");   
			}   
			System.out.println();   
		}
		
		//***
		//**
		//*
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int n1 = sc1.nextInt();
		
		for(int i=n1-1; i>=0; i--)   
		{   
			for(int j=0; j<=i; j++)   
			{   
				System.out.print("* ");   
			}   
			System.out.println();   
		}
		
//		1
//		23
//		456
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int n2 = sc2.nextInt();
		int k = 1;
		for (int i = 1; i<=n2; i++) {
            for (int j=1; j<i+1; j++) {
                System.out.print(k++ + " ");
            }
   
            System.out.println();
        }
//		
//		A 
//		A B 
//		A B C 
//		A B C D 
//		A B C D E 
//		A B C D E F
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int n3 = sc3.nextInt();
		int alphabet = 65;
        for (int i = 0; i <= n3-1; i++)
		{
		    for (int j = 0; j <= i; j++)
		    {
		        System.out.print((char) (alphabet + j) + " ");
		    }
		    System.out.println();
		}
        
        	}
}	

