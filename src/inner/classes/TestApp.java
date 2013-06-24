package inner.classes;

public class TestApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ShadowTest kik = new ShadowTest();
		
		ShadowTest.FirstLevel fl = kik.new FirstLevel();
		System.out.println(fl.x);
	}

}
