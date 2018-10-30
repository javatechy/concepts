package mcq;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * The iterator() method returns an iterator over the elements in the list in
 * proper sequence, it doesn’t return a List or a ListIterator object. A
 * ListIterator can be obtained by invoking the listIterator method.
 * 
 * https://www.geeksforgeeks.org/output-java-program-set-6/
 * 
 * @author deepak
 *
 */
public class Geek5 {

	public static void main(String args[]) {
		Object i = new ArrayList().iterator();
		System.out.print((i instanceof List) + ", ");
		System.out.print((i instanceof Iterator) + ", ");
		System.out.print(i instanceof ListIterator);
	}
}
