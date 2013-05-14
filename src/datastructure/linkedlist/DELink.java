package datastructure.linkedlist;

/* Double ended  linked list */

public class DELink {
	private int value;
	private DELink next;
	private DELink previous;
	
	public DELink(int value)
	{
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public DELink getNext() {
		return next;
	}

	public void setNext(DELink next) {
		this.next = next;
	}

	public DELink getPrevious() {
		return previous;
	}

	public void setPrevious(DELink previous) {
		this.previous = previous;
	}

	@Override
	public String toString() {
		return "DELink [value=" + value + "]";
	}
}
