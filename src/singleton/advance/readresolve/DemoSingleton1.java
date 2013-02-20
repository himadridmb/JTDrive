package singleton.advance.readresolve;

import java.io.Serializable;

/*Lets say your application is distributed and it frequently serialize the objects in file system, only to read 
 * them later when required. Please note that, de-serialization always creates a new instance*/

public class DemoSingleton1 implements Serializable {
	private volatile static DemoSingleton1 instance = null;

	public static DemoSingleton1 getInstance() {
		if (instance == null) {
			instance = new DemoSingleton1();
		}
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
