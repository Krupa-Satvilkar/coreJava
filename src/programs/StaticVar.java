package programs;
class Student
{
	int rollNo;
	String name;
	static String courseName;
}
class StaticVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		Student.courseName = "Java Full Stack";
		
		s1.rollNo=1;
		s1.name= "Krupa";
		
		s2.rollNo=2;
		s2.name="Akansha";
		
		s3.rollNo=3;
		s3.name="Sakshi";
		
		System.out.println("S1 roll No. = "+s1.rollNo+" S1 name = "+s1.name+"S1 course name = "+s1.courseName);
		System.out.println("S2 roll No. = "+s2.rollNo+" S2 name = "+s2.name+"S2 course name = "+s2.courseName);
		System.out.println("S3 roll No. = "+s3.rollNo+" S3 name = "+s3.name+"S3 course name = "+s3.courseName);

		s2.courseName = "Python";
		s2.name= "ABC";
		
		System.out.println("S1 roll No. = "+s1.rollNo+" S1 name = "+s1.name+"S1 course name = "+s1.courseName);
		System.out.println("S2 roll No. = "+s2.rollNo+" S2 name = "+s2.name+"S2 course name = "+s2.courseName);
		System.out.println("S3 roll No. = "+s3.rollNo+" S3 name = "+s3.name+"S3 course name = "+s3.courseName);
	}

}
