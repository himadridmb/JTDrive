package thread;

public class ThreadWorld implements Runnable{

	@Override
	public void run() {
		System.out.println(" World");
		//Thread.yield();
	}

}
