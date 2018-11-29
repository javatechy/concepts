package tetris;

public class TertrisGame {

	private static volatile TertrisGame instance;
	private static Object mutex = new Object();

	private TertrisGame() {
	}

	public static TertrisGame getInstance() {
		TertrisGame result = instance;
		if (result == null) {
			synchronized (mutex) {
				result = instance;
				if (result == null)
					instance = result = new TertrisGame();
			}
		}
		return result;
	}

}
