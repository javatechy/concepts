package mcq;

/**
 * 
 * LocalClass() method defines a local inner class. This method creates an
 * object of class Inner and return the value of the variable data that resides
 * within it.
 * 
 * @author deepak
 *
 */

public class InnerClass {

	private static int data = 10;

	private static int LocalClass() {
		class Inner {
			public int data = 20;

			private int getData() {
				return data;
			}
		}
		Inner inner = new Inner();
		return inner.getData();
	}

	public static void main(String[] args) {
		System.out.println(data * LocalClass());
	}
}