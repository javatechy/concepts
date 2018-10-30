package mcq;

/**
 * static initialization block is the only place where an instance of Echo is
 * created. Then the Echo instance is created, Echos no-arg constructor calls
 * its 1-arg constructor, which then calls Vibrates constructor (which then
 * secretly calls Objects constructor). At that point, the various constructors
 * execute, starting with Objects constructor and working back down to Echos
 * no-arg constructor
 * 
 * @author deepak
 *
 */
abstract class Vibrate {
	static String s = "-";

	Vibrate() {
		s += "v";
	}
	Vibrate(int a) {
		s += "v";
	}
}

public class Geek14 extends Vibrate {
	Geek14() {
		this(7);
		s += "e";
	}

	Geek14(int x) {
		s += "e2";
	}

	public static void main(String[] args) {
		System.out.print("made " + s + " ");
	}

	static {
		Geek14 e = new Geek14();
		System.out.print("block " + s + " ");
	}
}