package programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class buffer {

	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name");
		String name = br.readLine();
		
		System.out.println("My name is:" +name);
		int a = Integer.parseInt(br.readLine());
		System.out.println("My name is:" +a);
	}
	
}
