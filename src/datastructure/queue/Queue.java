package datastructure.queue;

public class Queue {
	private int maxSize;
	private long[] queArray;
	private int front;
	private int rear;
	private int nItems;

	public Queue() {
		this.maxSize = 10;
		queArray = new long[this.maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}

	public Queue(int maxSize) {
		this.maxSize = maxSize;
		queArray = new long[this.maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}

	public void insert(long j) {
		if (rear == maxSize - 1)
			rear = -1;

		queArray[++rear] = j;
		nItems++;
	}

	public long remove() {
		long temp = queArray[front++];
		if (front == maxSize) // deal with wraparound
			front = 0;
		nItems--; // one less item
		return temp;
	}

	public long peekFront() // peek at front of queue
	{
		return queArray[front];
	}

	public boolean isEmpty() // true if queue is empty
	{
		return (nItems == 0);
	}

	public boolean isFull() // true if queue is full
	{
		return (nItems == maxSize);
	}

	public int size() // number of items in queue
	{
		return nItems;
	}
	
	public int altSize()
	{
		System.out.println(rear+" "+front);
		if(front > rear)
		{
			return (maxSize - front) + rear+1;
		}
		else
		{
			return (rear - front)+1;
		}
	}
}
