package singleton;

public class DriveTest {

	
	public static void main(String[] args) {
		EnumSingleton ton = EnumSingleton.INSTANCE;
		ton.someMethod("Hi Charlie");
	}

}
