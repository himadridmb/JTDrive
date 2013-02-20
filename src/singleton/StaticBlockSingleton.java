package singleton;

public class StaticBlockSingleton {
	private static final StaticBlockSingleton INSTANCE;

	static {
		try {
			INSTANCE = new StaticBlockSingleton();
		} catch (Exception e) {
			throw new RuntimeException("Uffff, i was not expecting this!", e);
		}
	}

	public static StaticBlockSingleton getInstance() {
		return INSTANCE;
	}

	private StaticBlockSingleton() {
		// ...
	}
}

/*Above code has one drawback. Suppose there are 5 static fields in class and application code needs to access only 2 or 3, 
 * for which instance creation is not required at all. So, if we use this static initialization. we will have one instance created though we require it or not.
 */
