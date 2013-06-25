package generics;

import java.util.Arrays;
import java.util.List;

/* Write a generic method to count the number of elements in a collection that 
 * have a specific property (for example, odd integers, prime numbers, palindromes). */
public class Counter {

	public <U> int getCount(List<U> l, UnaryPredicate<U> e)
	{
		int count = 0;
		for(U a : l)
		{
			if(e.test(a))
			{
				++count;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		List<Integer> ci = Arrays.asList(1, 2, 3, 4);
        int count = new Counter().getCount(ci, new OddPredicate());
        System.out.println("Number of odd integers = " + count);
	}
	
	/* public static T max(T x, T y) 
	 	{
	        return x > y ? x : y; Can not use > operator because it only applicable for primitive type
	    }
	 */
}

interface UnaryPredicate<T> {
    public boolean test(T obj);
}

class OddPredicate implements UnaryPredicate<Integer> {
    public boolean test(Integer i) { return i % 2 != 0; }
}