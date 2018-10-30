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
public class Geek3 {

	// Main.java
	public static void gfg(String s) {
		System.out.println("String");
	}

	public static void gfg(Object o) {
		System.out.println("Object");
	}

	/**
	 * Try uncommenting this
	 * 
	 * As ‘java.lang.String’ and ‘java.lang.Integer’ is a more specific type than
	 * ‘java.lang.Object’,but between ‘java.lang.String’ and ‘java.lang.Integer’
	 * none is more specific. In this case the Java is unable to decide which method
	 * to call.
	 * 
	 */
	/*
	 * public static void gfg(Integer i) { System.out.println("Integer"); }
	 *
	 */
	public static void main(String args[]) {
		gfg(null); // more specifice is choosen
	}
}
