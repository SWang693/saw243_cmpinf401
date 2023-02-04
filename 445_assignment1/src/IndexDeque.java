
public class IndexDeque<T> extends MyDeque<T> implements Indexable<T> {

	public IndexDeque(int initsize) {
		super(initsize);
		// TODO Auto-generated constructor stub
	}

	@Override
	public T getFront(int i) {
		if (this.size < i + 1 || i < 0) {
			throw new IndexOutOfBoundsException();
		}
		int indexPosition = front + i;
		if (indexPosition >= data.length) {
			indexPosition = indexPosition % data.length;
		}

		return this.data[indexPosition];
	}

	@Override
	public T getBack(int i) {
		if (this.size < i + 1 || i < 0) {
			throw new IndexOutOfBoundsException();
		}
		int indexPosition = back - i;
		if (indexPosition < 0) {
			indexPosition = indexPosition % data.length;
		}

		return this.data[indexPosition];

	}

	@Override
	public void setFront(int i, T item) {

		if (this.size < i + 1 || i < 0) {
			throw new IndexOutOfBoundsException();
		}
		int indexPosition = front + i;
		if (indexPosition >= data.length) {
			indexPosition = indexPosition % data.length;
		}

		data[indexPosition] = item;

	}

	@Override
	public void setBack(int i, T item) {

		if (this.size < i + 1 || i < 0) {
			throw new IndexOutOfBoundsException();
		}
		int indexPosition = back - i;
		if (indexPosition < 0) {
			indexPosition = indexPosition % data.length;
		}

		data[indexPosition] = item;

	}

}
