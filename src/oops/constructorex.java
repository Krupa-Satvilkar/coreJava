package oops;

public class constructorex {
	String name ;
	String city;
	int rollno;
	String course;
	public constructorex() {
		System.out.println("Default");
		name = "Krupa";
	}
	constructorex(String c){
		city = c;
		System.out.println("I stay in "+city);
	}
	constructorex(int r, String cr){
		rollno = r;
		course= cr;
		System.out.println("My Roll number is "+rollno +" and I am enrolled in "+course);
	}
	
	constructorex(constructorex a){
		System.out.println("Copy Constructor");
		rollno = a.rollno;
		course = a.course;
		System.out.println("Copy 1 My Roll number is "+a.rollno +" and I am enrolled in "+a.course);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructorex c= new constructorex();
		System.out.println("My name is "+c.name);
		constructorex c1 = new constructorex("Mumbai");
		constructorex c2 = new constructorex(57,"BE Comp");
		constructorex c3 = new constructorex(c2);
		System.out.println("Copy My Roll number is "+c3.rollno +" and I am enrolled in "+c3.course);
	}

}
