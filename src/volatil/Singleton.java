package volatil;

/* Volatile keyword in Java is used as an indicator to Java compiler and  Thread that do not cache value of this 
 * variable and always read it from main memory. So if you want to share any variable in which read and write 
 * operation is atomic by implementation e.g. read and write in int or boolean variable you can declare them as 
 * volatile variable.
 */

public class Singleton {
	private static volatile Singleton _instance; // volatile variable

	public static Singleton getInstance() {

		if (_instance == null) {
			synchronized (Singleton.class) {
				if (_instance == null)
					_instance = new Singleton();
			}

		}
		return _instance;
	}
}

/* If we do not make _instance variable volatile then Thread which is creating instance of Singleton is 
 * not able to communicate other thread, that instance has been created until it comes out of the Singleton 
 * block, so if Thread A is creating Singleton instance and just after creation lost the CPU, all other thread 
 * will not be able to see value of _instance as not null and they will believe its still null.
 */

/* Why because reader threads are not doing any locking and until writer thread comes out of synchronized block, 
 * memory will not be synchronized and value of _instance will not be updated in main memory. With Volatile keyword 
 * in Java this is handled by Java himself and such updates will be visible by all reader threads
 */

/* - volatile keyword in Java is only application to variable and using volatile keyword with class and method is illegal.
 * - An access to a volatile variable in Java never has chance to block, since we are only doing a simple read or write, 
 * so unlike a synchronized block we will never hold on to any lock or wait for any lock.
 * - If a variable is not shared between multiple threads no need to use volatile keyword with that variable.
 * - You can not synchronize on null object but your volatile variable in java could be null.
*/