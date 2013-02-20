package singleton;

public class DriveTest {

	
	public static void main(String[] args) {
		EnumSingleton ton = EnumSingleton.INSTANCE;
		ton.someMethod("Hi Charlie");
		
		BillPughSingleton bl = BillPughSingleton.BillPughSingletongetInstance();
		BillPughSingleton bl1 = BillPughSingleton.BillPughSingletongetInstance();
		BillPughSingleton bl2 = BillPughSingleton.BillPughSingletongetInstance();
		BillPughSingleton bl3 = BillPughSingleton.BillPughSingletongetInstance();
	}

}
