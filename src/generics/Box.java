package generics;

/* To declare a bounded type parameter, list the type parameter's name, 
 * followed by the extends keyword, followed by its upper bound */

public class Box<T> {

    private T t;          

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public <U extends Number> void inspect(U u){
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }
    
    public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem) {
        int count = 0;
        for (T e : anArray)
            if (e.compareTo(elem) > 0)
                ++count;
        return count;
    }

    public static void main(String[] args) {
        Box<Double> integerBox = new Box<Double>();
        integerBox.set(2.22);
        integerBox.inspect(2.3); // error: this is still String!
    }
}

/*
 * You cannot use the > operator to compare objects. To fix the problem, use a type parameter bounded by the Comparable<T> interface 
 */