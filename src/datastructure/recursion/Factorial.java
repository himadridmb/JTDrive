package datastructure.recursion;

/*
 * Recursion is usually used because it simplifies a problem conceptually, not because its inherently more efficient.
 */
public class Factorial {
	private long doFactorial(long n) {
		if (n == 0) {
			return 1;
		} else {
			System.out.println(n);
			return n * doFactorial(n - 1);
		}
	}

	public int triangle(int n) {
		System.out.println("Entering: n=" + n);
		if (n == 1) {
			System.out.println("Returning 1");
			return 1;
		} else {
			int temp = (n + triangle(n - 1));
			System.out.println("Returning " + temp);
			return temp;
		}
	}

	public static void main(String[] args) {
		Factorial fc = new Factorial();
		long res = fc.doFactorial(20);
		System.out.println(res);

		//int Total = fc.triangle(5);
		//System.out.println(Total);
	}
}
