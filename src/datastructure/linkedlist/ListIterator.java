package datastructure.linkedlist;

public class ListIterator {
	private Link current;
	private Link previous;
	private LinkList ourList;

	public ListIterator(LinkList list) {
		ourList = list;
		reset();
	}

	public void reset() {
		current = ourList.getFirst();
		previous = null;
	}

	public boolean atEnd() // true if last link
	{
		return (current.getNext() == null);
	}

	public void nextLink() // go to next link
	{
		previous = current;
		current = current.getNext();
	}

	public Link getCurrent() // get current link
	{
		return current;
	}

	public void insertAfter(int key, int value) // insert after
	{
		Link newLink = new Link(key, value);
		if (ourList.isEmpty()) // empty list
		{
			ourList.setFirst(newLink);
			current = newLink;
		} else {
			newLink.setNext(current.getNext());
			current.setNext(newLink);
			nextLink(); // point to new link
		}
	}

	public void insertBefore(int key, int value) {
		Link newLink = new Link(key, value);
		if (previous == null) //
		{ //
			newLink.setNext(ourList.getFirst());
			ourList.setFirst(newLink);
			reset();
		} else // not beginning
		{
			newLink.setNext(previous.getNext());
			previous.setNext(newLink);
			current = newLink;
		}
	}

	public int deleteCurrent() // delete item at current
	{
		int value = current.getKey();
		if (previous == null) // beginning of list
		{
			ourList.setFirst(current.getNext());
			reset();
		} 
		else // not beginning
		{
			previous.setNext(current.getNext());
			if (atEnd())
				reset();
			else
				current = current.getNext();
		}
		return value;
	}
}
