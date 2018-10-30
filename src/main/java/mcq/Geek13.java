package mcq;

import java.io.IOException;

/**
 * 
 * If the superclass method declares an exception, subclass overridden method
 * can declare same, subclass exception or no exception but cannot declare
 * parent exception
 * 
 * @author deepak
 *
 */

class Test {
	public void display() throws IOException {
		System.out.println("Test");
	}

}

public class Geek13 extends Test {
	// Error:
	// public void display() throws Exception {
	public void display() throws IOException {

		System.out.println("Derived");
	}

	public static void main(String[] args) throws IOException {
		Geek13 object = new Geek13();
		object.display();
	}
}