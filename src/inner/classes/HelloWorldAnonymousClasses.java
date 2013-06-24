package inner.classes;

/*
 * Anonymous classes enable you to make your code more concise. They enable you to declare and 
 * instantiate a class at the same time. They are like local classes except that they do not have a name. 
 * Use them if you need to use a local class only once.
 * 
 * 
 * ***********************************
 * An anonymous class has access to the members of its enclosing class.
*  An anonymous class cannot access local variables in its enclosing scope that are not declared as final or effectively final
*  
*  ************************************
*  
*  Anonymous classes also have the same restrictions as local classes with respect to their members:
			You cannot declare static initializers or member interfaces in an anonymous class.
			An anonymous class can have static members provided that they are constant variables.
	
	Note that you can declare the following in anonymous classes:
			Fields
			Extra methods (even if they do not implement any methods of the supertype)
			Instance initializers
			Local classes
	However, you cannot declare constructors in an anonymous class.
 */
public class HelloWorldAnonymousClasses {

	interface HelloWorld {
		public void greet();

		public void greetSomeone(String someone);
	}

	String membervariable = "Member variable";
	
	public void sayHello() {

		final String localvariable = "";
		class EnglishGreeting implements HelloWorld {
			String name = "world";

			public void greet() {
				greetSomeone("world");
			}

			public void greetSomeone(String someone) {
				name = someone;
				System.out.println("Hello " + name);
			}
		}

		HelloWorld englishGreeting = new EnglishGreeting();

		HelloWorld frenchGreeting = new HelloWorld() {
			String name = "tout le monde";
			
			/*public HelloWorld()
			{
			   you can not declare constructor on annoymous class
			
			}*/
			// static int test = 0; Not ok
			final static int test1 = 0; 
			
			public void greet() {
				greetSomeone("tout le monde");
				System.out.println(membervariable);
				System.out.println(localvariable);
			}

			public void greetSomeone(String someone) {
				name = someone;
				System.out.println("Salut " + name);
			}
		};

		HelloWorld spanishGreeting = new HelloWorld() {
			String name = "mundo";

			public void greet() {
				greetSomeone("mundo");
			}

			public void greetSomeone(String someone) {
				name = someone;
				System.out.println("Hola, " + name);
			}
		};
		englishGreeting.greet();
		frenchGreeting.greetSomeone("Fred");
		spanishGreeting.greet();
	}

	public static void main(String... args) {
		HelloWorldAnonymousClasses myApp = new HelloWorldAnonymousClasses();
		myApp.sayHello();
	}
}
