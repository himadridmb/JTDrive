package utility.finale;
/* if any class prefixed with final keyword, that's mean you can not extends or inherit the class, you can do other operation like creating instance */

public final class FinalClass {
	public void hi()
	{
		System.out.println("Hi From final");
	}
}


/*

The simplest way to avoid problems with concurrency is to share only immutable data between threads. Immutable data is data which cannot changed.

To make a class immutable make

	all its fields final
	the class declared as final
	the this reference is not allowed to escape during construction
	Any fields which refer to mutable data objects are private
	
	have no setter method
	they are never directly returned of otherwise exposed to a caller

	if they are changed internally in the class this change is not visible and has no effect outside of the class
	An immutable class may have some mutable data which is uses to manages its state but from 
	the outside this class nor any attribute of this class can get changed.

	For all mutable fields, e.g. Arrays, that are passed from the outside to the class during the construction phase, 
	the class needs to make a defensive-copy of the elements to make sure that no other object from the outside still can change the data

*/