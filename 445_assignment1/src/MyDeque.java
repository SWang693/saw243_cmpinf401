//Name: Sam
//Course 445
//Peoplesoft ID: 4550042
public class MyDeque<T> implements DequeInterface<T> {

	protected T[] data;
	protected int back;// index of logical back item in deque
	protected int size;
	protected int front;

	public MyDeque(int initcapacity) {// regular constructor for deque
		data = (T[]) new Object[initcapacity];
		front = 0;
		back = 0;
		size = 0;
	}

	public MyDeque(MyDeque<T> old) {// circular array copy constructor
		data = (T[]) new Object[old.capacity()];
		for (int i = 0; i < old.capacity(); i++) {

			data[i] = old.data[i];

		}
		front = old.front;
		back = old.back;
		size = old.size;
	}

	protected void doubleCapacity() {// doubles size of array and puts in new array based on old array front
		T[] newArray = (T[]) new Object[(capacity() * 2)];

		int oldArrayPos = front;
		for (int i = 0; i < data.length; i++) {

			newArray[i] = data[oldArrayPos];
			oldArrayPos++;
		}

		front = 0;
		back = size - 1;
		data = newArray;

	}

	public void addToFront(T newEntry) {// adds newEntry to

		if (size == data.length) {
			this.doubleCapacity();
			// resize if full
		}

		if (!isEmpty()) {
			if (front != 0) {
				front = front - 1;
			} else {// front goes to the end of the array
				front = data.length - 1;
			}

		}
		data[front] = newEntry;
		size++;
	}

	public void addToBack(T newEntry) {

		if (size == data.length) {
			this.doubleCapacity();
			// resize if full
		}
		if (!isEmpty()) {
			if (back != data.length - 1) {
				back = back + 1;
			} else {
				back = 0;
			}
		}
		data[back] = newEntry;
		size++;

	}

	public T removeFront() {// removeds item from front of deque and changes fron index
		T removedVar = null;
		if (!isEmpty()) {
			if (front != data.length) {
				removedVar = data[front];
				data[front] = null;
				front = front + 1;
				size--;
			} else {
				removedVar = data[front];
				data[front] = null;
				front = 0;
				size--;
			}
		}

		return removedVar;

	}

	public T removeBack() {// removed item from back of deque and changes back index
		T removedVar = null;
		if (!isEmpty()) {
			if (back != 0) {
				removedVar = data[back];
				data[back] = null;
				back = back - 1;
				size--;
			} else {
				removedVar = data[back];
				data[back] = null;
				back = data.length - 1;
				size--;
			}
		}

		return removedVar;
	}

	public T getFront() {// gets logical front item of array
		// TODO Auto-generated method stub
		return data[front];
	}

	public T getBack() {// gets logical back item of array
		// TODO Auto-generated method stub
		return data[back];
	}

	public boolean isEmpty() {// checks if array is empty
		return size == 0;
		// TODO Auto-generated method stub

	}

	public void clear() {// empties array items
		for (int i = 0; i < data.length; i++) {
			data[i] = null;
		}

	}

	public int size() {// logical size of circular array
		// TODO Auto-generated method stub
		int sizeCounter = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i] != null) {
				sizeCounter += 1;
			}
		}
		return sizeCounter;
	}

	public int capacity() {// physical size of circular array
		int capacity = 0;
		for (int i = 0; i < data.length; i++) {
			capacity += 1;
		}
		// TODO Auto-generated method stub
		return capacity;
	}

	public boolean equals(MyDeque<T> rhs) {// compares two arrays to see if they are identical based on front and back
											// indices
		int correctCounter = 0;
		int comparingPosition = front;
		int comparingtoPosition = rhs.front;
		if (size != rhs.size) {
			return false;
		}
		for (int i = 0; i < size; i++) {

			int ComparingPosition = comparingPosition % data.length;
			int ComparingToPosition = comparingtoPosition % rhs.data.length;

			if (data[ComparingPosition] == rhs.data[ComparingToPosition]) {
				correctCounter++;
			}
			comparingPosition++;
			comparingtoPosition++;
		}
		if (correctCounter == rhs.size()) {
			return true;
		}
		return false;
	}

	public String toString() {// Turns items in circular array into string
		StringBuilder sb = new StringBuilder("Contents: ");

		int oldPosition = front;
		for (int i = 0; i < size; i++) {

			if (oldPosition % data.length == 0) {
				oldPosition = 0;
			}
			sb.append(data[oldPosition] + " ");

			oldPosition++;

		}

		return sb.toString();
	}

}
