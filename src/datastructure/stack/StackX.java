package datastructure.stack;

public class StackX {
	int top;
	int size;
	char[] contents;
	
	public StackX(int size)
	{
		top = -1;
		this.size = size;
		contents = new char[this.size];
	}
	
	public void push(char value)
	{
		contents[++top] = value;
	}
	
	public char pop()
	{
		return contents[top--];
	}
	
	public char peek()
	{
		return contents[top];
	}
	
	public boolean isEmpty()
	{
		return (top == -1);
	}
	
	public boolean isFull()
	{
		return (top == size-1);
	}
}
