package inner.classes;

public class ShadowTest {

    public int x = 0;
    private int a = 0;
    
    class FirstLevel {

        public int x = 1;
        private int abc = 10;
        private final static String bc = "bc test"; // can not declare only static , you have to declare as static final
        void methodInFirstLevel(int x) {
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x);
            System.out.println("this.a = "+ShadowTest.this.a);
            System.out.println("ShadowTest.this.x = " + ShadowTest.this.x);
        }
        
        /*static void printmessage()
        {
        	// Can not define static method in inner class
        	
        }*/
    }

    public static void main(String... args) {
        ShadowTest st = new ShadowTest();
        
        ShadowTest.FirstLevel fl = st.new FirstLevel();
        fl.methodInFirstLevel(23);
        
        System.out.println(FirstLevel.bc);
        System.out.println(fl.abc);
    }
}
