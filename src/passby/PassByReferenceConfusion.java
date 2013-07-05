package passby;

public class PassByReferenceConfusion {

	public static void main(String args[]) {
		Car car = new Car("BMW");
		System.out.println("Brand of Car Inside main() before: " + car.brand);
		printBrand(car);
		System.out.println("Brand of Car Inside main()after: " + car.brand);
	}

	public static void printBrand(Car car) {
		car.brand = "Maruti";
		System.out.println("Brand of Car Inside printBrand(): " + car.brand);
	}

	private static class Car {
		private String brand;

		public Car(String brand) {
			this.brand = brand;
		}

	}
}


/*
If you see change made in method parameter is reflected globally i.e. brand of car is changed in all places
it means one object is used in both method. Well in reality if you pass object as method parameter in Java  
it passes "value of reference" or in simple term object reference or handle to Object in Java. Here reference term 
is entirely different than reference term used in C and C+ which directly points to memory address of variable and 
subject to pointer arithmetic. in Java object can only be accessed by its reference as you can not get memory 
address where object is stored or more precisely there is no method to get value of object by passing memory address.
To conclude everything in Java including primitive and objects are pass by value. In case of object value of reference is passed.
 */
