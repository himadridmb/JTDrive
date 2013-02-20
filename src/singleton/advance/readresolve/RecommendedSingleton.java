package singleton.advance.readresolve;

import java.io.Serializable;

public class RecommendedSingleton implements Serializable{
	
	private static final long serialVersionUID = -2199042363607501804L;

	private RecommendedSingleton() {
		// private constructor
	}

	private static class DemoSingletonHolder {
		public static final RecommendedSingleton INSTANCE = new RecommendedSingleton();
	}

	public static RecommendedSingleton getInstance() {
		return DemoSingletonHolder.INSTANCE;
	}

	protected Object readResolve() {
		return getInstance();
	}
}
