package mcq;

class One implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}

class Two implements Runnable {
	public void run() {
		new One().run();
		new Thread(new One(), "gfg2").run();
		new Thread(new One(), "gfg3").start();
	}
}

public class Geek8 {
	public static void main(String[] args) {
		new Thread(new Two(), "gfg1").start();
	}
}