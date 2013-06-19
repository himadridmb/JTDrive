package datastructure.recursion;

public class Permutations {

	public void doPermute(char input[], int k, int n)
	{
		if(k==n-1)
		{
			for(int i = 0; i<n ; ++i)
			{
				System.out.print(input[i]);
			}
			System.out.println();
		}
		else
		{
			for(int i = k; i < n; ++i)
			{
				char t = input[k];
				input[k] = input[i];
				input[i] = t;
				
			//	System.out.println(String.format("Before k=%d,i=%d", k,i));
				
				doPermute(input,k+1,n);
				
			//	System.out.println(String.format("After k=%d,i=%d", k,i));
				
				t = input[k];
				input[k] = input[i];
				input[i] = t;
			}
		}
	}
	
	public static void main(String[] args) {
		new Permutations().doPermute(new char[]{'A','B','C','D'}, 0, 4);
	}

}
