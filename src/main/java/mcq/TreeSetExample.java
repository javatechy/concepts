package mcq;

import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

/**
 * 
 * A TreeSet sorts the data in ascending order that is inserted in it.
 * Therefore, the output string contains all the strings arranged in ascending
 * order. A TreeSet does not contain any duplicate element as it is a set. So in
 * the output, there is just a single occurance of string ‘Geeks’.
 * 
 * @author deepak
 *
 */

public class TreeSetExample {
	public static void main(String[] args) throws IOException {

		treeSetExample();

		listExample();
		hashSetTest();
	}

	private static void treeSetExample() {
		TreeSet<String> treeSet = new TreeSet<>();

		treeSet.add("Geeks");
		treeSet.add("for");
		treeSet.add("Geeks");
		treeSet.add("GeeksforGeeks");

		for (String temp : treeSet)
			System.out.printf(temp + " ");

		System.out.println("\n");
	}

	/**
	 * list1.removeAll(list2) function deletes all the occurance of string in list2
	 * from list1. Here, the string ‘Geeks’ appears in list2, so all the nodes of
	 * linked list in list1 that contains ‘Geeks’ as its data is removed from list1.
	 */
	private static void listExample() {
		List<String> list1 = new LinkedList<>();
		list1.add("Geeks");
		list1.add("for");
		list1.add("Geeks");
		list1.add("GFG");
		list1.add("GeeksforGeeks");

		List<String> list2 = new LinkedList<>();
		list2.add("Geeks");

		list1.removeAll(list2);

		for (String temp : list1)
			System.out.printf(temp + " ");

		System.out.println();
	}

	/**
	 * A HashSet is a set and as a set doesn’t contain any duplicate element
	 * therefore, the string ‘Geeks’ appears only once in the output.
	 */
	private static void hashSetTest() {
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("Geeks");
		hashSet.add("GeeksforGeeks");
		hashSet.add("Geeks");
		hashSet.add("for");

		System.out.println(hashSet);
	}
}