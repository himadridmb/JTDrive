package thread;

public class ThreadSafe {

	/**
1) Immutable objects are by default thread-safe because there state can not be modified once created. 
	Since String is immutable in Java, its inherently thread-safe.
2) Read only or final variables in Java are also thread-safe in Java.
3) Locking is one way of achieving thread-safety in Java.
4) Static variables if not synchronized properly becomes major cause of thread-safety issues.

5) Example of thread-safe class in Java: Vector, Hashtable, ConcurrentHashMap, String etc.
6) Atomic operations in Java are thread-safe e.g. reading a 32 bit int from memory because its an atomic operation it can't interleave with other thread.
7) local variables are also thread-safe because each thread has there own copy and using local variables is good way to writing thread-safe code in Java.
8) In order to avoid thread-safety issue minimize sharing of objects between multiple thread.
9) Volatile keyword in Java can also be used to instruct thread not to cache variables and read from main memory and can 
	also instruct JVM not to reorder or optimize code from threading perspective.
*/
	public static void main(String[] args) {
		
	}

}
