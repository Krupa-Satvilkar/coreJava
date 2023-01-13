package InterfaceEx;

public class Result extends Student implements Exam {

	float per;
	Result(String n, int rno, int m1, int m2) {
		super(n, rno, m1, m2);
		// TODO Auto-generated constructor stub
	}
	
	public void Percent_cal() {
		int Total = Marks1 + Marks2;
		per = (float)Total/2;
		
	}
	
	void display() {
		show();
	
		System.out.println("Percentage = "+per);
	}

 public static class StudentInfo{
	
	public static void main(String[] args) {
		Result r = new Result("Krupa", 57, 90, 95);
		r.Percent_cal();
		r.display();
		
	}
	
}
	
}
