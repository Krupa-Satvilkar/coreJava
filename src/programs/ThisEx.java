package programs;

public class ThisEx {
	
	String name;

	/*
	 * public ThisEx(String name) { super(); this.name= name;
	 * System.out.println("Name is "+this.name); }
	 */
	
	public String getName() {
		return name;
	}
	public void getName(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisEx t = new ThisEx();
		t.getName("ABC");
		System.out.println("Object t "+t.getName());
	}

}
