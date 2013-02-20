package singleton.advance.readresolve;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/*Unfortunately, both variables have different value of variable "i". Clearly, there are two instances of our class. So, again we are in same problem of multiple instances in application.
 * To solve this issue, we need to include readResolve() method in our DemoSingleton class */

public class SerializationTest {
	static DemoSingleton1 instanceOne = DemoSingleton1.getInstance();

	public static void main(String[] args) {
		try {
			// Serialize to a file
			ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
					"filename.ser"));
			out.writeObject(instanceOne);
			out.close();

			instanceOne.setI(20);

			// Serialize to a file
			ObjectInput in = new ObjectInputStream(new FileInputStream(
					"filename.ser"));
			DemoSingleton1 instanceTwo = (DemoSingleton1) in.readObject();
			in.close();

			System.out.println(instanceOne.getI());
			System.out.println(instanceTwo.getI());

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
