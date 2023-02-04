// CS 0445 Spring 2023
// Partial implementation of the SimpleDeque class for
// Recitation Exercise 1.  Fill in the missing code for
// the methods shown.  If you wish to add any methods not
// shown (ex: private methods to aid in the implementation)
// feel free to do so.

public class SimpleDeque<T> implements DequeInterface<T>
{
	private T [] data; 
	private int back;  // index of logical back item in deque
	private int size;

	@SuppressWarnings("unchecked")
	public SimpleDeque(int initsize)
	{
		// Note how array is created and cast to T.
		data = (T []) new Object[initsize];
		// Back is initialized to -1 for special case when deqeue
		// is empty.  Be careful about this special case for both
		// adding and removing.
		back = -1;
		front = 
		size = 0;
	}
	
	public String toString()
	{
		String alldata = "";
		if (size > 0)
		{
			for(int i = 0; i < data.length; i++) {
				if(data[i] != null) {
					alldata += data[i] + ", ";
				}
				
			}
			return alldata;
			// Make and return single String from data stored
			// in Deque.  Proceed from front to back.
		}
		else return new String("Deque is Empty");
	}	

	public void addToFront(T newEntry)
	{
		if(size == data.length) {
			System.out.println("Array is full");
		}
		else{
			for(int i = 0; i < size; i++) {
				data[size-i] = data[size-1];
			}
			data[0] = newEntry;
			size++;
		}
		
		// Add to front, shifting data to make room.
		// If array is full, print out a message and do not
		// add the entry.
	}
	
	public void addToBack(T newEntry)
	{
		if(size == data.length) {
			System.out.println("Array is full");
		}
		else {
			data[size] = newEntry;
			size++;
		}
		
		// Add to back -- no shifting is required.
		// If array is full, print out a message and do not
		// add the entry.
	}
	
	public T removeBack()
	{
		T removedVar;
		if(isEmpty()) {
			return null;
		}
		else {
			removedVar = data[size-1];
			data[size-1] = null;
			size--;
			return removedVar;
		}
		
		
		
		
		
		// remove and return the item at the back of the deque
		// If deque is empty, return null
	}
	
	public T getBack()
	{
		if(isEmpty()) {
			return null;
		}
		else {
			return data[size-1];
		}
		// return item at the back of the deque without disturbing
		// it.  If dequeu is empty, return null
	}
	
	public T removeFront()
	{
		T removedVar;
		if(isEmpty()) {
			return null;
		}
		else{
			removedVar = data[0];
			for(int i = 0; i < size-1; i++) {
				data[i] = data[i+1];
			}
			size--;
			//back--;
			return removedVar;
		}
		
		// remove and return the item at the front of the deque
		// If deque is empty, return null.  You will need to shift
		// the remaining items over in order to keep the front at
		// index 0
	}
	
	public T getFront()
	{
		if(isEmpty()) {
			return null;
		}
		else {
			return data[0];
		}
		// return the item at the front of the deque with disturbing
		// it.  If deque is empty, return null
	}		
	
	public boolean isEmpty()
	{
		return size == 0;
	}
	
	public void clear()
	{
		data = (T []) new Object[data.length];
		back = -1;
		size = 0;
		// reset deque to be empty and allow old objects to be
		// garbage collected.
	}
}