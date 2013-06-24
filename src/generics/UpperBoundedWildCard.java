package generics;

/*
 * You can use an upper bounded wildcard to relax the restrictions on a variable. 
 * For example, say you want to write a method that works on List<Integer>, List<Double>, 
 * and List<Number>; you can achieve this by using an upper bounded wildcard.
 */
import java.util.Arrays;
import java.util.List;

public class UpperBoundedWildCard {

	public static void test(String... abc)
	{
		for(String v : abc)
		{
			System.out.println(v);
		}
	}
	
	public static double sumOfList(List<? extends Number> list) {
	    double s = 0.0;
	    for (Number n : list)
	        s += n.doubleValue();
	    return s;
	}
	
	public static void main(String[] args) {
		
		List<Integer> li = Arrays.asList(1, 2, 3);
		System.out.println("sum = " + sumOfList(li));
		
		List<Double> ld = Arrays.asList(1.2, 2.3, 3.5);
		System.out.println("sum = " + sumOfList(ld));
		
		String[] abc = new String[]{"a","b","c"};
		
		test(abc);

	}

}
