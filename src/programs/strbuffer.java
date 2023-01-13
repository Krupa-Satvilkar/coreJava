package programs;

public class strbuffer {

	public static void main(String[] args) {
		String s = new String("Cooking ");
		s.concat("Pasta");
		System.out.println(s);
		
		StringBuffer str = new StringBuffer("Cooking ");
		str.append("Emerging ");
		System.out.println(str);
		str.insert(17, "Technology ");
		System.out.println(str);
		str.replace( 8, 16, "IoT");
		System.out.println(str);
		str.reverse();
		System.out.println(str);
		System.out.println(str.length());
		System.out.println( str.capacity() );
	}
}
