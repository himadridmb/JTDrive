package threadsafe.test.normal;

/*
 * There are basically three approaches you can take to make an object such as RGBThread thread-safe:
 * 	1. Synchronize critical sections
 * 	2. Make it immutable
 * 	3. Use a thread-safe wrapper
 */

public class RGBColor {

    private int r;
    private int g;
    private int b;

    public RGBColor(int r, int g, int b) {

        checkRGBVals(r, g, b);

        this.r = r;
        this.g = g;
        this.b = b;
    }

    public void setColor(int r, int g, int b) {

        checkRGBVals(r, g, b);

        this.r = r;
        this.g = g;
        this.b = b;
    }

    /**
    * returns color in an array of three ints: R, G, and B
    */
    public int[] getColor() {

        int[] retVal = new int[3];
        retVal[0] = r;
        retVal[1] = g;
        retVal[2] = b;

        return retVal;
    }

    public void invert() {

        r = 255 - r;
        g = 255 - g;
        b = 255 - b;
    }

    private static void checkRGBVals(int r, int g, int b) {

        if (r < 0 || r > 255 || g < 0 || g > 255 ||
            b < 0 || b > 255) {

            throw new IllegalArgumentException();
        }
    }
}

/* 
 	1. Given that thread safety can have a performance cost, dont make every class thread-safe -- only those classes that will actually be used concurrently by multiple threads
	2. Dont avoid making classes thread-safe that need to be thread-safe out of fear of a performance impact
	3. When making an object thread-safe via Approach 1, synchronize only the critical sections of the class
	4. Use an immutable object especially if the object is small or represents a fundamental data type
	5. If you cant change a non-thread-safe class, use a wrapper object
	6. If you are creating a library of classes that will be used in both thread-safe and non-thread-safe requirements, consider making wrappers an option
*/
 