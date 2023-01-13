package programs;

//import java.lang.Exception;
//import java.util.Scanner;

//class MinimumAccountBalance extends Exception{
//	String message;
//	private String message;
//	public MinimumAccountBalance(String message) {
//		this.message = message;
//	}
//	@Override
//	public String toString() {
//		return message;
//	}
//	public void printStackTrace() {
//		// TODO Auto-generated method stub
//		
//	}
//}
class Learner {
	private String fname;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	private String lname;
}
class LearnerNameException extends Exception{
	public LearnerNameException(String s){
		super(s);
	}
}
public class LearnerUserDefinedException {
	void checkName(String fname, String lname) throws LearnerNameException
	{
		if((fname.isEmpty()) && (lname.isEmpty())) {
			throw new LearnerNameException("Empty");
		}
		else if(fname.isEmpty()) {
			throw new LearnerNameException("fName is blank ");
		}
		else if(lname.isEmpty()) {
			throw new LearnerNameException("lName is blank ");
		}
		else {
			System.out.println(fname +" "+lname);
		}
	}
	public static void main(String[] args) {
		Learner l = new Learner();
		l.setFname("Krupa");
		l.setLname("Satvilkar");
		
		LearnerUserDefinedException lu = new LearnerUserDefinedException();
		try {
			lu.checkName(l.getFname(), l.getLname());
		}catch(LearnerNameException e){
			e.printStackTrace();
		}
		
	}
}
