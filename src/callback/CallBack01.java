package callback;

public class CallBack01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Teacher teacher = new Teacher("Jones");
		teacher.register(new Student("David"));
		teacher.register(new Student("Vasil"));
		teacher.register(new Student("Rakesh"));
		teacher.register(new Student("Vahid"));
		
		teacher.callTheRoll();
	}

}
