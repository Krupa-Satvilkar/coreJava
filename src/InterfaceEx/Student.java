package InterfaceEx;

public class Student {
	
	String name;
	int rollno, Marks1, Marks2;
	Student(String n, int rno, int m1, int m2){
		name= n;
		rollno= rno;
		Marks1= m1;
		Marks2= m2;
		
	}

	void show() {
		
		System.out.println("Student Name: "+name);
		System.out.println("Roll no: "+rollno);
		System.out.println("Marks of Subject 1: "+Marks1);
		System.out.println("Marks of Subject 2: "+Marks2);
		
		
		
	}
	
	public void Percent_cal() {
		// TODO Auto-generated method stub
		
		}


}
