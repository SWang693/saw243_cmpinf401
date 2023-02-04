public class IndexAddRemoveDeque<T> extends IndexDeque<T> implements IndexableAddRemove<T> {

	public IndexAddRemoveDeque(int initsize) {
		super(initsize);
		// TODO Auto-generated constructor stub
	}

	public void addToFront(int i, T item) {// adds to front + i index of array by shifting values and inserting item
		if (this.size < i || i < 0) {
			throw new IndexOutOfBoundsException();
		}
		if (this.size == data.length) {
			this.doubleCapacity();
		}
		int curr = (front + i) % data.length;

		for (int x = back; x >= curr; x--) {
			if (x + 1 > data.length - 1) {
				data[0] = data[x];
			} else {
				data[x + 1] = data[x];
			}
		}
		if (back + 1 > data.length) {
			back = 0;
		} else {
			back++;
		}

		size++;
		data[curr] = item;

	}

	public void addToBack(int i, T item) {// adding to position back-i by shifting to create space and inserting item

		if (this.size < i || i < 0) {
			throw new IndexOutOfBoundsException();
		}
		if (this.size == data.length) {
			this.doubleCapacity();
		}
		int curr = (back - i) % data.length;

		for (int x = front; x <= curr; x++) {
			if (x - 1 < 0) {
				data[data.length - 1] = data[0];
			} else {
				data[x - 1] = data[x];
			}
		}
		if (front - 1 < 0) {
			front = data.length - 1;
		} else {
			front--;
		}

		size++;
		data[curr] = item;

	}

	public T removeFront(int i) {// removing front+i position
		T removedVar = null;
		if (this.size < i + 1 || i < 0) {
			throw new IndexOutOfBoundsException();
		}
		int curr = (front + i) % data.length;
		removedVar = data[curr];
		if (curr > front) {
			for (int x = curr; x > front; x--) {

				data[x] = data[x - 1];
			}
			data[front] = null;
			front++;

		} else {
			for (int x = curr; x < back; x++) {
				data[x] = data[x + 1];
			}
			data[back] = null;
			back--;

		}

		size--;

		return removedVar;
	}

	public T removeBack(int i) {// removing back-i position
		T removedVar = null;
		if (this.size < i + 1 || i < 0) {
			throw new IndexOutOfBoundsException();
		}
		int curr = (back - i) % data.length;
		removedVar = data[curr];

		if (curr > front) {

			for (int x = curr; x > front; x--) {

				data[x] = data[x - 1];
			}
			data[front] = null;
			front++;

		} else {
			for (int x = curr; x < back; x++) {
				data[x] = data[x + 1];
			}
			data[back] = null;
			back--;

		}
		size--;
		return removedVar;
	}

}