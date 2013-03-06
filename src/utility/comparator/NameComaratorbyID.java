package utility.comparator;

import java.util.Comparator;

/**********************************************************************************
 * What if you want to sort some objects in an order other than their natural ordering? 
 * Or what if you want to sort some objects that dont implement Comparable? 
 * To do either of these things, you ll need to provide a Comparator  an object that encapsulates an ordering. 
 * Like the Comparable interface, the Comparator interface consists of a single method.

 * public interface Comparator<T> {
 * int compare(T o1, T o2);
 *	}
 **********************************************************************************/
public class NameComaratorbyID implements Comparator<Name> {

	@Override
	public int compare(Name o1, Name o2) {
		return o1.getId() - o2.getId();
	}

}
