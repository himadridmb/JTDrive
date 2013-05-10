package datastructure.queue;

public class PriorityQ {
	private int maxSize;
	private long[] queArray;
	private int nItems;

	public PriorityQ(int s) {
		maxSize = s;
		queArray = new long[maxSize];
		nItems = 0;
	}

	public void insert(long item) {
		if (nItems == 0)
			queArray[nItems++] = item;
		else {
			int j;
			for (j = nItems - 1; j >= 0; j--) {
				if (item > queArray[j]) {
					queArray[j + 1] = queArray[j];
				} else {
					break;
				}
			}
			queArray[j + 1] = item;
			nItems++;
		}
	}

	public long remove() // remove minimum item
	{
		return queArray[--nItems];
	}

	public long peekMin() // peek at minimum item
	{
		return queArray[nItems - 1];
	}

	public boolean isEmpty() // true if queue is empty
	{
		return (nItems == 0);
	}

	public boolean isFull() // true if queue is full
	{
		return (nItems == maxSize);
	}
}
