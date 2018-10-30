package mcq;

/**
 * 
 * @author deepak
 *
 */

public class InnerClass2 {
	private int data = 10;

	class Inner {
		private int data = 20;

		private int getData() {
			return data;
		}

		public void main(String[] args) {
			Inner inner = new Inner();
			System.out.println(inner.getData());

		}
	}

	private int getData() {
		return data;
	}

	public static void main(String[] args) {
		InnerClass2 outer = new InnerClass2();
		// Inner class is not static therefore needs to call from object.
		InnerClass2.Inner inner = outer.new Inner();
		System.out.printf("%d", outer.getData());
		inner.main(args);
	}
}