package datastructure.linkedlist;

/* A potential problem with ordinary linked lists is that it,s difficult to traverse backward along the list 
 * 
 * It allows you to traverse backward as well as forward through the list. The secret is that each link has 
 * two references to other links instead of one. The first is to the next link, as in ordinary lists. The second is to the previous link.
 * */

public class DoublyLinkedList {
	private DELink first; // ref to first item
	private DELink last; // ref to last item

	public DoublyLinkedList() // constructor
	{
		first = null; // no items on list yet
		last = null;
	}

	public boolean isEmpty() // true if no links
	{
		return first == null;
	}

	public void insertFirst(int dd) {
		DELink newLink = new DELink(dd);

		if (isEmpty())
			last = newLink;
		else
			first.setPrevious(newLink);

		newLink.setNext(first);
		first = newLink;
	}

	public void insertLast(int dd) {
		DELink newLink = new DELink(dd);

		if (isEmpty()) {
			first = newLink;
		} else {
			last.setNext(newLink);
			newLink.setPrevious(last);
		}

		last = newLink;
	}

	public DELink deleteFirst() {
		DELink temp = first;

		if (first.getNext() == null)
			last = null;
		else
			first.getNext().setPrevious(null);

		first = first.getNext();

		return temp;
	}

	public DELink deleteLast() {
		DELink temp = last;

		if (first.getNext() == null)
			first = null;
		else
			last.getPrevious().setNext(null);

		last = last.getPrevious();
		return temp;
	}

	public boolean insertAfter(int key, int dd) {
		DELink current = first;

		while (current.getValue() != key) {
			current = current.getNext();
			if (current == null) {
				return false;
			}
		}
		DELink newLink = new DELink(dd);

		if (current == last) {
			newLink.setNext(null);
			last = newLink;
		} else {
			newLink.setNext(current.getNext());
			current.getNext().setPrevious(newLink);
		}

		newLink.setPrevious(current);
		current.setNext(newLink);

		return true;
	}

	public DELink deleteKey(long key) {
		DELink current = first;

		while (current.getValue() != key) {
			current = current.getNext();
			if (current == null) {
				return null;
			}
		}

		if (current == first) {
			first = current.getNext();
		} else {
			current.getPrevious().setNext(current.getNext());
		}

		if (current == last) {
			last = current.getPrevious();
		} else {
			current.getNext().setPrevious(current.getPrevious());
		}

		return current;
	}

	public void displayForward() {
		System.out.print("List (first-->last): ");
		DELink current = first;

		while (current != null) {
			current.displayLink();
			current = current.getNext();
		}

		System.out.println(" ");
	}

	public void displayBackward() {
		System.out.print("List (last-->first): ");
		DELink current = last;

		while (current != null) {
			current.displayLink();
			current = current.getPrevious();
		}
		System.out.println(" ");
	}

}
