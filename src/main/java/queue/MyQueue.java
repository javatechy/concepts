package queue;

public class MyQueue {
	private Integer[] arr;
	private int index;

	public MyQueue(int size) {
		arr = new Integer[size];
	}

	public void enqueue(Integer obj) {
		if (index == arr.length)
			throw new RuntimeException("Full call deque");
		arr[index] = obj;
		index++;
	}

	public boolean isEmpty() {
		return index == 0;
	}

	public Integer dequeue() {
		if (isEmpty())
			throw new RuntimeException("Empty ");
		int obj = arr[0];
		for (int i = 0; i < index - 1; i++)
			arr[i] = arr[i + 1];	
		this.index--;
		return obj;
	}

}
