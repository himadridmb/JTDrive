package singleton.advance.readresolve;

import java.io.Serializable;

/* To solve this issue, we need to include readResolve() method in our DemoSingleton class. This method will be invoked when you 
 * will de-serialize the object. Inside this method, you must return the existing instance to ensure single instance application wide.
 */

public class DemoSingleton2 implements Serializable {
	
	/* This is required in condition when you class structure can change in between you serialize the instance and go again to de-serialize it. 
	 * Changed structure of class will cause JVM to give exception while de-serializing process. This problem can be solved only by adding a 
	 * unique serial version id to class. It will prevent the compiler to throw the exception by telling that both classes are same, and will load the available instance variables only.
	 */
	
	private static final long serialVersionUID = 1L;
	private volatile static DemoSingleton2 instance = null;

	public static DemoSingleton2 getInstance() {
		if (instance == null) {
			instance = new DemoSingleton2();
		}
		return instance;
	}
	
	protected Object readResolve() {
		return instance;
	}

	private int i = 10;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
}