package mcq;

/**
 * 
 * A non-static variable can not be accessed in static nested inner class.
 * “Nested” cannot access non-static variables[variable s in this case].
 * Therefore the error:
 * 
 * @author deepak
 *
 */
public class Geek12 {

	private static int value = 20;
	public int s = 15;
	public static int temp = 10;

	public static class Nested {
		private void display() {
			// Cannot access non static varaible
			// System.out.println(temp + s + value);
			System.out.println(temp + value);
		}
	}

	public static void main(String args[]) {
		Geek12.Nested inner = new Geek12.Nested();
		inner.display();
	}
}

// Possible
// Access modifier of NestedInterface can only be public. Therefore the error:
interface ParentInterface {
	public int calculate();

	// Error
	// protected interface NestedInterface {
	interface NestedInterface {
		public void nested();
	}
}