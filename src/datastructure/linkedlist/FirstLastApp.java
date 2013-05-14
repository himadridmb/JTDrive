package datastructure.linkedlist;

public class FirstLastApp {

	/**
	 * You can implement stack by using linked list, it would be much more efficient and dynamic. Just call insertFirst and deleteFirst
	 * For queue insert Last and delete First
	 */
	public static void main(String[] args) {
		FirstLastList theList = new FirstLastList();
		
		
		theList.insertFirst(22); 
		theList.insertFirst(44); 
		theList.insertFirst(66);
		theList.insertLast(11); 
		theList.insertLast(33); 
		theList.insertLast(55);
		theList.displaylist();
		theList.deleteFirst(); 
		theList.deleteFirst();
		theList.deleteLast();
		theList.displaylist();
	}

}
