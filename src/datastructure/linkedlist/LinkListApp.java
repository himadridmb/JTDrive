package datastructure.linkedlist;

public class LinkListApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkList theList = new LinkList();
		theList.sortedInsert(44, 2.99); 
		theList.sortedInsert(22, 4.99); 
		theList.sortedInsert(33, 6.99); 
		theList.sortedInsert(88, 8.99);
		
		theList.displayList();
		
		System.out.println("");
		
		theList.delete(33).displayLink();
		
		System.out.println("");
		
		theList.displayList();
		
		System.out.println("");
		
		while( !theList.isEmpty() )
		{
			Link aLink = theList.deleteFirst();
			System.out.print("Deleted ");
			aLink.displayLink();
			System.out.println("");
		}
		
		theList.displayList();
	}

}
