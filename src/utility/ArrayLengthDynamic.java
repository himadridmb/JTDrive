package utility;

import java.util.Arrays;

public class ArrayLengthDynamic {

	public static void main(String[] args) {
		char[] copyFrom  = { 'a', 'b', 'c', 'd', 'e' };
		
		copyFrom = Arrays.copyOf(copyFrom, 50);
		System.out.println(Arrays.toString(copyFrom));
	}

}
