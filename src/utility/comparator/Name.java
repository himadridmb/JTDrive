package utility.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/****************************************************************************************
 * The Comparable interface consists of the following method.
 *
 * public interface Comparable<T> {
 *    public int compareTo(T o);
 * }
 * The compareTo method compares the receiving object with the specified object and returns a negative integer, 0, 
 * or a positive integer depending on whether the receiving object is less than, equal to, or greater than the specified 
 * object. If the specified object cannot be compared to the receiving object, the method throws a ClassCastException.
 *****************************************************************************************/

public class Name implements Comparable<Name> {
	private final String firstName, lastName;
	private int id;
	
	public Name(int id, String firstName, String lastName) {
		if (firstName == null || lastName == null)
			throw new NullPointerException();
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}

	public String firstName() {
		return firstName;
	}

	public String lastName() {
		return lastName;
	}
	
	public int getId()
	{
		return id;
	}

	public boolean equals(Object o) {
		if (!(o instanceof Name))
			return false;
		Name n = (Name) o;
		return n.firstName.equals(firstName) && n.lastName.equals(lastName);
	}

	public int hashCode() {
		return 31 * firstName.hashCode() + lastName.hashCode();
	}

	public String toString() {
		return id+" "+lastName + " " + firstName;
	}

	public int compareTo(Name n) {
		int lastCmp = lastName.compareTo(n.lastName);
		return (lastCmp != 0 ? lastCmp : firstName.compareTo(n.firstName));
	}
	
	public static Comparator<Name> FirstnameComparator = new Comparator<Name>() {
			public int compare(Name fruit1, Name fruit2) {
			
			String fruitName1 = fruit1.firstName().toUpperCase();
			String fruitName2 = fruit2.firstName().toUpperCase();
			
			//ascending order
			return fruitName1.compareTo(fruitName2);
			
			//descending order
			//return fruitName2.compareTo(fruitName1);
			}
	};
	
	public static void main(String[] args) {
        Name nameArray[] = {
            new Name(3,"John", "Smith"),
            new Name(2,"Karl", "Ng"),
            new Name(1,"Albine", "Smith"),
            new Name(4,"Tom", "Rich")
        };

        List<Name> names = Arrays.asList(nameArray);
        Collections.sort(names);
        System.out.println(names);
        
        Collections.sort(names,new NameComaratorbyID());
        System.out.println(names);
        
        Collections.sort(names, FirstnameComparator);
        System.out.println(names);
    }
}