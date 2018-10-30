package mcq;

/**
 * append(String str) method,concatenate the str to s1. The substring(int index)
 * method return the String from the given index to the end. But as there is no
 * any String variable to store the returned string,so it will be destroyed.Now
 * indexOf(String s2) method return the index of first occurrence of s2. So 4 is
 * printed as s1=”JavaLove”.
 * 
 * 
 * https://www.geeksforgeeks.org/output-java-program-set-7/
 * 
 * @author deepak
 *
 */
public class Geek6 {

	public static void main(String args[]) {
		StringBuilder s1 = new StringBuilder("Java");
		String s2 = "Love";
		s1.append(s2);
		System.out.println(s1);
		s1.substring(4);
		System.out.println(s1);
		int foundAt = s1.indexOf(s2);
		System.out.println(foundAt);
	}
}
