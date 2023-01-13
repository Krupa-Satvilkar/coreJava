package programs;

import java.util.Arrays;

public class stringoperations {
	
	public static void main(String[] args) {
		System.out.println();
		String s1 = new String("Hello");
		String s2 = new String("Krupa");
		String s = "HELLO   .s";
		String s3 = new String("My name is ");
		System.out.println(s1+" "+s2);
		System.out.println(s3.concat(s2));
		System.out.println("Length: "+s3.length());
		System.out.println("Substring : "+s3.substring(4,7));
		System.out.println("Upper case : "+s2.toUpperCase());
		System.out.println("Lower case : "+s2.toLowerCase());
		java.lang.String s4 = "";
		System.out.println("to check a null : "+s4.isBlank());
		char[] arr = new char[10];
		s3.getChars(0,10,arr,0);
		System.out.println("GetChars : "+Arrays.toString(arr));
		System.out.println("Comparision "+s.compareTo(s1));
		System.out.println("Equals "+s1.equalsIgnoreCase(s));
		System.out.println("StartWith "+s1.startsWith("He"));
		System.out.println("EndsWith"+s1.endsWith("p"));
		System.out.println("Replace "+s2.replace("Krupa","Satvilkar Krupa"));
		System.out.println("Repeat: "+s.repeat(6));
		System.out.println("CharAt : "+s3.charAt(0));
		System.out.println("Trim Lead : "+s.stripLeading());
		System.out.println("Trim Trail : "+s.stripTrailing());
		System.out.println("Contains : "+s.contains("H"));
	}
}
