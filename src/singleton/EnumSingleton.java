package singleton;

/*This type of implementation recommend the use of enum. Enum, as written in java docs, provide implicit support for 
 * thread safety and only one instance is guaranteed. This is also a good way to have singleton with minimum effort.
 */
public enum EnumSingleton {
	INSTANCE;
	public void someMethod(String param) {
		System.out.println(param);
	}
}