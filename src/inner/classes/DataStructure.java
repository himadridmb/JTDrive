package inner.classes;

/* 
 * 
 * 					- Static nested class
 * Nested Class - 
 * 
 * 																					- Member class
 * 					- Non static nested class (Inner Class)		- Anonymous class
 * 																					- Local class
 */


public class DataStructure {
	// create an array
	private final static int SIZE = 15;
	private int[] arrayOfInts = new int[SIZE];

	public DataStructure() {
		// fill the array with ascending integer values
		for (int i = 0; i < SIZE; i++) {
			arrayOfInts[i] = i;
		}
	}

	public void printEven() {
		// print out values of even indices of the array
		InnerEvenIterator iterator = this.new InnerEvenIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.getNext() + " ");
		}
	}

	// inner class implements the Iterator pattern
	private class InnerEvenIterator {
		// start stepping through the array from the beginning
		private int next = 0;

		public boolean hasNext() {
			// check if a current element is the last in the array
			return (next <= SIZE - 1);
		}

		public int getNext() {
			// record a value of an even index of the array
			int retValue = arrayOfInts[next];
			// get the next even element
			next += 2;
			return retValue;
		}
	}

	public static void main(String s[]) {
		// fill the array with integer values and print out only
		// values of even indices
		DataStructure ds = new DataStructure();
		ds.printEven();
	}
}

/*
	Logical grouping of classes 
			If a class is useful to only one other class, then it is logical to embed it in that class and keep the 
			two together. Nesting such helper classes makes their package more streamlined.

	Increased encapsulation
			Consider two top-level classes, A and B, where B needs access to members of A that would otherwise 
			be declared private. By hiding class B within class A, As members can be declared private and B 
			can access them. In addition, B itself can be hidden from the outside world.

	More readable, maintainable code - Nesting small classes within top-level classes places the code closer to where it is used.
	
	Static nested class:
	
	OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();
	
	inner class:
	
	OuterClass.InnerClass innerObject = outerObject.new InnerClass();
 */
