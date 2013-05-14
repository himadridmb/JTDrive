package datastructure.linkedlist;

public class Link {
	private int key;
	private double value;
	private Link next;
	
	public Link(int key, double value)
	{
		this.key = key;
		this.value = value;
		this.next = null;
	}
	
	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public Link getNext() {
		return next;
	}

	public void setNext(Link next) {
		this.next = next;
	}

	public void displayLink() // display ourself
	{
		System.out.print("{" + key + ", " + value + "}");
	}
}
