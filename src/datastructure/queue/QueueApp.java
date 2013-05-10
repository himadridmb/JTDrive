package datastructure.queue;

public class QueueApp {
	public static void main(String[] args) {
		Queue theQueue = new Queue(5);
		theQueue.insert(10);
		theQueue.insert(20);
		theQueue.insert(30);
		theQueue.insert(40);

		theQueue.remove();
		theQueue.remove();
		theQueue.remove();

		theQueue.insert(50);
		theQueue.insert(60);
		theQueue.insert(70);
		theQueue.insert(80);

		System.out.println("Size = " + theQueue.altSize());

		while (!theQueue.isEmpty()) {
			long n = theQueue.remove();
			System.out.print(n);
			System.out.println(" ");
		}
		System.out.println(" ");

		PriorityQ thePQ = new PriorityQ(5);
		thePQ.insert(30);
		thePQ.insert(50);
		thePQ.insert(10);
		thePQ.insert(40);
		thePQ.insert(20);

		while (!thePQ.isEmpty()) {
			long item = thePQ.remove();
			System.out.print(item + ""); // 10, 20, 30, 40, 50
		} // end while
		System.out.println("");

	}
}
