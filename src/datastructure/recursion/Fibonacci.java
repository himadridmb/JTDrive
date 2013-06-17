package datastructure.recursion;

public class Fibonacci {

	public int Fibo(int n)
	{
		if(n==2 || n == 1)
		{
			return 1;
		}
		else
		{
			return Fibo(n-2) + Fibo(n-1);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(new Fibonacci().Fibo(10));

	}

}
