package programs;

import java.util.Scanner;

public class primenumber {
	public static void main(String[] args) {
		//Check number is prime or not
		Scanner scanner;
		scanner = new Scanner(System.in);
		int num;
		
		System.out.println("Enter the number: ");
		num = scanner.nextInt();
	    boolean isprime = false;
	    for (int i = 2; i <= num / 2; ++i)
	    {  
	    	if (num % i == 0)
	    	{
	    		isprime = true;
		        break;
	        }
	    }

	    if (isprime==false)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	  
	  //Print Prime number from 1 to 50

	    int n = 50, count;

	    for (int i = 1; i <= n; i++)
	    {
	    	count = 0;
	    	for (int j = 2; j <= i / 2; j++)
	    	{
	    		if (i % j == 0)
	    		{
	    			count++;
	    			break;
    			}
    		}
	    	if (count == 0)
	    	{
	    		System.out.println(i);
    		}

	    }
	    
	}
	
	
	}
