package singleton;

/*Bill pugh solution Bill pugh was main force behind java memory model changes. His principle "Initialization-on-demand holder idiom" 
 * also uses static block but in different way. It suggest to use static inner class.
 */

public class BillPughSingleton {
	private BillPughSingleton() {
	}

	private static class LazyHolder {
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}

	public static BillPughSingleton BillPughSingletongetInstance() {
		return LazyHolder.INSTANCE;
	}
}

/* As you can see, until we need an instance, the LazyHolder class will not be initialized until required and you can still 
 * use other static members of BillPughSingleton class. This is the solution, i will recommend to use.
 */
 