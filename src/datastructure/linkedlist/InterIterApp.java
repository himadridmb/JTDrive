package datastructure.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InterIterApp {
	public static void main(String[] args) throws IOException {
		LinkList theList = new LinkList();
		ListIterator iter1 = theList.getIterator();

		int value;
		iter1.insertAfter(20, 20);
		iter1.insertAfter(40, 40);
		iter1.insertAfter(80, 80);
		iter1.insertBefore(60, 60);

		while (true) {
			System.out.print("Enter first letter of show, reset, ");
			System.out.print("next, get, before, after, delete: ");
			System.out.flush();

			int choice = getChar();

			switch (choice) {
			case 's': // show list
				if (!theList.isEmpty())
					theList.displayList();
				else
					System.out.println("List is empty");
				break;
			case 'r': // reset (to first)
				iter1.reset();
				break;
			case 'n': // advance to next item
				if (!theList.isEmpty() && !iter1.atEnd())
					iter1.nextLink();
				else
					System.out.println("Cant go to next link");
				break;
			case 'g': // get current item
				if (!theList.isEmpty()) {
					value = iter1.getCurrent().getKey();
					System.out.println("Returned " + value);
				} else
					System.out.println("List is empty");
				break;
			case 'b': // insert before current
				System.out.print("Enter value to insert: ");
				System.out.flush();
				value = getInt();
				iter1.insertBefore(value, value);
				break;
			case 'a': // insert after current
				System.out.print("Enter value to insert: ");
				System.out.flush();
				value = getInt();
				iter1.insertAfter(value, value);
				break;
			case 'd':
				if (!theList.isEmpty()) {
					// delete current item
					value = iter1.deleteCurrent();
					System.out.println("Deleted " + value);
				} else
					System.out.println("Cant delete");
				break;
			default:
				System.out.println("Invalid entry");
			}
		}
	}

	public static String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}

	public static char getChar() throws IOException {
		String s = getString();
		return s.charAt(0);
	}

	public static int getInt() throws IOException {
		String s = getString();
		return Integer.parseInt(s);
	}
}
