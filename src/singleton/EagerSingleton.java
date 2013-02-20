package singleton;

public class EagerSingleton {
	private static volatile EagerSingleton instance = new EagerSingleton();

	// private constructor
	private EagerSingleton() {
	}

	public synchronized static EagerSingleton getInstance() {
		if (instance == null) {
			instance = new EagerSingleton();
		}
		return instance;
	}
}

/* Above method works fine, but has one performance drawback. The getInstance() method is synchronized and each call will 
 * require extra locking/unlocking steps which are necessary only for first time, and never there after.
 */


