
public class Strings {
	public static void main(String[] args) {
		
		// String literal
		String name = "Max William";
		
		String s2 = new String("something");
		
		// char array
		char[] c = {'R', 'A', 'H', 'U', 'L' };
		String s3 = new String(c);
		
		byte[] b = {84,69,68,68,89};
		String s4 = new String(b);
		
		System.out.println("Name: " + name);
		System.out.println("Length of Name: " + name.length());
		
		System.out.println(s3);
		
		System.out.println(s4);
		
	}

}
