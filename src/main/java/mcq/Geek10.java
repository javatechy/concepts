package mcq;

/**
 * 
 * When Garbage Collector calls finalize() method on an object, it ignores all
 * the exceptions raised in the method and program will terminate normally.
 * 
 * @author deepak
 *
 */
public class Geek10 {

	public static void main(String[] args) throws Exception {
		try {
			System.out.println("Before Finally");
			// System.exit(0);
			return;
		} finally {

			System.out.println("Finally");
		}
	}

}