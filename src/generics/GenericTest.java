package generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* usage of generics
 * - Stronger type checks at compile time.
 * - Elimination of casts.
 * - Enabling programmers to implement generic algorithms.
 */
public class GenericTest {
	
	<K,V> boolean test(Pair<K,V> a, Pair<K,V> b)
	{
		return a.getKey().equals(b.getKey()) && a.getValue().equals(b.getValue());
	}
	
	public static void main(String... args)
	{
		Pair<Integer,Integer> p1 = new Pair<Integer,Integer>(1,2);
		Pair<Integer,Integer> p2 = new Pair<Integer,Integer>(1,2);
		
		System.out.println(new GenericTest().test(p1, p2));
		
		List<String> list = new ArrayList<String>();
		
		list.add("A");
		list.add("B");
		
		
	}
}

class Pair<K, V> {

    private K key;
    private V value;

    // Generic constructor
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    // Generic methods
    public void setKey(K key) { this.key = key; }
    public void setValue(V value) { this.value = value; }
    public K getKey()   { return key; }
    public V getValue() { return value; }
}

/*
public void boxTest(Box<Number> n) {  }
What type of argument does it accept? By looking at its signature, you can see that it accepts a single argument 
whose type is Box<Number>. But what does that mean? Are you allowed to pass in Box<Integer> or Box<Double>, 
as you might expect? The answer is "no", because Box<Integer> and Box<Double> are not subtypes of Box<Number>.
*/		