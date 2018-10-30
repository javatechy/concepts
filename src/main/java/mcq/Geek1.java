package mcq;

//filename Main.java  
/**
 * https://www.geeksforgeeks.org/output-of-java-program-set-1/
 * https://www.geeksforgeeks.org/output-of-java-program-set-2/
 * 
 * @author deepak
 *
 */
class Point {
	protected int x, y;

	Point() {
	}

	// Always define default constructor when defining parameterized one 
	Point(int _x, int _y) {
		x = _x;
		y = _y;
	}
}

public class Geek1 {
	public static void main(String args[]) {
		Point p = new Point();
		System.out.println("x = " + p.x + ", y = " + p.y);
	}
}
