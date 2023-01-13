package oops;

public class StudEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student s = new Student();
//		s.setRno(57);
//		s.setName("Krupa");
//		s.setCity("Karjat");
//		System.out.println("Student roll no : "+s.getRno());
//		System.out.println("Student name : "+s.getName());
//		System.out.println("City : "+s.getCity());
//		
		
		Student s = new Student (34,"Krupa S", "Gzp");
		System.out.println("Student roll no : "+s.getRno());
		System.out.println("Student name : "+s.getName());
		System.out.println("City : "+s.getCity());
		
		s.setRno(23);
		System.out.println("Students roll no is : "+s.getRno());
		
	}

}
