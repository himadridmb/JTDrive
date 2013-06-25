package generics;

import java.util.ArrayList;
import java.util.List;

/*
 * Say you want to write a method that puts Integer objects into a list. 
 * To maximize flexibility, you would like the method to work on List<Integer>, 
 * List<Number>, and List<Object>  anything that can hold Integer values.
 */
public class LowerBoundedWildCard {
	
	public static void addNumbers(List<? super Integer> list) {
	    for (int i = 1; i <= 10; i++) {
	        list.add(i);
	    }
	}
	
	public static void main(String[] args) {
		
		List<? extends Integer> intList = new ArrayList();
		List<? super Number>  numList = new ArrayList<Number>();
		
		numList.add(2);
		
	}

}

