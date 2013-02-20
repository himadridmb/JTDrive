package utility;

public class EqualsTest {

	/**
	 * Java is a pure object oriented language and every object has one state and location in the memory and equals () and == are related with the state and location of the object.
	 * ****************
	 * in Java. == is an operator and equals() is method. But == operator compare reference or memory location of objects in heap, whether they point to same location or not So 
	 * we use == operator to check memory location or address of two objects are same or not
	 * ****************
	 * we talk about equals() method main purpose is two compare the state of two objects or contents of the object
	 * 
	 *  -	First difference between them is, equals() is a method defined inside the java.lang.Object class and == is one type of 
	 *		operator and you can compare both primitive and objects using equality operator in Java.
	 * -	Second difference between equals and == operator is that, == is used to check reference or memory address of the objects 
	 * 	whether they point to same location or not, and equals() method is used to compare the contents of the object e.g. in case of 
	 * 	comparing String its characters, in case of Integer its there numeric values etc. You can define your own equals method for domain 
	 * 	object as per business rules e.g. two Employes objects are equal if there EmployeeId is same.
	 * -	Third difference between equals and == operator is that, You can not change the behavior of == operator but we can override 
	 * 	equals() method and define the criteria for the objects equality.
	 */
	public static void main(String[] args) {
		String s1=new String("hello");
		String s2=new String("hello");
		
		if(s1==s2) {
		     System.out.println("s1==s2 is TRUE");
		} else{
		     System.out.println("s1==s2 is FALSE");
		}

		if(s1.equals(s2)) {
		      System.out.println("s1.equals(s2) is TRUE");
		} else { 
		      System.out.println("s1.equals(s2) is FALSE");
		}	

	}

	/*If you have not overridden equals() method in  a user defined object,  it will only compare the reference or memory address, 
	 * as defined in default equals() method of java.lang. Object class and return true only if both reference variable points to same 
	 * object. So in a user defined class, both equals() and == operator behave similarly but that may not be logically correct and thats 
	 * why we should always define the equivalence criteria for custom or domain objects.

		Thats all on difference between equals() method and == operator in Java. Both can compare objects for equality but equals() 
		is used for logical and business logic comparison while == mostly for object reference comparison in Java.
	*/
}
