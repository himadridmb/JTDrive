package threadsafe.test.use.sync;

/* you must follow two steps: you must make all relevant fields private, 
 * and you must identify and synchronize all the critical sections.
 */

public class RGBColor {

	private int r;
	private int g;
	private int b;

	public RGBColor(int r, int g, int b) {

		checkRGBVals(r, g, b);

		this.r = r;
		this.g = g;
		this.b = b;
	}

	public void setColor(int r, int g, int b) {

		checkRGBVals(r, g, b);

		synchronized (this) {

			this.r = r;
			this.g = g;
			this.b = b;
		}
	}

	/**
	 * returns color in an array of three ints: R, G, and B
	 */
	public int[] getColor() {

		int[] retVal = new int[3];

		synchronized (this) {

			retVal[0] = r;
			retVal[1] = g;
			retVal[2] = b;
		}

		return retVal;
	}

	public synchronized void invert() {

		r = 255 - r;
		g = 255 - g;
		b = 255 - b;
	}

	private static void checkRGBVals(int r, int g, int b) {

		if (r < 0 || r > 255 || g < 0 || g > 255 || b < 0 || b > 255) {

			throw new IllegalArgumentException();
		}
	}
}

/* Why not just synchronize everything?
You don't want to make every class you design thread-safe -- only classes whose instances will be used concurrently by multiple threads. 
The reason you don't want to make every class thread-safe is that thread safety may involve a performance penalty. For example:

Synchronized method invocations generally are going to be slower than non-synchronized method invocations. 
In Suns current JVM, for example, synchronized method invocations are 4 to 6 times slower than non-synchronized method invocations. 
In the future, the speed of synchronized method invocations should improve, but they will likely never achieve parity with non-synchronized method invocations.

Unnecessary synchronized method invocations (and synchronized blocks) can cause unnecessary blocking and unblocking of threads, 
which can hurt performance. 

Immutable objects tend to be instantiated more often, leading to greater numbers of often short-lived objects that can increase the work of the garbage collector.

Synchronization gives rise to the possibility of deadlock, a severe performance problem in which your program appears to hang.

*/
