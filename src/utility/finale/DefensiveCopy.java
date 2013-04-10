package utility.finale;

import java.util.Date;


public class DefensiveCopy {

	/**
	 * @param args
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Date start = new Date();
		Date end = new Date();
		Period p = new Period(start, end);
		p.end().setYear(78);

		System.out.println(p.end());
	}

}


/* 
 * At first glance, this class may appear to be immutable and to enforce the invariant that the start 
 * of a period does not follow its end. It is, however, easy to violate this invariant by exploiting the fact that Date is mutable:
 * 
 * To protect the internals of a Period instance from this sort of attack, it is essential to make a defensive copy of each 
 * mutable parameter to the constructor and to use the copies as components of the Period instance in place of the originals:
 */