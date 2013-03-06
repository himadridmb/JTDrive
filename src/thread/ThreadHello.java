package thread;

public class ThreadHello implements Runnable {

	@Override
	public void run() {
		
		System.out.print("Hello ");
		Thread.yield();
	}

}
