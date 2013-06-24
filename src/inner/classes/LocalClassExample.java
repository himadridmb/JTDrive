package inner.classes;

/*
 * - local class in a method body, a for loop, or an if clause
 * - A local class has access to the members of its enclosing class, static members only, eg: regularExpression
 * - a local class can only access local variables that are declared final, eg: numberLength
 * - You cannot declare an interface inside a block and inside a inner class
 */

public class LocalClassExample {

	static String regularExpression = "[^0-9]";
	int value = 22;
	
	public static void validatePhoneNumber(String phoneNumber1,String phoneNumber2) {
			
		final int numberLength = 10;
		 
				class PhoneNumber
				{
							String formattedPhoneNumber = null;
							//static int abc= 0; //Can not declare static member variable in inner class
							int value = 33;
							
							PhoneNumber(String phoneNumber)
							{
								System.out.println(this.value);
								String currentNumber = phoneNumber.replaceAll(regularExpression, "");
								if (currentNumber.length() == numberLength)
									formattedPhoneNumber = currentNumber;
								else
									formattedPhoneNumber = null;
							}
				
							public String getNumber() {
								return formattedPhoneNumber;
							}
							
							public void printOriginalNumbers() {
				               // System.out.println("Original numbers are " + phoneNumber1 +
			               //     " and " + phoneNumber2);
							}
					}

		PhoneNumber myNumber1 = new PhoneNumber(phoneNumber1);
		PhoneNumber myNumber2 = new PhoneNumber(phoneNumber2);

		// Valid in Java SE 8 and later:

		// myNumber1.printOriginalNumbers();

		if (myNumber1.getNumber() == null)
			System.out.println("First number is invalid");
		else
			System.out.println("First number is " + myNumber1.getNumber());
		if (myNumber2.getNumber() == null)
			System.out.println("Second number is invalid");
		else
			System.out.println("Second number is " + myNumber2.getNumber());

	}
	
	public void sayGoodbyeInEnglish() {
		final int abc = 0;
        class EnglishGoodbye {
            private static final String farewell = "Bye bye";
            public void sayGoodbye() {
                System.out.println(farewell+value+abc);
            }
        }
        EnglishGoodbye myEnglishGoodbye = new EnglishGoodbye();
        myEnglishGoodbye.sayGoodbye();
    }

	public static void main(String... args) {
		validatePhoneNumber("123-456-7890", "456-7890");
		
		new LocalClassExample().sayGoodbyeInEnglish();
	}
}
