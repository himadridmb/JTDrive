package threadsafe.test.use.wrappers;

import threadsafe.test.normal.RGBColor;

/* The third approach to making an object thread-safe is to embed that object in a 
 * thread-safe wrapper object. In this approach you leave the original class (which isnt thread-safe)
 * unchanged and create a separate class that is thread-safe. Instances of the new 
 * class serve as thread-safe front ends to instances of the original class.
 * */

public class SafeRGBColor {

    private RGBColor color;

    public SafeRGBColor(int r, int g, int b) {

        color = new RGBColor(r, g, b);
    }

    public synchronized void setColor(int r, int g, int b) {

        color.setColor(r, g, b);
    }

    /**
    * returns color in an array of three ints: R, G, and B
    */
    public synchronized int[] getColor() {

        return color.getColor();
    }

    public synchronized void invert() {

        color.invert();
    }
}
