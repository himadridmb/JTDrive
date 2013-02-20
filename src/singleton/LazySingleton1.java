package singleton;

public class LazySingleton1 {
	private static volatile LazySingleton1 instance = null;

	// private constructor
	private LazySingleton1() {
	}

	public static LazySingleton1 getInstance() {
		if (instance == null) {
			synchronized (LazySingleton1.class) {
				instance = new LazySingleton1();
			}
		}
		return instance;
	}
}

/* But, this method also has its own drawbacks. Lets see how. Suppose there are two threads T1 and T2. 
 * Both comes to create instance and execute "instance==null", now both threads have identified instance 
 * variable to null thus assume they must create an instance. They sequentially goes to synchronized block 
 * and create the instances. At the end, we have two instances in our application.*/
