package question;

public class Sequence {

	private int[] content = new int[]{9,10,9,8,7,6,7,8,9,10,9,10,9};
	
	public Sequence()
	{
	}
	
	public void process(int value)
	{
		int count = 0;
		int i = 0;
		while( i< content.length)
		{
			if(content[i] == value)
			{
				++count;
				i = i+2;
			}
			else
			{
				int diff = Math.abs(value - content[i]);
				i = i + diff;
			}
		}
		
		System.out.println(count);
	}
	
	public static void main(String[] args) {
			new Sequence().process(9);
	}

}
