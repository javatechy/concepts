package mcq;

//filename Main.java  

//https://www.geeksforgeeks.org/output-of-java-program-set-3/

//filename: Test2.java 
class Test1 {
	Test1(int x) {
		System.out.println("Constructor called " + x);
	}
}

// This class contains an instance of Test1
public class Geek2 {
	Test1 t1 = new Test1(10);

	Geek2(int i) {
		t1 = new Test1(i);
	}

	public static void main(String[] args) {
		Geek2 t2 = new Geek2(5);
	}
}
