package singleton;

public class LazySingleton2 {
	private static volatile LazySingleton2 instance = null;

	// private constructor
	private LazySingleton2() {
	}

	public static LazySingleton2 getInstance() {
		if (instance == null) {
			synchronized (LazySingleton2.class) {
				// Double check
				if (instance == null) {
					instance = new LazySingleton2();
				}
			}
		}
		return instance;
	}
}

/*Please ensure to use "volatile" keyword with instance variable otherwise you can run into out of order write error scenario, 
 * where reference of instance is returned before actually the object is constructed i.e. JVM has only allocated the memory and constructor code is still not executed. 
 * In this case, your other thread, which refer to uninitialized object may throw null pointer exception and can even crash the whole application.
 * */
 