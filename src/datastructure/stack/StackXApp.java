package datastructure.stack;

public class StackXApp {

	public static void main(String[] args) {
		/* Word reverse */
		String input = "UNOapp.com";
		
		StringBuffer bf = new StringBuffer(input);
		System.out.println(bf.reverse());
		
		StackX stack = new StackX(input.length());
		
		for(int i=0; i<input.length();i++)
		{
			stack.push(input.charAt(i));
		}
		
		while(!stack.isEmpty())
		{
			System.out.print(stack.pop());
		}
	}

}
