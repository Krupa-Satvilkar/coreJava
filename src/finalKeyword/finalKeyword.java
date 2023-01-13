package finalKeyword;

final class nonExtendable {
		}
	class Test {
	 final int testVar = 10;
		
	 final void testMethod() {
	  System.out.println("This is a Final method!");
	 }
	}

	class Test2 extends Test {
	
	}
	

	public class finalKeyword {
	 public static void main(String[] args) {
	  Test testObj = new Test();
	  	 }
	}