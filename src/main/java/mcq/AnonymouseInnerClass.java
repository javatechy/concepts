package mcq;

/**
 * 
 * @author deepak
 *
 */

interface Anonymous {
	public int getValue();
}

public class AnonymouseInnerClass {
	private int data = 15;

	public static void main(String[] args) {
		Anonymous inner = new Anonymous() {
			int data = 5;

			public int getValue() {
				return data;
			}

			// Cannot define a new Anonymous class
			// public int getData() {
			// return data;
			// }
		};
		AnonymouseInnerClass outer = new AnonymouseInnerClass();
		// System.out.println(inner.getValue() + inner.getData() + outer.data);
		System.out.println(inner.getValue() + outer.data);
	}
}