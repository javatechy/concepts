package mcq;

/**
 * In case of method overloading, the most specific method is chosen at compile
 * time. As ‘java.lang.String’ is a more specific type than ‘java.lang.Object’.
 * In this case the method which takes ‘String’ as a parameter is choosen.
 * 
 * https://www.geeksforgeeks.org/output-of-java-program-set-5-2/
 * 
 * @author deepak
 *
 */
public class Geek4 {

	public static void main(String args[]) {
		short s = 0;
		int x = 07;
		int y = 8;
		int z = 112345;

		s += z;
		System.out.println("::" + x + y + s);
	}
}
