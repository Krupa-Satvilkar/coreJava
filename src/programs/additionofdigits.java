package programs;

import java.util.Scanner;

public class additionofdigits {
	public static void main (String[] args) {
		Scanner scanner;
		scanner = new Scanner(System.in);
		int num;
		int sum =0;
		System.out.println("Enter the number: ");
		num = scanner.nextInt();
		while(num>0)
		{
			int rem=num%10;
			sum= sum+rem;
			num=num/10;
		}
		System.out.println("Sum of Digits : "+sum);
		
		//Reverse of string
		System.out.println("Reverse of string");
		Scanner scanner1;
		scanner1 = new Scanner(System.in);
		String numb, nstr="";
		char ch;
		System.out.println("Enter the string: ");
		numb = scanner1.next();
		
		for (int i=0; i<numb.length(); i++)
	      {
	        ch= numb.charAt(i); 
	        nstr= ch+nstr; 
	      }
	      System.out.println("Reversed word: "+ nstr);
	      
//Palindrome
	    System.out.println("Palindrome program");
	    Scanner scanner2;
		scanner2 = new Scanner(System.in);
		String str,  reverseStr = "";
		
		System.out.println("Enter the string: ");
		str = scanner2.next();
		int strLength = str.length();
		
		for (int i = (strLength - 1); i >=0; --i) {
		      reverseStr = reverseStr + str.charAt(i);
		    }

		    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
		      System.out.println(str + " is a Palindrome String.");
		    }
		    else {
		      System.out.println(str + " is not a Palindrome String.");
		    }
		//FIBONACCI
		System.out.println("FIBONACCI of 10 count");
	    int n1=0,n2=1,n3,i,count=10;    
	    System.out.print(n1+" "+n2);   
	       
	    for(i=2;i<count;++i)    
	    {    
	     n3=n1+n2;    
	     System.out.print(" "+n3);    
	     n1=n2;    
	     n2=n3;    
	    } 
	    
	    //FACTORIAL
	    System.out.println("/nFACTORIAL of the number");
	    int j,fact=1; 
	    int number;
	    Scanner scanner3;
	    scanner3 = new Scanner(System.in);
	    System.out.println("Enter the number: ");
		number = scanner3.nextInt();    
	    for(j=1;j<=number;j++){    
	        fact=fact*j;    
	    }    
	    System.out.println("Factorial of "+number+" is: "+fact);    
     
	    //Swapping Numbers
	    System.out.println("SWAPPING NUMBERS");
	    int x, y, temp;// x and y are to swap   
       Scanner sc = new Scanner(System.in);  
       System.out.println("Enter the value of X and Y");  
       x = sc.nextInt();  
       y = sc.nextInt();  
       System.out.println("before swapping numbers: "+x +"  "+ y);  
       
       temp = x;  
       x = y;  
       y = temp;  
       System.out.println("After swapping: "+x +"   " + y);  
       System.out.println( ); 
       
       
       //Swapping without 3rd variable
       System.out.println("SWAPPING WITHOUT 3RD VARIABLE");
       System.out.println("Enter the value of x and y");  
       Scanner sc1 = new Scanner(System.in);  
       /*Define variables*/  
       int x1 = sc1.nextInt();  
       int y1 = sc1.nextInt();  
       System.out.println("before swapping numbers: "+x1 +" "+ y1);  
      /*Swapping*/  
       x1 = x1 + y1;   
       y1 = x1 - y1;   
       x1 = x1 - y1;   
       System.out.println("After swapping: "+x1 +"  " + y1);   
	}
}
