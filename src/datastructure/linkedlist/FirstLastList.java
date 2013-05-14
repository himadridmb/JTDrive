package datastructure.linkedlist;

public class FirstLastList {
	private DELink first;
	private DELink last;
	
	public FirstLastList()
	{
		this.first = null;
		this.last = null;
	}
	
	public boolean isEmpty()
	{
		return (this.first == null);
	}
	
	public void insertFirst(int value)
	{
		DELink newlink = new DELink(value);
		
		if(this.isEmpty())
		{
			this.last = newlink;
		}
		else
		{
			this.first.setPrevious(newlink);
		}
		newlink.setNext(this.first);
		newlink.setPrevious(null);
		this.first = newlink;
		
	}
	
	public void insertLast(int value)
	{
		DELink newlink = new DELink(value);
		
		if(this.isEmpty())
		{
			this.first = newlink;
		}
		
		newlink.setPrevious(this.last);
		this.last.setNext(newlink);
		this.last = newlink;
		
	}
	
	public DELink deleteFirst()
	{
		DELink dlink = this.first;
		if(this.first.getNext() == null)
		{
			this.last = null;
		}
		this.first = this.first.getNext();
		return dlink;
	}
	
	public DELink deleteLast()
	{
		DELink dlink = this.last;
		if(this.last.getPrevious() == null)
		{
			this.first = null;
		}

		this.last = dlink.getPrevious();
		this.last.setNext(null);
		return dlink;
	}
	
	public void displaylist()
	{
		System.out.print("List (first-->last): ");
		DELink current = first;
		while(current != null)
		{
			System.out.println(current);
			current = current.getNext();
		}
		System.out.println("");
	}
}
