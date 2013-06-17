package question;

/* Two number swaping without temporary variable */

public class NumberSwap {
	
	private int a;
	private int b;
	
	public NumberSwap(int a , int b)
	{
		this.a = a;
		this.b = b;
		System.out.println(String.format("Before swap number a = %d, b = %d",a,b));
	}
	
	public void method1()
	{
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(String.format("After swap number, method 1 a = %d, b = %d",a,b));
	}
	
	public void method2()
	{
		a = a ^ b; // XOR
		b = a ^ b;
		a = a ^ b;
		System.out.println(String.format("After swap number, method 2 a = %d, b = %d",a,b));
	}
	
	
	public void method3()
	{
		a = a * b; // Multi
		b = a/b;
		a = a/b;
		
		System.out.println(String.format("After swap number, method 3 number a = %d, b = %d",a,b));
	}
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public static void main(String[] args) {
		new NumberSwap(12, 10).method3();
	}

}
