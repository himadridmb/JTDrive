package utility.finale;

public class DefTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Defensive1 def1 = new Defensive1();
		def1.setA(1);
		def1.setB(2);
		
		System.out.println(def1);
		
		Defensive2 def2 = new Defensive2(def1);
		
		def1.setA(5);
		
		def2.getDef1().setA(6);
		
		System.out.println(def2);

	}

}
