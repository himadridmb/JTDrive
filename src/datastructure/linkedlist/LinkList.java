package datastructure.linkedlist;

public class LinkList {
	private Link first;

	public LinkList() // constructor
	{
		first = null; // no items on list yet
	}

	public boolean isEmpty() // true if list is empty
	{
		return (first == null);
	}
	
	public void insertFirst(int key, double value)
	{
		Link newlink = new Link(key,value);
		newlink.setNext(this.first);
		this.first = newlink;
	}
	
	public Link deleteFirst()
	{
		Link df = this.first;
		this.first = this.first.getNext();
		return df;
	}
	
	public Link find(int key)
	{
		Link current = first;
		
		while(current !=null)
		{
			if(current.getKey() == key)
			{
				break;
			}
			current = current.getNext();
		}
		
		return current;
	}
	
	public Link delete(int key)
	{
		Link current = this.first;
		Link previous = this.first;
		
		while(current !=null)
		{
			if(current.getKey() == key)
			{
				break;
			}
			previous = current;
			current = current.getNext();
		}
		
		if(current != null)
		{
			previous.setNext(current.getNext());
		}
		
		return current;
	}
	
	public void sortedInsert(int key, double value)
	{
		Link newlink = new Link(key,value);
		
		Link previous = null;
		Link current = this.first;
		
		while(current != null && key > current.getKey())
		{
			previous = current;
			current = current.getNext();
		}
		
		if(previous == null) // at the begginng of the list
		{
			this.first = newlink;
		}
		else
		{
			previous.setNext(newlink);
		}
		
		newlink.setNext(current);
	}
	
	public void displayList()
	{
		System.out.print("List (first-->last): ");
		Link current = first;
		while(current!=null)
		{
			current.displayLink();
			current = current.getNext();
		}
	}

	public Link getFirst() {
		return first;
	}

	public void setFirst(Link first) {
		this.first = first;
	}
	
	public ListIterator getIterator() // return iterator
	{
		return new ListIterator(this); // initialized with 
	}// this list

}
