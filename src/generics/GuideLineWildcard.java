package generics;

import java.util.ArrayList;
import java.util.List;

/*
	Wildcard Guidelines: 
		- An "in" variable is defined with an upper bounded wildcard, using the extends keyword.
		- An "out" variable is defined with a lower bounded wildcard, using the super keyword.
		- In the case where the "in" variable can be accessed using methods defined in the Object class, use an unbounded wildcard.
		- In the case where the code needs to access the variable as both an "in" and an "out" variable, do not use a wildcard.
*/
public class GuideLineWildcard {

	public static void main(String[] args) {
		List<EvenNumber> le = new ArrayList<EvenNumber>();
		List<? extends NaturalNumber> ln = le;
		//ln.add(new NaturalNumber(35));  // compile-time error
	}

}

/*
 Because List<EvenNumber> is a subtype of List<? extends NaturalNumber>, you can assign le to ln. But you cannot 
 use ln to add a natural number to a list of even numbers. The following operations on the list are possible:

	You can add null.
	You can invoke clear.
	You can get the iterator and invoke remove.
	You can capture the wildcard and write elements that you've read from the list.
	You can see that the list defined by List<? extends NaturalNumber> is not read-only in the strictest sense of the word, 
	but you might think of it that way because you cannot store a new element or change an existing element in the list.
 */

class NaturalNumber {

    private int i;

    public NaturalNumber(int i) { this.i = i; }
}

class EvenNumber extends NaturalNumber {

    public EvenNumber(int i) { super(i); }
}

/*
 * Restriction of Generics
 	-	Cannot Instantiate Generic Types with Primitive Types
	-	Cannot Create Instances of Type Parameters
	-	Cannot Declare Static Fields Whose Types are Type Parameters
	-	Cannot Use Casts or instanceof With Parameterized Types
	-	Cannot Create Arrays of Parameterized Types
	-	Cannot Create, Catch, or Throw Objects of Parameterized Types
	-	Cannot Overload a Method Where the Formal Parameter Types of Each Overload Erase to the Same Raw Type
 */
