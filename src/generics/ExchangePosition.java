package generics;

import java.util.List;

/* Write a generic method to exchange the positions of two different elements in an array. */
public class ExchangePosition<T> {

	public T[] exchange(T[] t, int from, int to) {
		T temp = t[from];
		t[from] = t[to];
		t[to] = temp;
		return t;
	}

	/* Write a generic method to find the maximal element in the range [begin, end) of a list. */
	public <T extends Comparable<T>>T getMaximum(T[] t, int begin, int end) {
		T maximu = t[begin];

		for (int i = begin; i <= end; i++) {
			if(maximu.compareTo(t[i]) < 0)
			{
				maximu = t[i];
			}
		}

		return maximu;
	}

	

	public static void main(String[] args) {
		ExchangePosition<Integer> pt = new ExchangePosition<Integer>();
		Integer[] array = new Integer[] { 1, 2, 3, 4, 5 };
		Integer[] after = pt.exchange(array, 1, 2);

		for (Integer i : after) {
			System.out.println(i);
		}
		
		System.out.println(pt.getMaximum(after,0,2));
	}

}

/*
 	class Singleton<T> {

    public static T getInstance() {
        if (instance == null)
            instance = new Singleton<T>();

        return instance;
    }

    private static T instance = null;
}

No. You cannot create a static field of the type parameter T. 
 */
