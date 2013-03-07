package callback;

/************************************************************
 * For example, we see different forms of callback activity in conjunction with

 * the Delegation Event Model used with GUIs in JDK 1.1,
 * the Observer/Observable concept used in the Model-View-Controller paradigm,
 * the concept of Bound Properties and Constrained Properties in Java Beans , etc.
*************************************************************/
public interface CallBack {
	public void callBack();
}


/* In computer programming, a callback is a piece of executable code that is passed as an 
 * argument to other code, which is expected to call back (execute) the argument at some 
 * convenient time. The invocation may be immediate as in a synchronous callback or it might 
 * happen at later time, as in an asynchronous callback. */

/* There are two types of callbacks: blocking callbacks (also known as synchronous callbacks or just callbacks) 
 * and deferred callbacks (also known as asynchronous callbacks). These two design choices differ in how they 
 * control data flow at runtime. While blocking callbacks are invoked before a function returns (in the C example below: main), 
 * deferred callbacks may be invoked after a function returns. The C example below is a blocking callback. Deferred callbacks 
 * are often used in the context of I/O operations or event handling. While deferred callbacks imply the existence of multiple threads, 
 * blocking callbacks often (but not always) rely on a single thread. This means that blocking callbacks are not a common cause for synchronization.
 */