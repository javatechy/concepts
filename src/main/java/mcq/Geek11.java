package mcq;

/**
 * 
 * When Garbage Collector calls finalize() method on an object, it ignores all
 * the exceptions raised in the method and program will terminate normally.
 * 
 * @author deepak
 *
 */
public class Geek11 {

	public static void main(String[] args) throws Exception {
		Geek11 t = new Geek11();

		// making t eligible for garbage collection
		t = null;

		// calling garbage collector
		System.gc();
		throw new Exception();

		// waiting for gc to complete

	}

	@Override
	protected void finalize() {
		System.out.println("finalize method called");
		System.out.println(10 / 0);
	}
}