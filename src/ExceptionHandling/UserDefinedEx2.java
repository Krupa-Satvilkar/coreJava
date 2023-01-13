package ExceptionHandling;
import java.lang.*;
import java.util.jar.JarException;

class MyException extends Exception{
	private int ex;
	MyException(int a)
	{
		ex = a;
	}
	public String tostring()
	{
		return "MyException["+ex+"] is less than zero";
	}
}
class UserDefinedEx2 {
	static void sum(int a, int b) throws MyException
	{
		if(a<0)
		{
			throw new MyException(a);
		}
		else
		{
			System.out.println(a+b);
		}
	
	public static void main(String[] args) {
		try
		{
			sum(-10,10);
		}
		catch(JarException me)
		{
			System.out.println(me);
		}
		
	

}
}
}